package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Overview
 * Update Service updates to new vector from inserted vector in the `vald-agent` components.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/vald/update.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UpdateGrpc {

  private UpdateGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Update";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = org.vdaas.vald.api.v1.payload.Update.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.Request, org.vdaas.vald.api.v1.payload.Object.Location> getUpdateMethod;
    if ((getUpdateMethod = UpdateGrpc.getUpdateMethod) == null) {
      synchronized (UpdateGrpc.class) {
        if ((getUpdateMethod = UpdateGrpc.getUpdateMethod) == null) {
          UpdateGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Update.Request, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Update.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.Request,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpdate",
      requestType = org.vdaas.vald.api.v1.payload.Update.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.Request,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpdateMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpdateMethod;
    if ((getStreamUpdateMethod = UpdateGrpc.getStreamUpdateMethod) == null) {
      synchronized (UpdateGrpc.class) {
        if ((getStreamUpdateMethod = UpdateGrpc.getStreamUpdateMethod) == null) {
          UpdateGrpc.getStreamUpdateMethod = getStreamUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Update.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Update.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamLocation.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateMethodDescriptorSupplier("StreamUpdate"))
              .build();
        }
      }
    }
    return getStreamUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpdate",
      requestType = org.vdaas.vald.api.v1.payload.Update.MultiRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpdateMethod;
    if ((getMultiUpdateMethod = UpdateGrpc.getMultiUpdateMethod) == null) {
      synchronized (UpdateGrpc.class) {
        if ((getMultiUpdateMethod = UpdateGrpc.getMultiUpdateMethod) == null) {
          UpdateGrpc.getMultiUpdateMethod = getMultiUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Update.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Update.MultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateMethodDescriptorSupplier("MultiUpdate"))
              .build();
        }
      }
    }
    return getMultiUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.TimestampRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateTimestampMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTimestamp",
      requestType = org.vdaas.vald.api.v1.payload.Update.TimestampRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.TimestampRequest,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpdateTimestampMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Update.TimestampRequest, org.vdaas.vald.api.v1.payload.Object.Location> getUpdateTimestampMethod;
    if ((getUpdateTimestampMethod = UpdateGrpc.getUpdateTimestampMethod) == null) {
      synchronized (UpdateGrpc.class) {
        if ((getUpdateTimestampMethod = UpdateGrpc.getUpdateTimestampMethod) == null) {
          UpdateGrpc.getUpdateTimestampMethod = getUpdateTimestampMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Update.TimestampRequest, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTimestamp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Update.TimestampRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateMethodDescriptorSupplier("UpdateTimestamp"))
              .build();
        }
      }
    }
    return getUpdateTimestampMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateStub>() {
        @java.lang.Override
        public UpdateStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateStub(channel, callOptions);
        }
      };
    return UpdateStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UpdateBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateBlockingV2Stub>() {
        @java.lang.Override
        public UpdateBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateBlockingV2Stub(channel, callOptions);
        }
      };
    return UpdateBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateBlockingStub>() {
        @java.lang.Override
        public UpdateBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateBlockingStub(channel, callOptions);
        }
      };
    return UpdateBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateFutureStub>() {
        @java.lang.Override
        public UpdateFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateFutureStub(channel, callOptions);
        }
      };
    return UpdateFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Overview
   * Update Service updates to new vector from inserted vector in the `vald-agent` components.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Overview
     * Update RPC is the method to update a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    default void update(org.vdaas.vald.api.v1.payload.Update.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * StreamUpdate RPC is the method to update multiple vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the update request can be communicated in any order between client and server.
     * Each Update request and response are independent.
     * It's the recommended method to update the large amount of vectors.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Update.Request> streamUpdate(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * MultiUpdate is the method to update multiple vectors in **1** request.
     * &lt;div class="notice"&gt;
     * gRPC has a message size limitation.&lt;br&gt;
     * Please be careful that the size of the request exceeds the limit.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    default void multiUpdate(org.vdaas.vald.api.v1.payload.Update.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * A method to update timestamp an indexed vector.
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    default void updateTimestamp(org.vdaas.vald.api.v1.payload.Update.TimestampRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTimestampMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Update.
   * <pre>
   * Overview
   * Update Service updates to new vector from inserted vector in the `vald-agent` components.
   * </pre>
   */
  public static abstract class UpdateImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UpdateGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Update.
   * <pre>
   * Overview
   * Update Service updates to new vector from inserted vector in the `vald-agent` components.
   * </pre>
   */
  public static final class UpdateStub
      extends io.grpc.stub.AbstractAsyncStub<UpdateStub> {
    private UpdateStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Update RPC is the method to update a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public void update(org.vdaas.vald.api.v1.payload.Update.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * StreamUpdate RPC is the method to update multiple vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the update request can be communicated in any order between client and server.
     * Each Update request and response are independent.
     * It's the recommended method to update the large amount of vectors.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Update.Request> streamUpdate(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpdateMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * MultiUpdate is the method to update multiple vectors in **1** request.
     * &lt;div class="notice"&gt;
     * gRPC has a message size limitation.&lt;br&gt;
     * Please be careful that the size of the request exceeds the limit.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public void multiUpdate(org.vdaas.vald.api.v1.payload.Update.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * A method to update timestamp an indexed vector.
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public void updateTimestamp(org.vdaas.vald.api.v1.payload.Update.TimestampRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTimestampMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Update.
   * <pre>
   * Overview
   * Update Service updates to new vector from inserted vector in the `vald-agent` components.
   * </pre>
   */
  public static final class UpdateBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UpdateBlockingV2Stub> {
    private UpdateBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Update RPC is the method to update a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location update(org.vdaas.vald.api.v1.payload.Update.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * StreamUpdate RPC is the method to update multiple vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the update request can be communicated in any order between client and server.
     * Each Update request and response are independent.
     * It's the recommended method to update the large amount of vectors.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<org.vdaas.vald.api.v1.payload.Update.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation>
        streamUpdate() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamUpdateMethod(), getCallOptions());
    }

    /**
     * <pre>
     * Overview
     * MultiUpdate is the method to update multiple vectors in **1** request.
     * &lt;div class="notice"&gt;
     * gRPC has a message size limitation.&lt;br&gt;
     * Please be careful that the size of the request exceeds the limit.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpdate(org.vdaas.vald.api.v1.payload.Update.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * A method to update timestamp an indexed vector.
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location updateTimestamp(org.vdaas.vald.api.v1.payload.Update.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTimestampMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Update.
   * <pre>
   * Overview
   * Update Service updates to new vector from inserted vector in the `vald-agent` components.
   * </pre>
   */
  public static final class UpdateBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UpdateBlockingStub> {
    private UpdateBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Update RPC is the method to update a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location update(org.vdaas.vald.api.v1.payload.Update.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * MultiUpdate is the method to update multiple vectors in **1** request.
     * &lt;div class="notice"&gt;
     * gRPC has a message size limitation.&lt;br&gt;
     * Please be careful that the size of the request exceeds the limit.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpdate(org.vdaas.vald.api.v1.payload.Update.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * A method to update timestamp an indexed vector.
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location updateTimestamp(org.vdaas.vald.api.v1.payload.Update.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTimestampMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Update.
   * <pre>
   * Overview
   * Update Service updates to new vector from inserted vector in the `vald-agent` components.
   * </pre>
   */
  public static final class UpdateFutureStub
      extends io.grpc.stub.AbstractFutureStub<UpdateFutureStub> {
    private UpdateFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Update RPC is the method to update a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> update(
        org.vdaas.vald.api.v1.payload.Update.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * MultiUpdate is the method to update multiple vectors in **1** request.
     * &lt;div class="notice"&gt;
     * gRPC has a message size limitation.&lt;br&gt;
     * Please be careful that the size of the request exceeds the limit.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  6   | ALREADY_EXISTS    |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                                                                       | how to resolve                                                                           |
     * | :---------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server.                                                     | Check the code, especially around timeout and connection management, and fix if needed.  |
     * | INVALID_ARGUMENT  | The Dimension of the request vector is NOT the same as Vald Agent's config, the requested vector's ID is empty, or some request payload is invalid. | Check Agent config, request payload, and fix request payload or Agent config.            |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                                                                     | Check the gRPC timeout setting on both the client and server sides and fix it if needed. |
     * | NOT_FOUND         | Requested ID is NOT inserted.                                                                                                                       | Send a request with an ID that is already inserted.                                      |
     * | ALREADY_EXISTS    | Request pair of ID and vector is already inserted.                                                                                                  | Change request ID.                                                                       |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                                                                       | Check target Vald cluster first and check network route including ingress as second.     |
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiUpdate(
        org.vdaas.vald.api.v1.payload.Update.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * A method to update timestamp an indexed vector.
     * ---
     * Status Code
     * TODO
     * ---
     * Troubleshooting
     * TODO
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> updateTimestamp(
        org.vdaas.vald.api.v1.payload.Update.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTimestampMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE = 0;
  private static final int METHODID_MULTI_UPDATE = 1;
  private static final int METHODID_UPDATE_TIMESTAMP = 2;
  private static final int METHODID_STREAM_UPDATE = 3;

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
        case METHODID_UPDATE:
          serviceImpl.update((org.vdaas.vald.api.v1.payload.Update.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_UPDATE:
          serviceImpl.multiUpdate((org.vdaas.vald.api.v1.payload.Update.MultiRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations>) responseObserver);
          break;
        case METHODID_UPDATE_TIMESTAMP:
          serviceImpl.updateTimestamp((org.vdaas.vald.api.v1.payload.Update.TimestampRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
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
        case METHODID_STREAM_UPDATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpdate(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Update.Request,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_UPDATE)))
        .addMethod(
          getStreamUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Update.Request,
              org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                service, METHODID_STREAM_UPDATE)))
        .addMethod(
          getMultiUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Update.MultiRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_MULTI_UPDATE)))
        .addMethod(
          getUpdateTimestampMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Update.TimestampRequest,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_UPDATE_TIMESTAMP)))
        .build();
  }

  private static abstract class UpdateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdUpdate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Update");
    }
  }

  private static final class UpdateFileDescriptorSupplier
      extends UpdateBaseDescriptorSupplier {
    UpdateFileDescriptorSupplier() {}
  }

  private static final class UpdateMethodDescriptorSupplier
      extends UpdateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UpdateMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UpdateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateFileDescriptorSupplier())
              .addMethod(getUpdateMethod())
              .addMethod(getStreamUpdateMethod())
              .addMethod(getMultiUpdateMethod())
              .addMethod(getUpdateTimestampMethod())
              .build();
        }
      }
    }
    return result;
  }
}
