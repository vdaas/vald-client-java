// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/proto/v1/vald/remove.proto

package org.vdaas.vald.api.v1.vald;

public final class ValdRemove {
  private ValdRemove() {}
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
      "\n\037apis/proto/v1/vald/remove.proto\022\007vald." +
      "v1\032#apis/proto/v1/payload/payload.proto\032" +
      "=github.com/googleapis/googleapis/google" +
      "/api/annotations.proto2\225\003\n\006Remove\022U\n\006Rem" +
      "ove\022\032.payload.v1.Remove.Request\032\033.payloa" +
      "d.v1.Object.Location\"\022\202\323\344\223\002\014\"\007/remove:\001*" +
      "\022t\n\021RemoveByTimestamp\022#.payload.v1.Remov" +
      "e.TimestampRequest\032\034.payload.v1.Object.L" +
      "ocations\"\034\202\323\344\223\002\026\"\021/remove/timestamp:\001*\022S" +
      "\n\014StreamRemove\022\032.payload.v1.Remove.Reque" +
      "st\032!.payload.v1.Object.StreamLocation\"\000(" +
      "\0010\001\022i\n\013MultiRemove\022\037.payload.v1.Remove.M" +
      "ultiRequest\032\034.payload.v1.Object.Location" +
      "s\"\033\202\323\344\223\002\025\"\020/remove/multiple:\001*BS\n\032org.vd" +
      "aas.vald.api.v1.valdB\nValdRemoveP\001Z\'gith" +
      "ub.com/vdaas/vald/apis/grpc/v1/valdb\006pro" +
      "to3"
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
