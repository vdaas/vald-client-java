// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/agent/core/agent.proto

// Protobuf Java Version: 3.25.3
package org.vdaas.vald.api.v1.agent.core;

public final class ValdAgent {
  private ValdAgent() {}
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
      "\n\031v1/agent/core/agent.proto\022\007core.v1\032\034go" +
      "ogle/api/annotations.proto\032\030v1/payload/p" +
      "ayload.proto2\336\003\n\005Agent\022_\n\013CreateIndex\022&." +
      "payload.v1.Control.CreateIndexRequest\032\021." +
      "payload.v1.Empty\"\025\202\323\344\223\002\017\022\r/index/create\022" +
      "F\n\tSaveIndex\022\021.payload.v1.Empty\032\021.payloa" +
      "d.v1.Empty\"\023\202\323\344\223\002\r\022\013/index/save\022m\n\022Creat" +
      "eAndSaveIndex\022&.payload.v1.Control.Creat" +
      "eIndexRequest\032\021.payload.v1.Empty\"\034\202\323\344\223\002\026" +
      "\022\024/index/createandsave\022Q\n\tIndexInfo\022\021.pa" +
      "yload.v1.Empty\032\034.payload.v1.Info.Index.C" +
      "ount\"\023\202\323\344\223\002\r\022\013/index/info\022j\n\014GetTimestam" +
      "p\022&.payload.v1.Object.GetTimestampReques" +
      "t\032\034.payload.v1.Object.Timestamp\"\024\202\323\344\223\002\016\022" +
      "\014/object/metaBc\n org.vdaas.vald.api.v1.a" +
      "gent.coreB\tValdAgentP\001Z2github.com/vdaas" +
      "/vald/apis/grpc/v1/agent/core;coreb\006prot" +
      "o3"
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
