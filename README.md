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
  <artifactId>grpc-api</artifactId>
  <version>x.y.z</version>
</dependency>
<dependency>
  <groupId>io.grpc</groupId>
  <artifactId>grpc-core</artifactId>
  <version>x.y.z</version>
</dependency>
<dependency>
  <groupId>io.grpc</groupId>
  <artifactId>grpc-stub</artifactId>
  <version>x.y.z</version>
</dependency>
<dependency>
  <groupId>io.grpc</groupId>
  <artifactId>grpc-protobuf</artifactId>
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
implementation 'io.grpc:grpc-api:x.y.z'
implementation 'io.grpc:grpc-core:x.y.z'
implementation 'io.grpc:grpc-stub:x.y.z'
implementation 'io.grpc:grpc-protobuf:x.y.z'
implementation 'io.grpc:grpc-netty-shaded:x.y.z'
```

`io.grpc:grpc-netty-shaded` can be replaced by `io.grpc:grpc-okhttp` or `io.grpc:grpc-netty`.

### Example

Please refer the [examples](./examples) directory.

To run,

    $ ./gradlew build
    $ cd examples
    $ ./gradlew shadowJar
    $ java -jar build/libs/vald-client-java-example-0.0.1-all.jar

[![FOSSA Status](https://app.fossa.com/api/projects/custom%2B21465%2Fvald-client-java.svg?type=large)](https://app.fossa.com/projects/custom%2B21465%2Fvald-client-java?ref=badge_large)
