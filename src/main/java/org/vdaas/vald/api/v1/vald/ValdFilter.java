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
      "roto\032=github.com/googleapis/googleapis/g" +
      "oogle/api/annotations.proto2\254\n\n\006Filter\022h" +
      "\n\014SearchObject\022 .payload.v1.Search.Objec" +
      "tRequest\032\033.payload.v1.Search.Response\"\031\202" +
      "\323\344\223\002\023\"\016/search/object:\001*\022|\n\021MultiSearchO" +
      "bject\022%.payload.v1.Search.MultiObjectReq" +
      "uest\032\034.payload.v1.Search.Responses\"\"\202\323\344\223" +
      "\002\034\"\027/search/object/multiple:\001*\022_\n\022Stream" +
      "SearchObject\022 .payload.v1.Search.ObjectR" +
      "equest\032!.payload.v1.Search.StreamRespons" +
      "e\"\000(\0010\001\022h\n\014InsertObject\022 .payload.v1.Ins" +
      "ert.ObjectRequest\032\033.payload.v1.Object.Lo" +
      "cation\"\031\202\323\344\223\002\023\"\016/insert/object:\001*\022_\n\022Str" +
      "eamInsertObject\022 .payload.v1.Insert.Obje" +
      "ctRequest\032!.payload.v1.Object.StreamLoca" +
      "tion\"\000(\0010\001\022|\n\021MultiInsertObject\022%.payloa" +
      "d.v1.Insert.MultiObjectRequest\032\034.payload" +
      ".v1.Object.Locations\"\"\202\323\344\223\002\034\"\027/insert/ob" +
      "ject/multiple:\001*\022h\n\014UpdateObject\022 .paylo" +
      "ad.v1.Update.ObjectRequest\032\033.payload.v1." +
      "Object.Location\"\031\202\323\344\223\002\023\"\016/update/object:" +
      "\001*\022_\n\022StreamUpdateObject\022 .payload.v1.Up" +
      "date.ObjectRequest\032!.payload.v1.Object.S" +
      "treamLocation\"\000(\0010\001\022|\n\021MultiUpdateObject" +
      "\022%.payload.v1.Update.MultiObjectRequest\032" +
      "\034.payload.v1.Object.Locations\"\"\202\323\344\223\002\034\"\027/" +
      "update/object/multiple:\001*\022h\n\014UpsertObjec" +
      "t\022 .payload.v1.Upsert.ObjectRequest\032\033.pa" +
      "yload.v1.Object.Location\"\031\202\323\344\223\002\023\"\016/upser" +
      "t/object:\001*\022_\n\022StreamUpsertObject\022 .payl" +
      "oad.v1.Upsert.ObjectRequest\032!.payload.v1" +
      ".Object.StreamLocation\"\000(\0010\001\022|\n\021MultiUps" +
      "ertObject\022%.payload.v1.Upsert.MultiObjec" +
      "tRequest\032\034.payload.v1.Object.Locations\"\"" +
      "\202\323\344\223\002\034\"\027/upsert/object/multiple:\001*BS\n\032or" +
      "g.vdaas.vald.api.v1.valdB\nValdFilterP\001Z\'" +
      "github.com/vdaas/vald/apis/grpc/v1/valdb" +
      "\006proto3"
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
