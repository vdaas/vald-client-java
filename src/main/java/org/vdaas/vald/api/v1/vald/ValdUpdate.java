// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vald/apis/proto/v1/vald/update.proto

package org.vdaas.vald.api.v1.vald;

public final class ValdUpdate {
  private ValdUpdate() {}
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
      "\n$vald/apis/proto/v1/vald/update.proto\022\007" +
      "vald.v1\032#apis/proto/v1/payload/payload.p" +
      "roto\032\034google/api/annotations.proto2\376\001\n\006U" +
      "pdate\022U\n\006Update\022\032.payload.v1.Update.Requ" +
      "est\032\033.payload.v1.Object.Location\"\022\202\323\344\223\002\014" +
      "\"\007/update:\001*\022M\n\014StreamUpdate\022\032.payload.v" +
      "1.Update.Request\032\033.payload.v1.Object.Loc" +
      "ation\"\000(\0010\001\022N\n\013MultiUpdate\022\037.payload.v1." +
      "Update.MultiRequest\032\034.payload.v1.Object." +
      "Locations\"\000BS\n\032org.vdaas.vald.api.v1.val" +
      "dB\nValdUpdateP\001Z\'github.com/vdaas/vald/a" +
      "pis/grpc/v1/valdb\006proto3"
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
