package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: vald/apis/proto/v1/vald/filter.proto")
public final class FilterGrpc {

  private FilterGrpc() {}

  public static final String SERVICE_NAME = "vald.v1.Filter";

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

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getStreamSearchObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSearchObject",
      requestType = org.vdaas.vald.api.v1.payload.Search.ObjectRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getStreamSearchObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.ObjectRequest, org.vdaas.vald.api.v1.payload.Search.Response> getStreamSearchObjectMethod;
    if ((getStreamSearchObjectMethod = FilterGrpc.getStreamSearchObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamSearchObjectMethod = FilterGrpc.getStreamSearchObjectMethod) == null) {
          FilterGrpc.getStreamSearchObjectMethod = getStreamSearchObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.ObjectRequest, org.vdaas.vald.api.v1.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearchObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.ObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamSearchObject"))
              .build();
        }
      }
    }
    return getStreamSearchObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getInsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getInsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location> getInsertObjectMethod;
    if ((getInsertObjectMethod = FilterGrpc.getInsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getInsertObjectMethod = FilterGrpc.getInsertObjectMethod) == null) {
          FilterGrpc.getInsertObjectMethod = getInsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("InsertObject"))
              .build();
        }
      }
    }
    return getInsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamInsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamInsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location> getStreamInsertObjectMethod;
    if ((getStreamInsertObjectMethod = FilterGrpc.getStreamInsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamInsertObjectMethod = FilterGrpc.getStreamInsertObjectMethod) == null) {
          FilterGrpc.getStreamInsertObjectMethod = getStreamInsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamInsertObject"))
              .build();
        }
      }
    }
    return getStreamInsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiInsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertObjectMethod;
    if ((getMultiInsertObjectMethod = FilterGrpc.getMultiInsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getMultiInsertObjectMethod = FilterGrpc.getMultiInsertObjectMethod) == null) {
          FilterGrpc.getMultiInsertObjectMethod = getMultiInsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiInsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("MultiInsertObject"))
              .build();
        }
      }
    }
    return getMultiInsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location> getUpdateObjectMethod;
    if ((getUpdateObjectMethod = FilterGrpc.getUpdateObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getUpdateObjectMethod = FilterGrpc.getUpdateObjectMethod) == null) {
          FilterGrpc.getUpdateObjectMethod = getUpdateObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("UpdateObject"))
              .build();
        }
      }
    }
    return getUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpdateObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamUpdateObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location> getStreamUpdateObjectMethod;
    if ((getStreamUpdateObjectMethod = FilterGrpc.getStreamUpdateObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamUpdateObjectMethod = FilterGrpc.getStreamUpdateObjectMethod) == null) {
          FilterGrpc.getStreamUpdateObjectMethod = getStreamUpdateObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamUpdateObject"))
              .build();
        }
      }
    }
    return getStreamUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpdateObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateObjectMethod;
    if ((getMultiUpdateObjectMethod = FilterGrpc.getMultiUpdateObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getMultiUpdateObjectMethod = FilterGrpc.getMultiUpdateObjectMethod) == null) {
          FilterGrpc.getMultiUpdateObjectMethod = getMultiUpdateObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("MultiUpdateObject"))
              .build();
        }
      }
    }
    return getMultiUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location> getUpsertObjectMethod;
    if ((getUpsertObjectMethod = FilterGrpc.getUpsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getUpsertObjectMethod = FilterGrpc.getUpsertObjectMethod) == null) {
          FilterGrpc.getUpsertObjectMethod = getUpsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("UpsertObject"))
              .build();
        }
      }
    }
    return getUpsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamUpsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamUpsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location> getStreamUpsertObjectMethod;
    if ((getStreamUpsertObjectMethod = FilterGrpc.getStreamUpsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getStreamUpsertObjectMethod = FilterGrpc.getStreamUpsertObjectMethod) == null) {
          FilterGrpc.getStreamUpsertObjectMethod = getStreamUpsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("StreamUpsertObject"))
              .build();
        }
      }
    }
    return getStreamUpsertObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpsertObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertObjectMethod;
    if ((getMultiUpsertObjectMethod = FilterGrpc.getMultiUpsertObjectMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getMultiUpsertObjectMethod = FilterGrpc.getMultiUpsertObjectMethod) == null) {
          FilterGrpc.getMultiUpsertObjectMethod = getMultiUpsertObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpsertObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
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
   */
  public static abstract class FilterImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchObject(org.vdaas.vald.api.v1.payload.Search.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchObjectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.ObjectRequest> streamSearchObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamSearchObjectMethod(), responseObserver);
    }

    /**
     */
    public void insertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertObjectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Blob> streamInsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamInsertObjectMethod(), responseObserver);
    }

    /**
     */
    public void multiInsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiInsertObjectMethod(), responseObserver);
    }

    /**
     */
    public void updateObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateObjectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Blob> streamUpdateObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamUpdateObjectMethod(), responseObserver);
    }

    /**
     */
    public void multiUpdateObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiUpdateObjectMethod(), responseObserver);
    }

    /**
     */
    public void upsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertObjectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Blob> streamUpsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamUpsertObjectMethod(), responseObserver);
    }

    /**
     */
    public void multiUpsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiUpsertObjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
                org.vdaas.vald.api.v1.payload.Search.Response>(
                  this, METHODID_SEARCH_OBJECT)))
          .addMethod(
            getStreamSearchObjectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.ObjectRequest,
                org.vdaas.vald.api.v1.payload.Search.Response>(
                  this, METHODID_STREAM_SEARCH_OBJECT)))
          .addMethod(
            getInsertObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_INSERT_OBJECT)))
          .addMethod(
            getStreamInsertObjectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_STREAM_INSERT_OBJECT)))
          .addMethod(
            getMultiInsertObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Locations>(
                  this, METHODID_MULTI_INSERT_OBJECT)))
          .addMethod(
            getUpdateObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_UPDATE_OBJECT)))
          .addMethod(
            getStreamUpdateObjectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_STREAM_UPDATE_OBJECT)))
          .addMethod(
            getMultiUpdateObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Locations>(
                  this, METHODID_MULTI_UPDATE_OBJECT)))
          .addMethod(
            getUpsertObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_UPSERT_OBJECT)))
          .addMethod(
            getStreamUpsertObjectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_STREAM_UPSERT_OBJECT)))
          .addMethod(
            getMultiUpsertObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.Blob,
                org.vdaas.vald.api.v1.payload.Object.Locations>(
                  this, METHODID_MULTI_UPSERT_OBJECT)))
          .build();
    }
  }

  /**
   */
  public static final class FilterStub extends io.grpc.stub.AbstractAsyncStub<FilterStub> {
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
     */
    public void searchObject(org.vdaas.vald.api.v1.payload.Search.ObjectRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.ObjectRequest> streamSearchObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void insertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Blob> streamInsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamInsertObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiInsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiInsertObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Blob> streamUpdateObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpdateObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiUpdateObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Blob> streamUpsertObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpsertObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiUpsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiUpsertObjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FilterBlockingStub extends io.grpc.stub.AbstractBlockingStub<FilterBlockingStub> {
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
     */
    public org.vdaas.vald.api.v1.payload.Search.Response searchObject(org.vdaas.vald.api.v1.payload.Search.ObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Location insertObject(org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return blockingUnaryCall(
          getChannel(), getInsertObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiInsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return blockingUnaryCall(
          getChannel(), getMultiInsertObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Location updateObject(org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpdateObject(org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return blockingUnaryCall(
          getChannel(), getMultiUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Location upsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return blockingUnaryCall(
          getChannel(), getUpsertObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpsertObject(org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return blockingUnaryCall(
          getChannel(), getMultiUpsertObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FilterFutureStub extends io.grpc.stub.AbstractFutureStub<FilterFutureStub> {
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
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> searchObject(
        org.vdaas.vald.api.v1.payload.Search.ObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> insertObject(
        org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiInsertObject(
        org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiInsertObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> updateObject(
        org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiUpdateObject(
        org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> upsertObject(
        org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiUpsertObject(
        org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiUpsertObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_OBJECT = 0;
  private static final int METHODID_INSERT_OBJECT = 1;
  private static final int METHODID_MULTI_INSERT_OBJECT = 2;
  private static final int METHODID_UPDATE_OBJECT = 3;
  private static final int METHODID_MULTI_UPDATE_OBJECT = 4;
  private static final int METHODID_UPSERT_OBJECT = 5;
  private static final int METHODID_MULTI_UPSERT_OBJECT = 6;
  private static final int METHODID_STREAM_SEARCH_OBJECT = 7;
  private static final int METHODID_STREAM_INSERT_OBJECT = 8;
  private static final int METHODID_STREAM_UPDATE_OBJECT = 9;
  private static final int METHODID_STREAM_UPSERT_OBJECT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FilterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FilterImplBase serviceImpl, int methodId) {
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
        case METHODID_INSERT_OBJECT:
          serviceImpl.insertObject((org.vdaas.vald.api.v1.payload.Object.Blob) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_INSERT_OBJECT:
          serviceImpl.multiInsertObject((org.vdaas.vald.api.v1.payload.Object.Blob) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT:
          serviceImpl.updateObject((org.vdaas.vald.api.v1.payload.Object.Blob) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_UPDATE_OBJECT:
          serviceImpl.multiUpdateObject((org.vdaas.vald.api.v1.payload.Object.Blob) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations>) responseObserver);
          break;
        case METHODID_UPSERT_OBJECT:
          serviceImpl.upsertObject((org.vdaas.vald.api.v1.payload.Object.Blob) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_UPSERT_OBJECT:
          serviceImpl.multiUpsertObject((org.vdaas.vald.api.v1.payload.Object.Blob) request,
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
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response>) responseObserver);
        case METHODID_STREAM_INSERT_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamInsertObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
        case METHODID_STREAM_UPDATE_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpdateObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
        case METHODID_STREAM_UPSERT_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpsertObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
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
    private final String methodName;

    FilterMethodDescriptorSupplier(String methodName) {
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
