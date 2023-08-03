package org.vdaas.vald.client

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.stub.StreamObserver
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.ClassOrderer
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestClassOrder
import org.junit.jupiter.api.TestMethodOrder
import org.vdaas.vald.api.v1.agent.core.AgentGrpc
import org.vdaas.vald.api.v1.payload.Control
import org.vdaas.vald.api.v1.payload.Empty
import org.vdaas.vald.api.v1.payload.Insert
import org.vdaas.vald.api.v1.payload.Object
import org.vdaas.vald.api.v1.payload.Remove
import org.vdaas.vald.api.v1.payload.Search
import org.vdaas.vald.api.v1.payload.Update
import org.vdaas.vald.api.v1.payload.Upsert
import org.vdaas.vald.api.v1.vald.InsertGrpc
import org.vdaas.vald.api.v1.vald.ObjectGrpc
import org.vdaas.vald.api.v1.vald.RemoveGrpc
import org.vdaas.vald.api.v1.vald.SearchGrpc
import org.vdaas.vald.api.v1.vald.UpdateGrpc
import org.vdaas.vald.api.v1.vald.UpsertGrpc

const val host = "localhost"

const val port = 8081

@Serializable data class Datum(val id: String, val vector: List<Float>)

@TestClassOrder(ClassOrderer.OrderAnnotation::class)
class E2ETests {

    private lateinit var channel: ManagedChannel
    private lateinit var data: List<Datum>

    init {
        readJSON()
    }

    fun readJSON() {
        val text = java.io.File("wordvecs1000.json").readText()
        data =
                Json {
                            isLenient = true
                            ignoreUnknownKeys = true
                        }
                        .decodeFromString<List<Datum>>(ListSerializer(Datum.serializer()), text)
    }

    fun createChannel() {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build()
    }

    fun destroyChannel() {
        channel.shutdown()
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    @Order(1)
    inner class InsertTests {

        private lateinit var stub: InsertGrpc.InsertBlockingStub
        private lateinit var asyncStub: InsertGrpc.InsertStub

        @BeforeEach
        fun setUp() {
            createChannel()
            stub = InsertGrpc.newBlockingStub(channel)
            asyncStub = InsertGrpc.newStub(channel)
        }

        @AfterEach
        fun tearDown() {
            destroyChannel()
        }

        @Test
        @Order(1)
        fun `Test for Insert operation`() {
            val vec =
                    Object.Vector.newBuilder()
                            .setId(data[0].id)
                            .addAllVector(data[0].vector)
                            .build()
            val cfg = Insert.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val req = Insert.Request.newBuilder().setVector(vec).setConfig(cfg).build()
            val result = stub.insert(req)
            assertEquals(1, result.ipsCount)
        }

        @Test
        @Order(2)
        fun `Test for MultiInsert operation`() {
            val cfg = Insert.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val requests =
                    data.subList(1, 10).map {
                        Insert.Request.newBuilder()
                                .setVector(
                                        Object.Vector.newBuilder()
                                                .setId(it.id)
                                                .addAllVector(it.vector)
                                                .build()
                                )
                                .setConfig(cfg)
                                .build()
                    }
            val req = Insert.MultiRequest.newBuilder().addAllRequests(requests).build()
            val results = stub.multiInsert(req)
            results.locationsList.map { assertEquals(1, it.ipsCount) }
        }

        @Test
        @Order(3)
        fun `Test for StreamInsert operation`() {
            val cfg = Insert.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val finishLatch = CountDownLatch(1)
            val requestObserver =
                    asyncStub.streamInsert(
                            object : StreamObserver<Object.StreamLocation> {
                                override fun onNext(sloc: Object.StreamLocation) {
                                    when (sloc.payloadCase) {
                                        Object.StreamLocation.PayloadCase.LOCATION -> {
                                            assertEquals(1, sloc.location.ipsCount)
                                        }
                                        Object.StreamLocation.PayloadCase.STATUS -> {
                                            assertEquals(0, sloc.status.code)
                                        }
                                        else -> throw Exception("unknown payload type")
                                    }
                                }

                                override fun onError(t: Throwable) {
                                    throw t
                                }

                                override fun onCompleted() {
                                    finishLatch.countDown()
                                }
                            }
                    )

            try {
                data.subList(11, 100).map {
                    requestObserver.onNext(
                            Insert.Request.newBuilder()
                                    .setVector(
                                            Object.Vector.newBuilder()
                                                    .setId(it.id)
                                                    .addAllVector(it.vector)
                                                    .build()
                                    )
                                    .setConfig(cfg)
                                    .build()
                    )
                }
            } catch (t: Throwable) {
                requestObserver.onError(t)
                throw t
            }

            requestObserver.onCompleted()
            finishLatch.await(1, TimeUnit.MINUTES)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    @Order(2)
    inner class AgentTests {

        private lateinit var stub: AgentGrpc.AgentBlockingStub
        private lateinit var asyncStub: AgentGrpc.AgentStub

        @BeforeEach
        fun setUp() {
            createChannel()
            stub = AgentGrpc.newBlockingStub(channel)
            asyncStub = AgentGrpc.newStub(channel)
        }

        @AfterEach
        fun tearDown() {
            destroyChannel()
        }

        @Test
        @Order(1)
        fun `Test for CreateIndex operation`() {
            val req = Control.CreateIndexRequest.newBuilder().setPoolSize(10000).build()

            stub.createIndex(req)
        }

        @Test
        @Order(2)
        fun `Test for SaveIndex operation`() {
            stub.saveIndex(Empty.newBuilder().build())
        }

        @Test
        @Order(3)
        fun `Test for IndexInfo operation`() {
            val result = stub.indexInfo(Empty.newBuilder().build())

            assertEquals(100, result.stored)
            assertEquals(0, result.uncommitted)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    @Order(3)
    inner class ObjectTests {

        private lateinit var stub: ObjectGrpc.ObjectBlockingStub
        private lateinit var asyncStub: ObjectGrpc.ObjectStub

        @BeforeEach
        fun setUp() {
            createChannel()
            stub = ObjectGrpc.newBlockingStub(channel)
            asyncStub = ObjectGrpc.newStub(channel)
        }

        @AfterEach
        fun tearDown() {
            destroyChannel()
        }

        @Test
        @Order(1)
        fun `Test for Exists operation`() {
            val req = Object.ID.newBuilder().setId(data[0].id).build()

            stub.exists(req)
        }

        @Test
        @Order(2)
        fun `Test for GetObject operation`() {
            val req =
                    Object.VectorRequest.newBuilder()
                            .setId(Object.ID.newBuilder().setId(data[0].id).build())
                            .build()

            val result = stub.getObject(req)
            assertEquals(result.getId(), data[0].id)
        }

        @Test
        @Order(3)
        fun `Test for StreamGetObject operation`() {
            val finishLatch = CountDownLatch(1)
            val requestObserver =
                    asyncStub.streamGetObject(
                            object : StreamObserver<Object.StreamVector> {
                                override fun onNext(svec: Object.StreamVector) {
                                    when (svec.payloadCase) {
                                        Object.StreamVector.PayloadCase.VECTOR -> {}
                                        Object.StreamVector.PayloadCase.STATUS -> {
                                            assertEquals(0, svec.status.code)
                                        }
                                        else -> throw Exception("unknown payload type")
                                    }
                                }

                                override fun onError(t: Throwable) {
                                    throw t
                                }

                                override fun onCompleted() {
                                    finishLatch.countDown()
                                }
                            }
                    )

            try {
                data.subList(0, 10).map {
                    requestObserver.onNext(
                            Object.VectorRequest.newBuilder()
                                    .setId(Object.ID.newBuilder().setId(it.id).build())
                                    .build()
                    )
                }
            } catch (t: Throwable) {
                requestObserver.onError(t)
                throw t
            }

            requestObserver.onCompleted()
            finishLatch.await(1, TimeUnit.MINUTES)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    @Order(4)
    inner class SearchTests {

        private lateinit var stub: SearchGrpc.SearchBlockingStub
        private lateinit var asyncStub: SearchGrpc.SearchStub

        @BeforeEach
        fun setUp() {
            createChannel()
            stub = SearchGrpc.newBlockingStub(channel)
            asyncStub = SearchGrpc.newStub(channel)
        }

        @AfterEach
        fun tearDown() {
            destroyChannel()
        }

        @Test
        @Order(1)
        fun `Test for Search operation`() {
            val cfg =
                    Search.Config.newBuilder()
                            .setNum(3)
                            .setRadius(-1.0f)
                            .setEpsilon(0.1f)
                            .setTimeout(3000000000L)
                            .build()
            val req =
                    Search.Request.newBuilder().addAllVector(data[0].vector).setConfig(cfg).build()
            val result = stub.search(req)
            assertEquals(3, result.resultsCount)
        }

        @Test
        @Order(2)
        fun `Test for MultiSearch operation`() {
            val cfg =
                    Search.Config.newBuilder()
                            .setNum(3)
                            .setRadius(-1.0f)
                            .setEpsilon(0.1f)
                            .setTimeout(3000000000L)
                            .build()
            val requests =
                    data.subList(1, 10).map {
                        Search.Request.newBuilder().addAllVector(it.vector).setConfig(cfg).build()
                    }
            val req = Search.MultiRequest.newBuilder().addAllRequests(requests).build()
            val results = stub.multiSearch(req)
            results.responsesList.map { assertEquals(3, it.resultsCount) }
        }

        @Test
        @Order(3)
        fun `Test for StreamSearch operation`() {
            val cfg =
                    Search.Config.newBuilder()
                            .setNum(3)
                            .setRadius(-1.0f)
                            .setEpsilon(0.1f)
                            .setTimeout(3000000000L)
                            .build()
            val finishLatch = CountDownLatch(1)
            val requestObserver =
                    asyncStub.streamSearch(
                            object : StreamObserver<Search.StreamResponse> {
                                override fun onNext(sresp: Search.StreamResponse) {
                                    when (sresp.payloadCase) {
                                        Search.StreamResponse.PayloadCase.RESPONSE -> {
                                            assertEquals(3, sresp.response.resultsCount)
                                        }
                                        Search.StreamResponse.PayloadCase.STATUS -> {
                                            assertEquals(0, sresp.status.code)
                                        }
                                        else -> throw Exception("unknown payload type")
                                    }
                                }

                                override fun onError(t: Throwable) {
                                    throw t
                                }

                                override fun onCompleted() {
                                    finishLatch.countDown()
                                }
                            }
                    )

            try {
                data.subList(11, 20).map {
                    requestObserver.onNext(
                            Search.Request.newBuilder()
                                    .addAllVector(it.vector)
                                    .setConfig(cfg)
                                    .build()
                    )
                }
            } catch (t: Throwable) {
                requestObserver.onError(t)
                throw t
            }

            requestObserver.onCompleted()
            finishLatch.await(1, TimeUnit.MINUTES)
        }

        @Test
        @Order(4)
        fun `Test for SearchByID operation`() {
            val cfg =
                    Search.Config.newBuilder()
                            .setNum(3)
                            .setRadius(-1.0f)
                            .setEpsilon(0.1f)
                            .setTimeout(3000000000L)
                            .build()
            val req = Search.IDRequest.newBuilder().setId(data[0].id).setConfig(cfg).build()
            val result = stub.searchByID(req)
            assertEquals(3, result.resultsCount)
        }

        @Test
        @Order(5)
        fun `Test for MultiSearchByID operation`() {
            val cfg =
                    Search.Config.newBuilder()
                            .setNum(3)
                            .setRadius(-1.0f)
                            .setEpsilon(0.1f)
                            .setTimeout(3000000000L)
                            .build()
            val requests =
                    data.subList(1, 10).map {
                        Search.IDRequest.newBuilder().setId(it.id).setConfig(cfg).build()
                    }
            val req = Search.MultiIDRequest.newBuilder().addAllRequests(requests).build()
            val results = stub.multiSearchByID(req)
            results.responsesList.map { assertEquals(3, it.resultsCount) }
        }

        @Test
        @Order(6)
        fun `Test for StreamSearchByID operation`() {
            val cfg =
                    Search.Config.newBuilder()
                            .setNum(3)
                            .setRadius(-1.0f)
                            .setEpsilon(0.1f)
                            .setTimeout(3000000000L)
                            .build()
            val finishLatch = CountDownLatch(1)
            val requestObserver =
                    asyncStub.streamSearchByID(
                            object : StreamObserver<Search.StreamResponse> {
                                override fun onNext(sresp: Search.StreamResponse) {
                                    when (sresp.payloadCase) {
                                        Search.StreamResponse.PayloadCase.RESPONSE -> {
                                            assertEquals(3, sresp.response.resultsCount)
                                        }
                                        Search.StreamResponse.PayloadCase.STATUS -> {
                                            assertEquals(0, sresp.status.code)
                                        }
                                        else -> throw Exception("unknown payload type")
                                    }
                                }

                                override fun onError(t: Throwable) {
                                    throw t
                                }

                                override fun onCompleted() {
                                    finishLatch.countDown()
                                }
                            }
                    )

            try {
                data.subList(11, 20).map {
                    requestObserver.onNext(
                            Search.IDRequest.newBuilder().setId(it.id).setConfig(cfg).build()
                    )
                }
            } catch (t: Throwable) {
                requestObserver.onError(t)
                throw t
            }

            requestObserver.onCompleted()
            finishLatch.await(1, TimeUnit.MINUTES)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    @Order(5)
    inner class UpdateTests {

        private lateinit var stub: UpdateGrpc.UpdateBlockingStub
        private lateinit var asyncStub: UpdateGrpc.UpdateStub

        @BeforeEach
        fun setUp() {
            createChannel()
            stub = UpdateGrpc.newBlockingStub(channel)
            asyncStub = UpdateGrpc.newStub(channel)
        }

        @AfterEach
        fun tearDown() {
            destroyChannel()
        }

        @Test
        @Order(1)
        fun `Test for Update operation`() {
            val vec =
                    Object.Vector.newBuilder()
                            .setId(data[0].id)
                            .addAllVector(data[1].vector)
                            .build()
            val cfg = Update.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val req = Update.Request.newBuilder().setVector(vec).setConfig(cfg).build()
            val result = stub.update(req)
            assertEquals(1, result.ipsCount)
        }

        @Test
        @Order(2)
        fun `Test for MultiUpdate operation`() {
            val cfg = Update.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val requests =
                    (1..10).toList().map {
                        Update.Request.newBuilder()
                                .setVector(
                                        Object.Vector.newBuilder()
                                                .setId(data[it].id)
                                                .addAllVector(data[it + 1].vector)
                                                .build()
                                )
                                .setConfig(cfg)
                                .build()
                    }
            val req = Update.MultiRequest.newBuilder().addAllRequests(requests).build()
            val results = stub.multiUpdate(req)
            results.locationsList.map { assertEquals(1, it.ipsCount) }
        }

        @Test
        @Order(3)
        fun `Test for StreamUpdate operation`() {
            val cfg = Update.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val finishLatch = CountDownLatch(1)
            val requestObserver =
                    asyncStub.streamUpdate(
                            object : StreamObserver<Object.StreamLocation> {
                                override fun onNext(sloc: Object.StreamLocation) {
                                    when (sloc.payloadCase) {
                                        Object.StreamLocation.PayloadCase.LOCATION -> {
                                            assertEquals(1, sloc.location.ipsCount)
                                        }
                                        Object.StreamLocation.PayloadCase.STATUS -> {
                                            assertEquals(0, sloc.status.code)
                                        }
                                        else -> throw Exception("unknown payload type")
                                    }
                                }

                                override fun onError(t: Throwable) {
                                    throw t
                                }

                                override fun onCompleted() {
                                    finishLatch.countDown()
                                }
                            }
                    )

            try {
                (11..20).toList().map {
                    requestObserver.onNext(
                            Update.Request.newBuilder()
                                    .setVector(
                                            Object.Vector.newBuilder()
                                                    .setId(data[it].id)
                                                    .addAllVector(data[it + 1].vector)
                                                    .build()
                                    )
                                    .setConfig(cfg)
                                    .build()
                    )
                }
            } catch (t: Throwable) {
                requestObserver.onError(t)
                throw t
            }

            requestObserver.onCompleted()
            finishLatch.await(1, TimeUnit.MINUTES)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    @Order(6)
    inner class UpsertTests {

        private lateinit var stub: UpsertGrpc.UpsertBlockingStub
        private lateinit var asyncStub: UpsertGrpc.UpsertStub

        @BeforeEach
        fun setUp() {
            createChannel()
            stub = UpsertGrpc.newBlockingStub(channel)
            asyncStub = UpsertGrpc.newStub(channel)
        }

        @AfterEach
        fun tearDown() {
            destroyChannel()
        }

        @Test
        @Order(1)
        fun `Test for Upsert operation`() {
            val vec =
                    Object.Vector.newBuilder()
                            .setId(data[0].id)
                            .addAllVector(data[0].vector)
                            .build()
            val cfg = Upsert.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val req = Upsert.Request.newBuilder().setVector(vec).setConfig(cfg).build()
            val result = stub.upsert(req)
            assertEquals(1, result.ipsCount)
        }

        @Test
        @Order(2)
        fun `Test for MultiUpsert operation`() {
            val cfg = Upsert.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val requests =
                    data.subList(1, 10).map {
                        Upsert.Request.newBuilder()
                                .setVector(
                                        Object.Vector.newBuilder()
                                                .setId(it.id)
                                                .addAllVector(it.vector)
                                                .build()
                                )
                                .setConfig(cfg)
                                .build()
                    }
            val req = Upsert.MultiRequest.newBuilder().addAllRequests(requests).build()
            val results = stub.multiUpsert(req)
            results.locationsList.map { assertEquals(1, it.ipsCount) }
        }

        @Test
        @Order(3)
        fun `Test for StreamUpsert operation`() {
            val cfg = Upsert.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val finishLatch = CountDownLatch(1)
            val requestObserver =
                    asyncStub.streamUpsert(
                            object : StreamObserver<Object.StreamLocation> {
                                override fun onNext(sloc: Object.StreamLocation) {
                                    when (sloc.payloadCase) {
                                        Object.StreamLocation.PayloadCase.LOCATION -> {
                                            assertEquals(1, sloc.location.ipsCount)
                                        }
                                        Object.StreamLocation.PayloadCase.STATUS -> {
                                            assertEquals(0, sloc.status.code)
                                        }
                                        else -> throw Exception("unknown payload type")
                                    }
                                }

                                override fun onError(t: Throwable) {
                                    throw t
                                }

                                override fun onCompleted() {
                                    finishLatch.countDown()
                                }
                            }
                    )

            try {
                data.subList(11, 20).map {
                    requestObserver.onNext(
                            Upsert.Request.newBuilder()
                                    .setVector(
                                            Object.Vector.newBuilder()
                                                    .setId(it.id)
                                                    .addAllVector(it.vector)
                                                    .build()
                                    )
                                    .setConfig(cfg)
                                    .build()
                    )
                }
            } catch (t: Throwable) {
                requestObserver.onError(t)
                throw t
            }

            requestObserver.onCompleted()
            finishLatch.await(1, TimeUnit.MINUTES)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    @Order(7)
    inner class RemoveTests {

        private lateinit var stub: RemoveGrpc.RemoveBlockingStub
        private lateinit var asyncStub: RemoveGrpc.RemoveStub

        @BeforeEach
        fun setUp() {
            createChannel()
            stub = RemoveGrpc.newBlockingStub(channel)
            asyncStub = RemoveGrpc.newStub(channel)
        }

        @AfterEach
        fun tearDown() {
            destroyChannel()
        }

        @Test
        @Order(1)
        fun `Test for Remove operation`() {
            val id = Object.ID.newBuilder().setId(data[0].id).build()
            val cfg = Remove.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val req = Remove.Request.newBuilder().setId(id).setConfig(cfg).build()
            val result = stub.remove(req)
            assertEquals(1, result.ipsCount)
        }

        @Test
        @Order(2)
        fun `Test for MultiRemove operation`() {
            val cfg = Remove.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val requests =
                    data.subList(1, 10).map {
                        Remove.Request.newBuilder()
                                .setId(Object.ID.newBuilder().setId(it.id).build())
                                .setConfig(cfg)
                                .build()
                    }
            val req = Remove.MultiRequest.newBuilder().addAllRequests(requests).build()
            val results = stub.multiRemove(req)
            results.locationsList.map { assertEquals(1, it.ipsCount) }
        }

        @Test
        @Order(3)
        fun `Test for StreamRemove operation`() {
            val cfg = Remove.Config.newBuilder().setSkipStrictExistCheck(true).build()
            val finishLatch = CountDownLatch(1)
            val requestObserver =
                    asyncStub.streamRemove(
                            object : StreamObserver<Object.StreamLocation> {
                                override fun onNext(sloc: Object.StreamLocation) {
                                    when (sloc.payloadCase) {
                                        Object.StreamLocation.PayloadCase.LOCATION -> {
                                            assertEquals(1, sloc.location.ipsCount)
                                        }
                                        Object.StreamLocation.PayloadCase.STATUS -> {
                                            assertEquals(0, sloc.status.code)
                                        }
                                        else -> throw Exception("unknown payload type")
                                    }
                                }

                                override fun onError(t: Throwable) {
                                    throw t
                                }

                                override fun onCompleted() {
                                    finishLatch.countDown()
                                }
                            }
                    )

            try {
                data.subList(11, 20).map {
                    requestObserver.onNext(
                            Remove.Request.newBuilder()
                                    .setId(Object.ID.newBuilder().setId(it.id).build())
                                    .setConfig(cfg)
                                    .build()
                    )
                }
            } catch (t: Throwable) {
                requestObserver.onError(t)
                throw t
            }

            requestObserver.onCompleted()
            finishLatch.await(1, TimeUnit.MINUTES)
        }
    }
}
