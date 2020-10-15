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

Please refer the [examples](./examples) directory.
