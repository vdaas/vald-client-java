// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/vald/index.proto

// Protobuf Java Version: 3.25.3
package org.vdaas.vald.api.v1.vald;

public final class ValdIndex {
  private ValdIndex() {}
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
      "\n\023v1/vald/index.proto\022\007vald.v1\032\034google/a" +
      "pi/annotations.proto\032\030v1/payload/payload" +
      ".proto2\215\003\n\005Index\022Q\n\tIndexInfo\022\021.payload." +
      "v1.Empty\032\034.payload.v1.Info.Index.Count\"\023" +
      "\202\323\344\223\002\r\022\013/index/info\022V\n\013IndexDetail\022\021.pay" +
      "load.v1.Empty\032\035.payload.v1.Info.Index.De" +
      "tail\"\025\202\323\344\223\002\017\022\r/index/detail\022b\n\017IndexStat" +
      "istics\022\021.payload.v1.Empty\032!.payload.v1.I" +
      "nfo.Index.Statistics\"\031\202\323\344\223\002\023\022\021/index/sta" +
      "tistics\022u\n\025IndexStatisticsDetail\022\021.paylo" +
      "ad.v1.Empty\032\'.payload.v1.Info.Index.Stat" +
      "isticsDetail\" \202\323\344\223\002\032\022\030/index/statistics/" +
      "detailBR\n\032org.vdaas.vald.api.v1.valdB\tVa" +
      "ldIndexP\001Z\'github.com/vdaas/vald/apis/gr" +
      "pc/v1/valdb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
