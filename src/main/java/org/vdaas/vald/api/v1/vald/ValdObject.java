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
      "roto\032-github.com/gogo/protobuf/gogoproto" +
      "/gogo.proto\0327github.com/gogo/googleapis/" +
      "google/api/annotations.proto2\225\002\n\006Object\022" +
      "L\n\006Exists\022\025.payload.v1.Object.ID\032\025.paylo" +
      "ad.v1.Object.ID\"\024\202\323\344\223\002\016\022\014/exists/{id}\022a\n" +
      "\tGetObject\022 .payload.v1.Object.VectorReq" +
      "uest\032\031.payload.v1.Object.Vector\"\027\202\323\344\223\002\021\022" +
      "\017/object/{id.id}\022Z\n\017StreamGetObject\022 .pa" +
      "yload.v1.Object.VectorRequest\032\037.payload." +
      "v1.Object.StreamVector\"\000(\0010\001Bg\n\032org.vdaa" +
      "s.vald.api.v1.valdB\nValdObjectP\001Z\'github" +
      ".com/vdaas/vald/apis/grpc/v1/vald\310\342\036\001\320\342\036" +
      "\001\340\342\036\001\300\343\036\001\310\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoRegistration);
    registry.add(com.google.protobuf.GoGoProtos.marshalerAll);
    registry.add(com.google.protobuf.GoGoProtos.messagenameAll);
    registry.add(com.google.protobuf.GoGoProtos.sizerAll);
    registry.add(com.google.protobuf.GoGoProtos.unmarshalerAll);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.vdaas.vald.api.v1.payload.ValdPayload.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
