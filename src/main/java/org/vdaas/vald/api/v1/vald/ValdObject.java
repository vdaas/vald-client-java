// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/proto/v1/vald/object.proto

package org.vdaas.vald.api.v1.vald;

public final class ValdObject {
  private ValdObject() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037apis/proto/v1/vald/object.proto\022\007vald." +
      "v1\032#apis/proto/v1/payload/payload.proto\032" +
      "=github.com/googleapis/googleapis/google" +
      "/api/annotations.proto2\204\003\n\006Object\022L\n\006Exi" +
      "sts\022\025.payload.v1.Object.ID\032\025.payload.v1." +
      "Object.ID\"\024\202\323\344\223\002\016\022\014/exists/{id}\022a\n\tGetOb" +
      "ject\022 .payload.v1.Object.VectorRequest\032\031" +
      ".payload.v1.Object.Vector\"\027\202\323\344\223\002\021\022\017/obje" +
      "ct/{id.id}\022Z\n\017StreamGetObject\022 .payload." +
      "v1.Object.VectorRequest\032\037.payload.v1.Obj" +
      "ect.StreamVector\"\000(\0010\001\022m\n\020StreamListObje" +
      "ct\022\037.payload.v1.Object.List.Request\032 .pa" +
      "yload.v1.Object.List.Response\"\024\202\323\344\223\002\016\022\014/" +
      "object/list0\001BS\n\032org.vdaas.vald.api.v1.v" +
      "aldB\nValdObjectP\001Z\'github.com/vdaas/vald" +
      "/apis/grpc/v1/valdb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
