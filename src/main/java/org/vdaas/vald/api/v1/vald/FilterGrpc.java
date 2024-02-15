package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Filter service provides ways to connect to Vald through filter.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: v1/vald/filter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FilterGrpc {

  private FilterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Filter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getSearchObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchObject",
      requestType = org.vdaas.vald.api.v1.payload.Search.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getSearchObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest, org.vdaas.vald.api.v1.payload.Search.Response> getSearchObjectMethod;
    if ((getSearchObjectMethod = FilterGrpc.getSearchObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getSearchObjectMethod = FilterGrpc.getSearchObjectMethod) == null) {
          FilterGrpc.getSearchObjectMethod = getSearchObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.ObjectRequest, org.vdaas.vald.api.v1.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("SearchObject"))
              .build();
        }
      }
    }
    return getSearchObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiSearchObject",
      requestType = org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Responses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchObjectMethod;
    if ((getMultiSearchObjectMethod = FilterGrpc.getMultiSearchObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getMultiSearchObjectMethod = FilterGrpc.getMultiSearchObjectMethod) == null) {
          FilterGrpc.getMultiSearchObjectMethod = getMultiSearchObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Search.Responses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiSearchObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Responses.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("MultiSearchObject"))
              .build();
        }
      }
    }
    return getMultiSearchObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSearchObject",
      requestType = org.vdaas.vald.api.v1.payload.Search.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest, org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchObjectMethod;
    if ((getStreamSearchObjectMethod = FilterGrpc.getStreamSearchObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamSearchObjectMethod = FilterGrpc.getStreamSearchObjectMethod) == null) {
          FilterGrpc.getStreamSearchObjectMethod = getStreamSearchObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.ObjectRequest, org.vdaas.vald.api.v1.payload.Search.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearchObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamSearchObject"))
              .build();
        }
      }
    }
    return getStreamSearchObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getInsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Insert.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getInsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.Location> getInsertObjectMethod;
    if ((getInsertObjectMethod = FilterGrpc.getInsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getInsertObjectMethod = FilterGrpc.getInsertObjectMethod) == null) {
          FilterGrpc.getInsertObjectMethod = getInsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Insert.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("InsertObject"))
              .build();
        }
      }
    }
    return getInsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamInsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Insert.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamInsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamInsertObjectMethod;
    if ((getStreamInsertObjectMethod = FilterGrpc.getStreamInsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamInsertObjectMethod = FilterGrpc.getStreamInsertObjectMethod) == null) {
          FilterGrpc.getStreamInsertObjectMethod = getStreamInsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.StreamLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Insert.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamLocation.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamInsertObject"))
              .build();
        }
      }
    }
    return getStreamInsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiInsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertObjectMethod;
    if ((getMultiInsertObjectMethod = FilterGrpc.getMultiInsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getMultiInsertObjectMethod = FilterGrpc.getMultiInsertObjectMethod) == null) {
          FilterGrpc.getMultiInsertObjectMethod = getMultiInsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiInsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("MultiInsertObject"))
              .build();
        }
      }
    }
    return getMultiInsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObject",
      requestType = org.vdaas.vald.api.v1.payload.Update.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.Location> getUpdateObjectMethod;
    if ((getUpdateObjectMethod = FilterGrpc.getUpdateObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getUpdateObjectMethod = FilterGrpc.getUpdateObjectMethod) == null) {
          FilterGrpc.getUpdateObjectMethod = getUpdateObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Update.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Update.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("UpdateObject"))
              .build();
        }
      }
    }
    return getUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpdateObject",
      requestType = org.vdaas.vald.api.v1.payload.Update.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpdateObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpdateObjectMethod;
    if ((getStreamUpdateObjectMethod = FilterGrpc.getStreamUpdateObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamUpdateObjectMethod = FilterGrpc.getStreamUpdateObjectMethod) == null) {
          FilterGrpc.getStreamUpdateObjectMethod = getStreamUpdateObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Update.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.StreamLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Update.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamLocation.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamUpdateObject"))
              .build();
        }
      }
    }
    return getStreamUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpdateObject",
      requestType = org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateObjectMethod;
    if ((getMultiUpdateObjectMethod = FilterGrpc.getMultiUpdateObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getMultiUpdateObjectMethod = FilterGrpc.getMultiUpdateObjectMethod) == null) {
          FilterGrpc.getMultiUpdateObjectMethod = getMultiUpdateObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("MultiUpdateObject"))
              .build();
        }
      }
    }
    return getMultiUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.Location> getUpsertObjectMethod;
    if ((getUpsertObjectMethod = FilterGrpc.getUpsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getUpsertObjectMethod = FilterGrpc.getUpsertObjectMethod) == null) {
          FilterGrpc.getUpsertObjectMethod = getUpsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("UpsertObject"))
              .build();
        }
      }
    }
    return getUpsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpsertObjectMethod;
    if ((getStreamUpsertObjectMethod = FilterGrpc.getStreamUpsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamUpsertObjectMethod = FilterGrpc.getStreamUpsertObjectMethod) == null) {
          FilterGrpc.getStreamUpsertObjectMethod = getStreamUpsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest, org.vdaas.vald.api.v1.payload.Object.StreamLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamLocation.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamUpsertObject"))
              .build();
        }
      }
    }
    return getStreamUpsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertObjectMethod;
    if ((getMultiUpsertObjectMethod = FilterGrpc.getMultiUpsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getMultiUpsertObjectMethod = FilterGrpc.getMultiUpsertObjectMethod) == null) {
          FilterGrpc.getMultiUpsertObjectMethod = getMultiUpsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("MultiUpsertObject"))
              .build();
        }
      }
    }
    return getMultiUpsertObjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FilterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilterStub>() {
        @java.lang.Override
        public FilterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilterStub(channel, callOptions);
        }
      };
    return FilterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FilterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilterBlockingStub>() {
        @java.lang.Override
        public FilterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilterBlockingStub(channel, callOptions);
        }
      };
    return FilterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FilterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilterFutureStub>() {
        @java.lang.Override
        public FilterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilterFutureStub(channel, callOptions);
        }
      };
    return FilterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Filter service provides ways to connect to Vald through filter.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * A method to search object.
     * </pre>
     */
    default void searchObject(org.vdaas.vald.api.v1.payload.Search.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to search multiple objects.
     * </pre>
     */
    default void multiSearchObject(org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiSearchObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to search object by bidirectional streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.ObjectRequest> streamSearchObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamSearchObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method insert object.
     * </pre>
     */
    default void insertObject(org.vdaas.vald.api.v1.payload.Insert.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Represent the streaming RPC to insert object by bidirectional streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest> streamInsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamInsertObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to insert multiple objects.
     * </pre>
     */
    default void multiInsertObject(org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiInsertObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to update object.
     * </pre>
     */
    default void updateObject(org.vdaas.vald.api.v1.payload.Update.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to update object by bidirectional streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Update.ObjectRequest> streamUpdateObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamUpdateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to update multiple objects.
     * </pre>
     */
    default void multiUpdateObject(org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiUpdateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to upsert object.
     * </pre>
     */
    default void upsertObject(org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to upsert object by bidirectional streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest> streamUpsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamUpsertObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to upsert multiple objects.
     * </pre>
     */
    default void multiUpsertObject(org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiUpsertObjectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Filter.
   * <pre>
   * Filter service provides ways to connect to Vald through filter.
   * </pre>
   */
  public static abstract class FilterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FilterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Filter.
   * <pre>
   * Filter service provides ways to connect to Vald through filter.
   * </pre>
   */
  public static final class FilterStub
      extends io.grpc.stub.AbstractAsyncStub<FilterStub> {
    private FilterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilterStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to search object.
     * </pre>
     */
    public void searchObject(org.vdaas.vald.api.v1.payload.Search.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to search multiple objects.
     * </pre>
     */
    public void multiSearchObject(org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiSearchObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to search object by bidirectional streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.ObjectRequest> streamSearchObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method insert object.
     * </pre>
     */
    public void insertObject(org.vdaas.vald.api.v1.payload.Insert.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Represent the streaming RPC to insert object by bidirectional streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Insert.ObjectRequest> streamInsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamInsertObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to insert multiple objects.
     * </pre>
     */
    public void multiInsertObject(org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiInsertObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to update object.
     * </pre>
     */
    public void updateObject(org.vdaas.vald.api.v1.payload.Update.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to update object by bidirectional streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Update.ObjectRequest> streamUpdateObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpdateObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to update multiple objects.
     * </pre>
     */
    public void multiUpdateObject(org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to upsert object.
     * </pre>
     */
    public void upsertObject(org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to upsert object by bidirectional streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest> streamUpsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpsertObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to upsert multiple objects.
     * </pre>
     */
    public void multiUpsertObject(org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiUpsertObjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Filter.
   * <pre>
   * Filter service provides ways to connect to Vald through filter.
   * </pre>
   */
  public static final class FilterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FilterBlockingStub> {
    private FilterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to search object.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Response searchObject(org.vdaas.vald.api.v1.payload.Search.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to search multiple objects.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Responses multiSearchObject(org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiSearchObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method insert object.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location insertObject(org.vdaas.vald.api.v1.payload.Insert.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to insert multiple objects.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiInsertObject(org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiInsertObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to update object.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location updateObject(org.vdaas.vald.api.v1.payload.Update.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to update multiple objects.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpdateObject(org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to upsert object.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location upsertObject(org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to upsert multiple objects.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpsertObject(org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiUpsertObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Filter.
   * <pre>
   * Filter service provides ways to connect to Vald through filter.
   * </pre>
   */
  public static final class FilterFutureStub
      extends io.grpc.stub.AbstractFutureStub<FilterFutureStub> {
    private FilterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to search object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> searchObject(
        org.vdaas.vald.api.v1.payload.Search.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to search multiple objects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Responses> multiSearchObject(
        org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiSearchObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method insert object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> insertObject(
        org.vdaas.vald.api.v1.payload.Insert.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to insert multiple objects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiInsertObject(
        org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiInsertObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to update object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> updateObject(
        org.vdaas.vald.api.v1.payload.Update.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to update multiple objects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiUpdateObject(
        org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to upsert object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> upsertObject(
        org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to upsert multiple objects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiUpsertObject(
        org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiUpsertObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_OBJECT = 0;
  private static final int METHODID_MULTI_SEARCH_OBJECT = 1;
  private static final int METHODID_INSERT_OBJECT = 2;
  private static final int METHODID_MULTI_INSERT_OBJECT = 3;
  private static final int METHODID_UPDATE_OBJECT = 4;
  private static final int METHODID_MULTI_UPDATE_OBJECT = 5;
  private static final int METHODID_UPSERT_OBJECT = 6;
  private static final int METHODID_MULTI_UPSERT_OBJECT = 7;
  private static final int METHODID_STREAM_SEARCH_OBJECT = 8;
  private static final int METHODID_STREAM_INSERT_OBJECT = 9;
  private static final int METHODID_STREAM_UPDATE_OBJECT = 10;
  private static final int METHODID_STREAM_UPSERT_OBJECT = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_OBJECT:
          serviceImpl.searchObject((org.vdaas.vald.api.v1.payload.Search.ObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response>) responseObserver);
          break;
        case METHODID_MULTI_SEARCH_OBJECT:
          serviceImpl.multiSearchObject((org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses>) responseObserver);
          break;
        case METHODID_INSERT_OBJECT:
          serviceImpl.insertObject((org.vdaas.vald.api.v1.payload.Insert.ObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_INSERT_OBJECT:
          serviceImpl.multiInsertObject((org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT:
          serviceImpl.updateObject((org.vdaas.vald.api.v1.payload.Update.ObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_UPDATE_OBJECT:
          serviceImpl.multiUpdateObject((org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations>) responseObserver);
          break;
        case METHODID_UPSERT_OBJECT:
          serviceImpl.upsertObject((org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_UPSERT_OBJECT:
          serviceImpl.multiUpsertObject((org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_SEARCH_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamSearchObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse>) responseObserver);
        case METHODID_STREAM_INSERT_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamInsertObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation>) responseObserver);
        case METHODID_STREAM_UPDATE_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpdateObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation>) responseObserver);
        case METHODID_STREAM_UPSERT_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpsertObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSearchObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Search.Response>(
                service, METHODID_SEARCH_OBJECT)))
        .addMethod(
          getMultiSearchObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.MultiObjectRequest,
              org.vdaas.vald.api.v1.payload.Search.Responses>(
                service, METHODID_MULTI_SEARCH_OBJECT)))
        .addMethod(
          getStreamSearchObjectMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Search.StreamResponse>(
                service, METHODID_STREAM_SEARCH_OBJECT)))
        .addMethod(
          getInsertObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Insert.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_INSERT_OBJECT)))
        .addMethod(
          getStreamInsertObjectMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Insert.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                service, METHODID_STREAM_INSERT_OBJECT)))
        .addMethod(
          getMultiInsertObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Insert.MultiObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_MULTI_INSERT_OBJECT)))
        .addMethod(
          getUpdateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Update.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_UPDATE_OBJECT)))
        .addMethod(
          getStreamUpdateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Update.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                service, METHODID_STREAM_UPDATE_OBJECT)))
        .addMethod(
          getMultiUpdateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Update.MultiObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_MULTI_UPDATE_OBJECT)))
        .addMethod(
          getUpsertObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_UPSERT_OBJECT)))
        .addMethod(
          getStreamUpsertObjectMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Upsert.ObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                service, METHODID_STREAM_UPSERT_OBJECT)))
        .addMethod(
          getMultiUpsertObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Upsert.MultiObjectRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_MULTI_UPSERT_OBJECT)))
        .build();
  }

  private static abstract class FilterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FilterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdFilter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Filter");
    }
  }

  private static final class FilterFileDescriptorSupplier
      extends FilterBaseDescriptorSupplier {
    FilterFileDescriptorSupplier() {}
  }

  private static final class FilterMethodDescriptorSupplier
      extends FilterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FilterMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FilterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FilterFileDescriptorSupplier())
              .addMethod(getSearchObjectMethod())
              .addMethod(getMultiSearchObjectMethod())
              .addMethod(getStreamSearchObjectMethod())
              .addMethod(getInsertObjectMethod())
              .addMethod(getStreamInsertObjectMethod())
              .addMethod(getMultiInsertObjectMethod())
              .addMethod(getUpdateObjectMethod())
              .addMethod(getStreamUpdateObjectMethod())
              .addMethod(getMultiUpdateObjectMethod())
              .addMethod(getUpsertObjectMethod())
              .addMethod(getStreamUpsertObjectMethod())
              .addMethod(getMultiUpsertObjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
