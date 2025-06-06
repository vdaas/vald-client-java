package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Overview
 * Object Service is responsible for getting inserted vectors and checking whether vectors are inserted into the `vald-agent`.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/vald/object.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ObjectGrpc {

  private ObjectGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Object";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.ID> getExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exists",
      requestType = org.vdaas.vald.api.v1.payload.Object.ID.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.ID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.ID> getExistsMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.ID> getExistsMethod;
    if ((getExistsMethod = ObjectGrpc.getExistsMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getExistsMethod = ObjectGrpc.getExistsMethod) == null) {
          ObjectGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.ID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.ID.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("Exists"))
              .build();
        }
      }
    }
    return getExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.VectorRequest,
      org.vdaas.vald.api.v1.payload.Object.Vector> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.VectorRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Vector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.VectorRequest,
      org.vdaas.vald.api.v1.payload.Object.Vector> getGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.VectorRequest, org.vdaas.vald.api.v1.payload.Object.Vector> getGetObjectMethod;
    if ((getGetObjectMethod = ObjectGrpc.getGetObjectMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getGetObjectMethod = ObjectGrpc.getGetObjectMethod) == null) {
          ObjectGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.VectorRequest, org.vdaas.vald.api.v1.payload.Object.Vector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.VectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Vector.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.VectorRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamVector> getStreamGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamGetObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.VectorRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamVector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.VectorRequest,
      org.vdaas.vald.api.v1.payload.Object.StreamVector> getStreamGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.VectorRequest, org.vdaas.vald.api.v1.payload.Object.StreamVector> getStreamGetObjectMethod;
    if ((getStreamGetObjectMethod = ObjectGrpc.getStreamGetObjectMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getStreamGetObjectMethod = ObjectGrpc.getStreamGetObjectMethod) == null) {
          ObjectGrpc.getStreamGetObjectMethod = getStreamGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.VectorRequest, org.vdaas.vald.api.v1.payload.Object.StreamVector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamGetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.VectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamVector.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("StreamGetObject"))
              .build();
        }
      }
    }
    return getStreamGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.List.Request,
      org.vdaas.vald.api.v1.payload.Object.List.Response> getStreamListObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamListObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.List.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.List.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.List.Request,
      org.vdaas.vald.api.v1.payload.Object.List.Response> getStreamListObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.List.Request, org.vdaas.vald.api.v1.payload.Object.List.Response> getStreamListObjectMethod;
    if ((getStreamListObjectMethod = ObjectGrpc.getStreamListObjectMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getStreamListObjectMethod = ObjectGrpc.getStreamListObjectMethod) == null) {
          ObjectGrpc.getStreamListObjectMethod = getStreamListObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.List.Request, org.vdaas.vald.api.v1.payload.Object.List.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamListObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.List.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.List.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("StreamListObject"))
              .build();
        }
      }
    }
    return getStreamListObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.TimestampRequest,
      org.vdaas.vald.api.v1.payload.Object.Timestamp> getGetTimestampMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTimestamp",
      requestType = org.vdaas.vald.api.v1.payload.Object.TimestampRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Timestamp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.TimestampRequest,
      org.vdaas.vald.api.v1.payload.Object.Timestamp> getGetTimestampMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.TimestampRequest, org.vdaas.vald.api.v1.payload.Object.Timestamp> getGetTimestampMethod;
    if ((getGetTimestampMethod = ObjectGrpc.getGetTimestampMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getGetTimestampMethod = ObjectGrpc.getGetTimestampMethod) == null) {
          ObjectGrpc.getGetTimestampMethod = getGetTimestampMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.TimestampRequest, org.vdaas.vald.api.v1.payload.Object.Timestamp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTimestamp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.TimestampRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Timestamp.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("GetTimestamp"))
              .build();
        }
      }
    }
    return getGetTimestampMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectStub>() {
        @java.lang.Override
        public ObjectStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectStub(channel, callOptions);
        }
      };
    return ObjectStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ObjectBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectBlockingV2Stub>() {
        @java.lang.Override
        public ObjectBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectBlockingV2Stub(channel, callOptions);
        }
      };
    return ObjectBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectBlockingStub>() {
        @java.lang.Override
        public ObjectBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectBlockingStub(channel, callOptions);
        }
      };
    return ObjectBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectFutureStub>() {
        @java.lang.Override
        public ObjectFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectFutureStub(channel, callOptions);
        }
      };
    return ObjectFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Overview
   * Object Service is responsible for getting inserted vectors and checking whether vectors are inserted into the `vald-agent`.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Overview
     * Exists RPC is the method to check that a vector exists in the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    default void exists(org.vdaas.vald.api.v1.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExistsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * GetObject RPC is the method to get the metadata of a vector inserted into the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    default void getObject(org.vdaas.vald.api.v1.payload.Object.VectorRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * StreamGetObject RPC is the method to get the metadata of multiple existing vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the GetObject request can be communicated in any order between client and server.
     * Each Upsert request and response are independent.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.VectorRequest> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamVector> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamGetObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * A method to get all the vectors with server streaming
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    default void streamListObject(org.vdaas.vald.api.v1.payload.Object.List.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.List.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamListObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the vector metadata. This RPC is mainly used for index correction process
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    default void getTimestamp(org.vdaas.vald.api.v1.payload.Object.TimestampRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Timestamp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTimestampMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Object.
   * <pre>
   * Overview
   * Object Service is responsible for getting inserted vectors and checking whether vectors are inserted into the `vald-agent`.
   * </pre>
   */
  public static abstract class ObjectImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ObjectGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Object.
   * <pre>
   * Overview
   * Object Service is responsible for getting inserted vectors and checking whether vectors are inserted into the `vald-agent`.
   * </pre>
   */
  public static final class ObjectStub
      extends io.grpc.stub.AbstractAsyncStub<ObjectStub> {
    private ObjectStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Exists RPC is the method to check that a vector exists in the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public void exists(org.vdaas.vald.api.v1.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * GetObject RPC is the method to get the metadata of a vector inserted into the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public void getObject(org.vdaas.vald.api.v1.payload.Object.VectorRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * StreamGetObject RPC is the method to get the metadata of multiple existing vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the GetObject request can be communicated in any order between client and server.
     * Each Upsert request and response are independent.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.VectorRequest> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamVector> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamGetObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * A method to get all the vectors with server streaming
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public void streamListObject(org.vdaas.vald.api.v1.payload.Object.List.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.List.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamListObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the vector metadata. This RPC is mainly used for index correction process
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public void getTimestamp(org.vdaas.vald.api.v1.payload.Object.TimestampRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Timestamp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTimestampMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Object.
   * <pre>
   * Overview
   * Object Service is responsible for getting inserted vectors and checking whether vectors are inserted into the `vald-agent`.
   * </pre>
   */
  public static final class ObjectBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ObjectBlockingV2Stub> {
    private ObjectBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Exists RPC is the method to check that a vector exists in the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.ID exists(org.vdaas.vald.api.v1.payload.Object.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * GetObject RPC is the method to get the metadata of a vector inserted into the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Vector getObject(org.vdaas.vald.api.v1.payload.Object.VectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * StreamGetObject RPC is the method to get the metadata of multiple existing vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the GetObject request can be communicated in any order between client and server.
     * Each Upsert request and response are independent.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<org.vdaas.vald.api.v1.payload.Object.VectorRequest, org.vdaas.vald.api.v1.payload.Object.StreamVector>
        streamGetObject() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamGetObjectMethod(), getCallOptions());
    }

    /**
     * <pre>
     * Overview
     * A method to get all the vectors with server streaming
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, org.vdaas.vald.api.v1.payload.Object.List.Response>
        streamListObject(org.vdaas.vald.api.v1.payload.Object.List.Request request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getStreamListObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the vector metadata. This RPC is mainly used for index correction process
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Timestamp getTimestamp(org.vdaas.vald.api.v1.payload.Object.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTimestampMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Object.
   * <pre>
   * Overview
   * Object Service is responsible for getting inserted vectors and checking whether vectors are inserted into the `vald-agent`.
   * </pre>
   */
  public static final class ObjectBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ObjectBlockingStub> {
    private ObjectBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Exists RPC is the method to check that a vector exists in the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.ID exists(org.vdaas.vald.api.v1.payload.Object.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * GetObject RPC is the method to get the metadata of a vector inserted into the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Vector getObject(org.vdaas.vald.api.v1.payload.Object.VectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * A method to get all the vectors with server streaming
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public java.util.Iterator<org.vdaas.vald.api.v1.payload.Object.List.Response> streamListObject(
        org.vdaas.vald.api.v1.payload.Object.List.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamListObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the vector metadata. This RPC is mainly used for index correction process
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Timestamp getTimestamp(org.vdaas.vald.api.v1.payload.Object.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTimestampMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Object.
   * <pre>
   * Overview
   * Object Service is responsible for getting inserted vectors and checking whether vectors are inserted into the `vald-agent`.
   * </pre>
   */
  public static final class ObjectFutureStub
      extends io.grpc.stub.AbstractFutureStub<ObjectFutureStub> {
    private ObjectFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Exists RPC is the method to check that a vector exists in the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.ID> exists(
        org.vdaas.vald.api.v1.payload.Object.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * GetObject RPC is the method to get the metadata of a vector inserted into the `vald-agent`.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                           |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Requested vector's ID is empty, or some request payload is invalid.                         | Check request payload and fix request payload.                                           |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                   | Send a request with an ID that is already inserted.                                      |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Vector> getObject(
        org.vdaas.vald.api.v1.payload.Object.VectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the vector metadata. This RPC is mainly used for index correction process
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Timestamp> getTimestamp(
        org.vdaas.vald.api.v1.payload.Object.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTimestampMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXISTS = 0;
  private static final int METHODID_GET_OBJECT = 1;
  private static final int METHODID_STREAM_LIST_OBJECT = 2;
  private static final int METHODID_GET_TIMESTAMP = 3;
  private static final int METHODID_STREAM_GET_OBJECT = 4;

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
        case METHODID_EXISTS:
          serviceImpl.exists((org.vdaas.vald.api.v1.payload.Object.ID) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((org.vdaas.vald.api.v1.payload.Object.VectorRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector>) responseObserver);
          break;
        case METHODID_STREAM_LIST_OBJECT:
          serviceImpl.streamListObject((org.vdaas.vald.api.v1.payload.Object.List.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.List.Response>) responseObserver);
          break;
        case METHODID_GET_TIMESTAMP:
          serviceImpl.getTimestamp((org.vdaas.vald.api.v1.payload.Object.TimestampRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Timestamp>) responseObserver);
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
        case METHODID_STREAM_GET_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamGetObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamVector>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getExistsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Object.ID,
              org.vdaas.vald.api.v1.payload.Object.ID>(
                service, METHODID_EXISTS)))
        .addMethod(
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Object.VectorRequest,
              org.vdaas.vald.api.v1.payload.Object.Vector>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getStreamGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Object.VectorRequest,
              org.vdaas.vald.api.v1.payload.Object.StreamVector>(
                service, METHODID_STREAM_GET_OBJECT)))
        .addMethod(
          getStreamListObjectMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Object.List.Request,
              org.vdaas.vald.api.v1.payload.Object.List.Response>(
                service, METHODID_STREAM_LIST_OBJECT)))
        .addMethod(
          getGetTimestampMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Object.TimestampRequest,
              org.vdaas.vald.api.v1.payload.Object.Timestamp>(
                service, METHODID_GET_TIMESTAMP)))
        .build();
  }

  private static abstract class ObjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdObject.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Object");
    }
  }

  private static final class ObjectFileDescriptorSupplier
      extends ObjectBaseDescriptorSupplier {
    ObjectFileDescriptorSupplier() {}
  }

  private static final class ObjectMethodDescriptorSupplier
      extends ObjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ObjectMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ObjectGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObjectFileDescriptorSupplier())
              .addMethod(getExistsMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getStreamGetObjectMethod())
              .addMethod(getStreamListObjectMethod())
              .addMethod(getGetTimestampMethod())
              .build();
        }
      }
    }
    return result;
  }
}
