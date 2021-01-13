package org.vdaas.vald;

import java.util.Arrays;
import java.util.List;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import org.vdaas.vald.api.v1.vald.InsertGrpc;
import org.vdaas.vald.api.v1.vald.SearchGrpc;
import org.vdaas.vald.api.v1.vald.UpdateGrpc;
import org.vdaas.vald.api.v1.vald.RemoveGrpc;

import org.vdaas.vald.api.v1.payload.Insert;
import org.vdaas.vald.api.v1.payload.Search;
import org.vdaas.vald.api.v1.payload.Update;
import org.vdaas.vald.api.v1.payload.Remove;
import org.vdaas.vald.api.v1.payload.Object;

public class Client {
    ManagedChannel channel;
    InsertGrpc.InsertBlockingStub istub;
    SearchGrpc.SearchBlockingStub sstub;
    UpdateGrpc.UpdateBlockingStub ustub;
    RemoveGrpc.RemoveBlockingStub rstub;

    public static Client create(String host, int port) {
        Client client = new Client();

        // Generate channel and stubs
        client.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        client.istub = InsertGrpc.newBlockingStub(client.channel);
        client.sstub = SearchGrpc.newBlockingStub(client.channel);
        client.ustub = UpdateGrpc.newBlockingStub(client.channel);
        client.rstub = RemoveGrpc.newBlockingStub(client.channel);

        return client;
    }

    public void close() {
        // Close channel
        channel.shutdown();
    }

    public Object.Location insert(String id, List<Float> vec) {
        // Insert
        Object.Vector ovec = Object.Vector.newBuilder()
                                .setId(id)
                                .addAllVector(vec)
                                .build();
        Insert.Config icfg = Insert.Config.newBuilder()
                                .setSkipStrictExistCheck(true)
                                .build();
        Insert.Request ireq = Insert.Request.newBuilder()
                                .setVector(ovec)
                                .setConfig(icfg)
                                .build();
        return istub.insert(ireq);
    }

    public Search.Response search(List<Float> vec) {
        // Search
        Search.Config scfg = Search.Config.newBuilder()
                                .setNum(10)
                                .setRadius(-1.0f)
                                .setEpsilon(0.01f)
                                .setTimeout(3000000000L)
                                .build();
        Search.Request sreq = Search.Request.newBuilder()
                                .addAllVector(vec)
                                .setConfig(scfg)
                                .build();
        return sstub.search(sreq);
    }

    public Object.Location update(String id, List<Float> vec) {
        // Update
        Object.Vector ovec = Object.Vector.newBuilder()
                                .setId(id)
                                .addAllVector(vec)
                                .build();
        Update.Config ucfg = Update.Config.newBuilder()
                                .setSkipStrictExistCheck(true)
                                .build();
        Update.Request ureq = Update.Request.newBuilder()
                                .setVector(ovec)
                                .setConfig(ucfg)
                                .build();
        return ustub.update(ureq);
    }

    public Object.Location remove(String id) {
        // Remove
        Remove.Config rcfg = Remove.Config.newBuilder()
                                .setSkipStrictExistCheck(true)
                                .build();
        Remove.Request rreq = Remove.Request.newBuilder()
                                .setId(Object.ID.newBuilder().setId(id).build())
                                .setConfig(rcfg)
                                .build();
        return rstub.remove(rreq);
    }

    public static void main(String[] args) throws Exception {
        Client client = Client.create("localhost", 8081);

        Object.Location ires = client.insert("vector_id_1", Arrays.asList(0.1f, 0.2f, 0.3f));
        System.out.println(ires.toString());

        Search.Response sres = client.search(Arrays.asList(0.1f, 0.2f, 0.3f));
        System.out.println(sres.toString());

        Object.Location ures = client.update("vector_id_1", Arrays.asList(0.1f, 0.2f, 0.3f));
        System.out.println(ures.toString());

        Object.Location rres = client.remove("vector_id_1");
        System.out.println(rres.toString());

        client.close();
    }
}
