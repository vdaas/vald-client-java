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
      "ayload.proto2\267\002\n\005Agent\022k\n\013CreateIndex\022&." +
      "payload.v1.Control.CreateIndexRequest\032\021." +
      "payload.v1.Empty\"!\202\323\344\223\002\033\022\031/index/create/" +
      "{pool_size}\022F\n\tSaveIndex\022\021.payload.v1.Em" +
      "pty\032\021.payload.v1.Empty\"\023\202\323\344\223\002\r\022\013/index/s" +
      "ave\022y\n\022CreateAndSaveIndex\022&.payload.v1.C" +
      "ontrol.CreateIndexRequest\032\021.payload.v1.E" +
      "mpty\"(\202\323\344\223\002\"\022 /index/createandsave/{pool" +
      "_size}Bc\n org.vdaas.vald.api.v1.agent.co" +
      "reB\tValdAgentP\001Z2github.com/vdaas/vald/a" +
      "pis/grpc/v1/agent/core;coreb\006proto3"
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
