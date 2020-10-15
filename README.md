# vald-client-java

[![Maven Central](https://img.shields.io/maven-central/v/org.vdaas.vald/vald-client-java?style=flat-square)](https://search.maven.org/search?q=g:%22org.vdaas.vald%22%20AND%20a:%22vald-client-java%22)

A Java gRPC client library for [Vald](https://github.com/vdaas/vald).

## Usage

### Dependency

Add `vald-client-java` into your project dependency.

For Maven `pom.xml`,

```xml
<dependency>
    <groupId>org.vdaas.vald</groupId>
    <artifactId>vald-client-java</artifactId>
    <version>x.y.z</version>
</dependency>
<dependency>
  <groupId>io.grpc</groupId>
  <artifactId>grpc-netty-shaded</artifactId>
  <version>x.y.z</version>
</dependency>
```

Gradle `build.gradle`,

```groovy
implementation 'org.vdaas.vald:vald-client-java:x.y.z'
implementation 'io.grpc:grpc-netty-shaded:x.y.z'
```

`io.grpc:grpc-netty-shaded` can be replaced by `io.grpc:grpc-okhttp` or `io.grpc:grpc-netty`.


### Example

```java
import io.grpc.ManagedChannelBuilder;
import org.vdaas.vald.api.v1.vald.InsertGrpc;
import org.vdaas.vald.api.v1.vald.SearchGrpc;
import org.vdaas.vald.api.v1.payload.Insert;
import org.vdaas.vald.api.v1.payload.Search;
import org.vdaas.vald.api.v1.payload.Object;

String host = "gateway.vald.vdaas.org";
int port = 80;

// Generate channel and stubs
ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
InsertGrpc.InsertBlockingStub istub = InsertGrpc.newBlockingStub(channel);
SearchGrpc.SearchBlockingStub sstub = SearchGrpc.newBlockingStub(channel);

// Insert
Object.Vector vec = Object.Vector.newBuilder()
                        .setId("vector_id_1")
                        .addAllVector(Arrays.asList(0.1, 0.2, 0.3...))
                        .build();
Insert.Config icfg = Insert.Config.newBuilder()
                        .setSkipStrictExistCheck(true)
                        .build()
Insert.Request ireq = Insert.Request.newBuilder()
                        .setVector(vec)
                        .setConfig(icfg)
                        .build();
Object.Location ires = istub.insert(ireq);

// Search
Search.Config scfg = Search.Config.newBuilder().
                        .setNum(10)
                        .setRadius(-1.0)
                        .setEpsilon(0.01)
                        .setTimeout(3000000000)
                        .build();
Search.Request sreq = Search.Request.newBuilder()
                        .addAllVector(Arrays.asList(0.1, 0.2, 0.3...))
                        .setConfig(scfg)
                        .build();
Search.Response sres = sstub.search(sreq);
```
