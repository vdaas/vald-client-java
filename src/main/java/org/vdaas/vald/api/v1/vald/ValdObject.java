// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vald/apis/proto/v1/vald/object.proto

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
      "\n$vald/apis/proto/v1/vald/object.proto\022\007" +
      "vald.v1\032#apis/proto/v1/payload/payload.p" +
      "roto\032\034google/api/annotations.proto2\366\001\n\006O" +
      "bject\022L\n\006Exists\022\025.payload.v1.Object.ID\032\025" +
      ".payload.v1.Object.ID\"\024\202\323\344\223\002\016\022\014/exists/{" +
      "id}\022S\n\tGetObject\022\025.payload.v1.Object.ID\032" +
      "\031.payload.v1.Object.Vector\"\024\202\323\344\223\002\016\022\014/obj" +
      "ect/{id}\022I\n\017StreamGetObject\022\025.payload.v1" +
      ".Object.ID\032\031.payload.v1.Object.Vector\"\000(" +
      "\0010\001BS\n\032org.vdaas.vald.api.v1.valdB\nValdO" +
      "bjectP\001Z\'github.com/vdaas/vald/apis/grpc" +
      "/v1/valdb\006proto3"
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
