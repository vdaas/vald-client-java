// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vald/apis/proto/v1/vald/filter.proto

package org.vdaas.vald.api.v1.vald;

public final class ValdFilter {
  private ValdFilter() {}
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
      "\n$vald/apis/proto/v1/vald/filter.proto\022\007" +
      "vald.v1\032#apis/proto/v1/payload/payload.p" +
      "roto\032\034google/api/annotations.proto2\320\007\n\006F" +
      "ilter\022h\n\014SearchObject\022 .payload.v1.Searc" +
      "h.ObjectRequest\032\033.payload.v1.Search.Resp" +
      "onse\"\031\202\323\344\223\002\023\"\016/search/object:\001*\022Y\n\022Strea" +
      "mSearchObject\022 .payload.v1.Search.Object" +
      "Request\032\033.payload.v1.Search.Response\"\000(\001" +
      "0\001\022_\n\014InsertObject\022\027.payload.v1.Object.B" +
      "lob\032\033.payload.v1.Object.Location\"\031\202\323\344\223\002\023" +
      "\"\016/insert/object:\001*\022P\n\022StreamInsertObjec" +
      "t\022\027.payload.v1.Object.Blob\032\033.payload.v1." +
      "Object.Location\"\000(\0010\001\022L\n\021MultiInsertObje" +
      "ct\022\027.payload.v1.Object.Blob\032\034.payload.v1" +
      ".Object.Locations\"\000\022_\n\014UpdateObject\022\027.pa" +
      "yload.v1.Object.Blob\032\033.payload.v1.Object" +
      ".Location\"\031\202\323\344\223\002\023\"\016/update/object:\001*\022P\n\022" +
      "StreamUpdateObject\022\027.payload.v1.Object.B" +
      "lob\032\033.payload.v1.Object.Location\"\000(\0010\001\022L" +
      "\n\021MultiUpdateObject\022\027.payload.v1.Object." +
      "Blob\032\034.payload.v1.Object.Locations\"\000\022_\n\014" +
      "UpsertObject\022\027.payload.v1.Object.Blob\032\033." +
      "payload.v1.Object.Location\"\031\202\323\344\223\002\023\"\016/ups" +
      "ert/object:\001*\022P\n\022StreamUpsertObject\022\027.pa" +
      "yload.v1.Object.Blob\032\033.payload.v1.Object" +
      ".Location\"\000(\0010\001\022L\n\021MultiUpsertObject\022\027.p" +
      "ayload.v1.Object.Blob\032\034.payload.v1.Objec" +
      "t.Locations\"\000BS\n\032org.vdaas.vald.api.v1.v" +
      "aldB\nValdFilterP\001Z\'github.com/vdaas/vald" +
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
