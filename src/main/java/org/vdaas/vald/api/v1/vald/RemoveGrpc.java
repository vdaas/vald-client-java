package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Overview
 * Remove Service is responsible for removing vectors indexed in the `vald-agent`.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/vald/remove.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RemoveGrpc {

  private RemoveGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Remove";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = org.vdaas.vald.api.v1.payload.Remove.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getRemoveMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.Request, org.vdaas.vald.api.v1.payload.Object.Location> getRemoveMethod;
    if ((getRemoveMethod = RemoveGrpc.getRemoveMethod) == null) {
      synchronized (RemoveGrpc.class) {
        if ((getRemoveMethod = RemoveGrpc.getRemoveMethod) == null) {
          RemoveGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Remove.Request, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Remove.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new RemoveMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.TimestampRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getRemoveByTimestampMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveByTimestamp",
      requestType = org.vdaas.vald.api.v1.payload.Remove.TimestampRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.TimestampRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getRemoveByTimestampMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.TimestampRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getRemoveByTimestampMethod;
    if ((getRemoveByTimestampMethod = RemoveGrpc.getRemoveByTimestampMethod) == null) {
      synchronized (RemoveGrpc.class) {
        if ((getRemoveByTimestampMethod = RemoveGrpc.getRemoveByTimestampMethod) == null) {
          RemoveGrpc.getRemoveByTimestampMethod = getRemoveByTimestampMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Remove.TimestampRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveByTimestamp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Remove.TimestampRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new RemoveMethodDescriptorSupplier("RemoveByTimestamp"))
              .build();
        }
      }
    }
    return getRemoveByTimestampMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.Request,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamRemove",
      requestType = org.vdaas.vald.api.v1.payload.Remove.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.Request,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamRemoveMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamRemoveMethod;
    if ((getStreamRemoveMethod = RemoveGrpc.getStreamRemoveMethod) == null) {
      synchronized (RemoveGrpc.class) {
        if ((getStreamRemoveMethod = RemoveGrpc.getStreamRemoveMethod) == null) {
          RemoveGrpc.getStreamRemoveMethod = getStreamRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Remove.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Remove.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamLocation.getDefaultInstance()))
              .setSchemaDescriptor(new RemoveMethodDescriptorSupplier("StreamRemove"))
              .build();
        }
      }
    }
    return getStreamRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiRemove",
      requestType = org.vdaas.vald.api.v1.payload.Remove.MultiRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiRemoveMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Remove.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiRemoveMethod;
    if ((getMultiRemoveMethod = RemoveGrpc.getMultiRemoveMethod) == null) {
      synchronized (RemoveGrpc.class) {
        if ((getMultiRemoveMethod = RemoveGrpc.getMultiRemoveMethod) == null) {
          RemoveGrpc.getMultiRemoveMethod = getMultiRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Remove.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Remove.MultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new RemoveMethodDescriptorSupplier("MultiRemove"))
              .build();
        }
      }
    }
    return getMultiRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoveStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoveStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoveStub>() {
        @java.lang.Override
        public RemoveStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoveStub(channel, callOptions);
        }
      };
    return RemoveStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RemoveBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoveBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoveBlockingV2Stub>() {
        @java.lang.Override
        public RemoveBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoveBlockingV2Stub(channel, callOptions);
        }
      };
    return RemoveBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoveBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoveBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoveBlockingStub>() {
        @java.lang.Override
        public RemoveBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoveBlockingStub(channel, callOptions);
        }
      };
    return RemoveBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoveFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoveFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoveFutureStub>() {
        @java.lang.Override
        public RemoveFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoveFutureStub(channel, callOptions);
        }
      };
    return RemoveFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Overview
   * Remove Service is responsible for removing vectors indexed in the `vald-agent`.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Overview
     * Remove RPC is the method to remove a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
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
    default void remove(org.vdaas.vald.api.v1.payload.Remove.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * RemoveByTimestamp RPC is the method to remove vectors based on timestamp.
     * &lt;div class="notice"&gt;
     * In the TimestampRequest message, the 'timestamps' field is repeated, allowing the inclusion of multiple Timestamp.&lt;br&gt;
     * When multiple Timestamps are provided, it results in an `AND` condition, enabling the realization of deletions with specified ranges.&lt;br&gt;
     * This design allows for versatile deletion operations, facilitating tasks such as removing data within a specific time range.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                                                       |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.                              |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed.                             |
     * | NOT_FOUND         | No vectors in the system match the specified timestamp conditions.                              | Check whether vectors matching the specified timestamp conditions exist in the system, and fix conditions if needed. |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.
     * </pre>
     */
    default void removeByTimestamp(org.vdaas.vald.api.v1.payload.Remove.TimestampRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveByTimestampMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * A method to remove multiple indexed vectors by bidirectional streaming.
     * StreamRemove RPC is the method to remove multiple vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the remove request can be communicated in any order between client and server.
     * Each Remove request and response are independent.
     * It's the recommended method to remove a large number of vectors.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     *   The request process may not be completed when the response code is NOT `0 (OK)`.
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
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Remove.Request> streamRemove(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * MultiRemove is the method to remove multiple vectors in **1** request.
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
     * |  10  | ABORTED           |
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
    default void multiRemove(org.vdaas.vald.api.v1.payload.Remove.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiRemoveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Remove.
   * <pre>
   * Overview
   * Remove Service is responsible for removing vectors indexed in the `vald-agent`.
   * </pre>
   */
  public static abstract class RemoveImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RemoveGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Remove.
   * <pre>
   * Overview
   * Remove Service is responsible for removing vectors indexed in the `vald-agent`.
   * </pre>
   */
  public static final class RemoveStub
      extends io.grpc.stub.AbstractAsyncStub<RemoveStub> {
    private RemoveStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoveStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoveStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Remove RPC is the method to remove a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
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
    public void remove(org.vdaas.vald.api.v1.payload.Remove.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * RemoveByTimestamp RPC is the method to remove vectors based on timestamp.
     * &lt;div class="notice"&gt;
     * In the TimestampRequest message, the 'timestamps' field is repeated, allowing the inclusion of multiple Timestamp.&lt;br&gt;
     * When multiple Timestamps are provided, it results in an `AND` condition, enabling the realization of deletions with specified ranges.&lt;br&gt;
     * This design allows for versatile deletion operations, facilitating tasks such as removing data within a specific time range.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                                                       |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.                              |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed.                             |
     * | NOT_FOUND         | No vectors in the system match the specified timestamp conditions.                              | Check whether vectors matching the specified timestamp conditions exist in the system, and fix conditions if needed. |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.
     * </pre>
     */
    public void removeByTimestamp(org.vdaas.vald.api.v1.payload.Remove.TimestampRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveByTimestampMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * A method to remove multiple indexed vectors by bidirectional streaming.
     * StreamRemove RPC is the method to remove multiple vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the remove request can be communicated in any order between client and server.
     * Each Remove request and response are independent.
     * It's the recommended method to remove a large number of vectors.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     *   The request process may not be completed when the response code is NOT `0 (OK)`.
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
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Remove.Request> streamRemove(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamRemoveMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * MultiRemove is the method to remove multiple vectors in **1** request.
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
     * |  10  | ABORTED           |
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
    public void multiRemove(org.vdaas.vald.api.v1.payload.Remove.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Remove.
   * <pre>
   * Overview
   * Remove Service is responsible for removing vectors indexed in the `vald-agent`.
   * </pre>
   */
  public static final class RemoveBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RemoveBlockingV2Stub> {
    private RemoveBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoveBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoveBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Remove RPC is the method to remove a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
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
    public org.vdaas.vald.api.v1.payload.Object.Location remove(org.vdaas.vald.api.v1.payload.Remove.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * RemoveByTimestamp RPC is the method to remove vectors based on timestamp.
     * &lt;div class="notice"&gt;
     * In the TimestampRequest message, the 'timestamps' field is repeated, allowing the inclusion of multiple Timestamp.&lt;br&gt;
     * When multiple Timestamps are provided, it results in an `AND` condition, enabling the realization of deletions with specified ranges.&lt;br&gt;
     * This design allows for versatile deletion operations, facilitating tasks such as removing data within a specific time range.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                                                       |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.                              |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed.                             |
     * | NOT_FOUND         | No vectors in the system match the specified timestamp conditions.                              | Check whether vectors matching the specified timestamp conditions exist in the system, and fix conditions if needed. |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations removeByTimestamp(org.vdaas.vald.api.v1.payload.Remove.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveByTimestampMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * A method to remove multiple indexed vectors by bidirectional streaming.
     * StreamRemove RPC is the method to remove multiple vectors using the [bidirectional streaming RPC](https://grpc.io/docs/what-is-grpc/core-concepts/#bidirectional-streaming-rpc).&lt;br&gt;
     * Using the bidirectional streaming RPC, the remove request can be communicated in any order between client and server.
     * Each Remove request and response are independent.
     * It's the recommended method to remove a large number of vectors.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     *   The request process may not be completed when the response code is NOT `0 (OK)`.
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
    public io.grpc.stub.BlockingClientCall<org.vdaas.vald.api.v1.payload.Remove.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation>
        streamRemove() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamRemoveMethod(), getCallOptions());
    }

    /**
     * <pre>
     * Overview
     * MultiRemove is the method to remove multiple vectors in **1** request.
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
     * |  10  | ABORTED           |
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
    public org.vdaas.vald.api.v1.payload.Object.Locations multiRemove(org.vdaas.vald.api.v1.payload.Remove.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Remove.
   * <pre>
   * Overview
   * Remove Service is responsible for removing vectors indexed in the `vald-agent`.
   * </pre>
   */
  public static final class RemoveBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RemoveBlockingStub> {
    private RemoveBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoveBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoveBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Remove RPC is the method to remove a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
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
    public org.vdaas.vald.api.v1.payload.Object.Location remove(org.vdaas.vald.api.v1.payload.Remove.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * RemoveByTimestamp RPC is the method to remove vectors based on timestamp.
     * &lt;div class="notice"&gt;
     * In the TimestampRequest message, the 'timestamps' field is repeated, allowing the inclusion of multiple Timestamp.&lt;br&gt;
     * When multiple Timestamps are provided, it results in an `AND` condition, enabling the realization of deletions with specified ranges.&lt;br&gt;
     * This design allows for versatile deletion operations, facilitating tasks such as removing data within a specific time range.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                                                       |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.                              |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed.                             |
     * | NOT_FOUND         | No vectors in the system match the specified timestamp conditions.                              | Check whether vectors matching the specified timestamp conditions exist in the system, and fix conditions if needed. |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations removeByTimestamp(org.vdaas.vald.api.v1.payload.Remove.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveByTimestampMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * MultiRemove is the method to remove multiple vectors in **1** request.
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
     * |  10  | ABORTED           |
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
    public org.vdaas.vald.api.v1.payload.Object.Locations multiRemove(org.vdaas.vald.api.v1.payload.Remove.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Remove.
   * <pre>
   * Overview
   * Remove Service is responsible for removing vectors indexed in the `vald-agent`.
   * </pre>
   */
  public static final class RemoveFutureStub
      extends io.grpc.stub.AbstractFutureStub<RemoveFutureStub> {
    private RemoveFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoveFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoveFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Remove RPC is the method to remove a single vector.
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  3   | INVALID_ARGUMENT  |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  10  | ABORTED           |
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
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> remove(
        org.vdaas.vald.api.v1.payload.Remove.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * RemoveByTimestamp RPC is the method to remove vectors based on timestamp.
     * &lt;div class="notice"&gt;
     * In the TimestampRequest message, the 'timestamps' field is repeated, allowing the inclusion of multiple Timestamp.&lt;br&gt;
     * When multiple Timestamps are provided, it results in an `AND` condition, enabling the realization of deletions with specified ranges.&lt;br&gt;
     * This design allows for versatile deletion operations, facilitating tasks such as removing data within a specific time range.
     * &lt;/div&gt;
     * ---
     * Status Code
     * |  0   | OK                |
     * |  1   | CANCELLED         |
     * |  4   | DEADLINE_EXCEEDED |
     * |  5   | NOT_FOUND         |
     * |  13  | INTERNAL          |
     * ---
     * Troubleshooting
     * The request process may not be completed when the response code is NOT `0 (OK)`.
     * Here are some common reasons and how to resolve each error.
     * | name              | common reason                                                                                   | how to resolve                                                                                                       |
     * | :---------------- | :---------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------- |
     * | CANCELLED         | Executed cancel() of rpc from client/server-side or network problems between client and server. | Check the code, especially around timeout and connection management, and fix if needed.                              |
     * | DEADLINE_EXCEEDED | The RPC timeout setting is too short on the client/server side.                                 | Check the gRPC timeout setting on both the client and server sides and fix it if needed.                             |
     * | NOT_FOUND         | No vectors in the system match the specified timestamp conditions.                              | Check whether vectors matching the specified timestamp conditions exist in the system, and fix conditions if needed. |
     * | INTERNAL          | Target Vald cluster or network route has some critical error.                                   | Check target Vald cluster first and check network route including ingress as second.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> removeByTimestamp(
        org.vdaas.vald.api.v1.payload.Remove.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveByTimestampMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * MultiRemove is the method to remove multiple vectors in **1** request.
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
     * |  10  | ABORTED           |
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
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiRemove(
        org.vdaas.vald.api.v1.payload.Remove.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE = 0;
  private static final int METHODID_REMOVE_BY_TIMESTAMP = 1;
  private static final int METHODID_MULTI_REMOVE = 2;
  private static final int METHODID_STREAM_REMOVE = 3;

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
        case METHODID_REMOVE:
          serviceImpl.remove((org.vdaas.vald.api.v1.payload.Remove.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_REMOVE_BY_TIMESTAMP:
          serviceImpl.removeByTimestamp((org.vdaas.vald.api.v1.payload.Remove.TimestampRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations>) responseObserver);
          break;
        case METHODID_MULTI_REMOVE:
          serviceImpl.multiRemove((org.vdaas.vald.api.v1.payload.Remove.MultiRequest) request,
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
        case METHODID_STREAM_REMOVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRemove(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRemoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Remove.Request,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_REMOVE)))
        .addMethod(
          getRemoveByTimestampMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Remove.TimestampRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_REMOVE_BY_TIMESTAMP)))
        .addMethod(
          getStreamRemoveMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Remove.Request,
              org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                service, METHODID_STREAM_REMOVE)))
        .addMethod(
          getMultiRemoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Remove.MultiRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_MULTI_REMOVE)))
        .build();
  }

  private static abstract class RemoveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoveBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdRemove.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Remove");
    }
  }

  private static final class RemoveFileDescriptorSupplier
      extends RemoveBaseDescriptorSupplier {
    RemoveFileDescriptorSupplier() {}
  }

  private static final class RemoveMethodDescriptorSupplier
      extends RemoveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RemoveMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RemoveGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoveFileDescriptorSupplier())
              .addMethod(getRemoveMethod())
              .addMethod(getRemoveByTimestampMethod())
              .addMethod(getStreamRemoveMethod())
              .addMethod(getMultiRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
