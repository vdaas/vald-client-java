package tikv;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/tikv/tikvpb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TikvGrpc {

  private TikvGrpc() {}

  public static final java.lang.String SERVICE_NAME = "tikv.Tikv";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawGetRequest,
      tikv.Kvrpcpb.RawGetResponse> getRawGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawGet",
      requestType = tikv.Kvrpcpb.RawGetRequest.class,
      responseType = tikv.Kvrpcpb.RawGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawGetRequest,
      tikv.Kvrpcpb.RawGetResponse> getRawGetMethod() {
    io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawGetRequest, tikv.Kvrpcpb.RawGetResponse> getRawGetMethod;
    if ((getRawGetMethod = TikvGrpc.getRawGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawGetMethod = TikvGrpc.getRawGetMethod) == null) {
          TikvGrpc.getRawGetMethod = getRawGetMethod =
              io.grpc.MethodDescriptor.<tikv.Kvrpcpb.RawGetRequest, tikv.Kvrpcpb.RawGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawGet"))
              .build();
        }
      }
    }
    return getRawGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchGetRequest,
      tikv.Kvrpcpb.RawBatchGetResponse> getRawBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawBatchGet",
      requestType = tikv.Kvrpcpb.RawBatchGetRequest.class,
      responseType = tikv.Kvrpcpb.RawBatchGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchGetRequest,
      tikv.Kvrpcpb.RawBatchGetResponse> getRawBatchGetMethod() {
    io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchGetRequest, tikv.Kvrpcpb.RawBatchGetResponse> getRawBatchGetMethod;
    if ((getRawBatchGetMethod = TikvGrpc.getRawBatchGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawBatchGetMethod = TikvGrpc.getRawBatchGetMethod) == null) {
          TikvGrpc.getRawBatchGetMethod = getRawBatchGetMethod =
              io.grpc.MethodDescriptor.<tikv.Kvrpcpb.RawBatchGetRequest, tikv.Kvrpcpb.RawBatchGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawBatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawBatchGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawBatchGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawBatchGet"))
              .build();
        }
      }
    }
    return getRawBatchGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawPutRequest,
      tikv.Kvrpcpb.RawPutResponse> getRawPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawPut",
      requestType = tikv.Kvrpcpb.RawPutRequest.class,
      responseType = tikv.Kvrpcpb.RawPutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawPutRequest,
      tikv.Kvrpcpb.RawPutResponse> getRawPutMethod() {
    io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawPutRequest, tikv.Kvrpcpb.RawPutResponse> getRawPutMethod;
    if ((getRawPutMethod = TikvGrpc.getRawPutMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawPutMethod = TikvGrpc.getRawPutMethod) == null) {
          TikvGrpc.getRawPutMethod = getRawPutMethod =
              io.grpc.MethodDescriptor.<tikv.Kvrpcpb.RawPutRequest, tikv.Kvrpcpb.RawPutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawPutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawPut"))
              .build();
        }
      }
    }
    return getRawPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchPutRequest,
      tikv.Kvrpcpb.RawBatchPutResponse> getRawBatchPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawBatchPut",
      requestType = tikv.Kvrpcpb.RawBatchPutRequest.class,
      responseType = tikv.Kvrpcpb.RawBatchPutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchPutRequest,
      tikv.Kvrpcpb.RawBatchPutResponse> getRawBatchPutMethod() {
    io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchPutRequest, tikv.Kvrpcpb.RawBatchPutResponse> getRawBatchPutMethod;
    if ((getRawBatchPutMethod = TikvGrpc.getRawBatchPutMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawBatchPutMethod = TikvGrpc.getRawBatchPutMethod) == null) {
          TikvGrpc.getRawBatchPutMethod = getRawBatchPutMethod =
              io.grpc.MethodDescriptor.<tikv.Kvrpcpb.RawBatchPutRequest, tikv.Kvrpcpb.RawBatchPutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawBatchPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawBatchPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawBatchPutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawBatchPut"))
              .build();
        }
      }
    }
    return getRawBatchPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawDeleteRequest,
      tikv.Kvrpcpb.RawDeleteResponse> getRawDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawDelete",
      requestType = tikv.Kvrpcpb.RawDeleteRequest.class,
      responseType = tikv.Kvrpcpb.RawDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawDeleteRequest,
      tikv.Kvrpcpb.RawDeleteResponse> getRawDeleteMethod() {
    io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawDeleteRequest, tikv.Kvrpcpb.RawDeleteResponse> getRawDeleteMethod;
    if ((getRawDeleteMethod = TikvGrpc.getRawDeleteMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawDeleteMethod = TikvGrpc.getRawDeleteMethod) == null) {
          TikvGrpc.getRawDeleteMethod = getRawDeleteMethod =
              io.grpc.MethodDescriptor.<tikv.Kvrpcpb.RawDeleteRequest, tikv.Kvrpcpb.RawDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawDelete"))
              .build();
        }
      }
    }
    return getRawDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchDeleteRequest,
      tikv.Kvrpcpb.RawBatchDeleteResponse> getRawBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawBatchDelete",
      requestType = tikv.Kvrpcpb.RawBatchDeleteRequest.class,
      responseType = tikv.Kvrpcpb.RawBatchDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchDeleteRequest,
      tikv.Kvrpcpb.RawBatchDeleteResponse> getRawBatchDeleteMethod() {
    io.grpc.MethodDescriptor<tikv.Kvrpcpb.RawBatchDeleteRequest, tikv.Kvrpcpb.RawBatchDeleteResponse> getRawBatchDeleteMethod;
    if ((getRawBatchDeleteMethod = TikvGrpc.getRawBatchDeleteMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawBatchDeleteMethod = TikvGrpc.getRawBatchDeleteMethod) == null) {
          TikvGrpc.getRawBatchDeleteMethod = getRawBatchDeleteMethod =
              io.grpc.MethodDescriptor.<tikv.Kvrpcpb.RawBatchDeleteRequest, tikv.Kvrpcpb.RawBatchDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawBatchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawBatchDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tikv.Kvrpcpb.RawBatchDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawBatchDelete"))
              .build();
        }
      }
    }
    return getRawBatchDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TikvStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TikvStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TikvStub>() {
        @java.lang.Override
        public TikvStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TikvStub(channel, callOptions);
        }
      };
    return TikvStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TikvBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TikvBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TikvBlockingV2Stub>() {
        @java.lang.Override
        public TikvBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TikvBlockingV2Stub(channel, callOptions);
        }
      };
    return TikvBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TikvBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TikvBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TikvBlockingStub>() {
        @java.lang.Override
        public TikvBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TikvBlockingStub(channel, callOptions);
        }
      };
    return TikvBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TikvFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TikvFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TikvFutureStub>() {
        @java.lang.Override
        public TikvFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TikvFutureStub(channel, callOptions);
        }
      };
    return TikvFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void rawGet(tikv.Kvrpcpb.RawGetRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawGetMethod(), responseObserver);
    }

    /**
     */
    default void rawBatchGet(tikv.Kvrpcpb.RawBatchGetRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawBatchGetMethod(), responseObserver);
    }

    /**
     */
    default void rawPut(tikv.Kvrpcpb.RawPutRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawPutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawPutMethod(), responseObserver);
    }

    /**
     */
    default void rawBatchPut(tikv.Kvrpcpb.RawBatchPutRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchPutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawBatchPutMethod(), responseObserver);
    }

    /**
     */
    default void rawDelete(tikv.Kvrpcpb.RawDeleteRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawDeleteMethod(), responseObserver);
    }

    /**
     */
    default void rawBatchDelete(tikv.Kvrpcpb.RawBatchDeleteRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawBatchDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Tikv.
   */
  public static abstract class TikvImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TikvGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Tikv.
   */
  public static final class TikvStub
      extends io.grpc.stub.AbstractAsyncStub<TikvStub> {
    private TikvStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TikvStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TikvStub(channel, callOptions);
    }

    /**
     */
    public void rawGet(tikv.Kvrpcpb.RawGetRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawBatchGet(tikv.Kvrpcpb.RawBatchGetRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawPut(tikv.Kvrpcpb.RawPutRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawPutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawBatchPut(tikv.Kvrpcpb.RawBatchPutRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchPutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawBatchPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawDelete(tikv.Kvrpcpb.RawDeleteRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawBatchDelete(tikv.Kvrpcpb.RawBatchDeleteRequest request,
        io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Tikv.
   */
  public static final class TikvBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TikvBlockingV2Stub> {
    private TikvBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TikvBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TikvBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public tikv.Kvrpcpb.RawGetResponse rawGet(tikv.Kvrpcpb.RawGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawBatchGetResponse rawBatchGet(tikv.Kvrpcpb.RawBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawPutResponse rawPut(tikv.Kvrpcpb.RawPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawBatchPutResponse rawBatchPut(tikv.Kvrpcpb.RawBatchPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawDeleteResponse rawDelete(tikv.Kvrpcpb.RawDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawBatchDeleteResponse rawBatchDelete(tikv.Kvrpcpb.RawBatchDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Tikv.
   */
  public static final class TikvBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TikvBlockingStub> {
    private TikvBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TikvBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TikvBlockingStub(channel, callOptions);
    }

    /**
     */
    public tikv.Kvrpcpb.RawGetResponse rawGet(tikv.Kvrpcpb.RawGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawBatchGetResponse rawBatchGet(tikv.Kvrpcpb.RawBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawPutResponse rawPut(tikv.Kvrpcpb.RawPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawBatchPutResponse rawBatchPut(tikv.Kvrpcpb.RawBatchPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawDeleteResponse rawDelete(tikv.Kvrpcpb.RawDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public tikv.Kvrpcpb.RawBatchDeleteResponse rawBatchDelete(tikv.Kvrpcpb.RawBatchDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Tikv.
   */
  public static final class TikvFutureStub
      extends io.grpc.stub.AbstractFutureStub<TikvFutureStub> {
    private TikvFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TikvFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TikvFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tikv.Kvrpcpb.RawGetResponse> rawGet(
        tikv.Kvrpcpb.RawGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tikv.Kvrpcpb.RawBatchGetResponse> rawBatchGet(
        tikv.Kvrpcpb.RawBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawBatchGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tikv.Kvrpcpb.RawPutResponse> rawPut(
        tikv.Kvrpcpb.RawPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tikv.Kvrpcpb.RawBatchPutResponse> rawBatchPut(
        tikv.Kvrpcpb.RawBatchPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawBatchPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tikv.Kvrpcpb.RawDeleteResponse> rawDelete(
        tikv.Kvrpcpb.RawDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tikv.Kvrpcpb.RawBatchDeleteResponse> rawBatchDelete(
        tikv.Kvrpcpb.RawBatchDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawBatchDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RAW_GET = 0;
  private static final int METHODID_RAW_BATCH_GET = 1;
  private static final int METHODID_RAW_PUT = 2;
  private static final int METHODID_RAW_BATCH_PUT = 3;
  private static final int METHODID_RAW_DELETE = 4;
  private static final int METHODID_RAW_BATCH_DELETE = 5;

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
        case METHODID_RAW_GET:
          serviceImpl.rawGet((tikv.Kvrpcpb.RawGetRequest) request,
              (io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawGetResponse>) responseObserver);
          break;
        case METHODID_RAW_BATCH_GET:
          serviceImpl.rawBatchGet((tikv.Kvrpcpb.RawBatchGetRequest) request,
              (io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchGetResponse>) responseObserver);
          break;
        case METHODID_RAW_PUT:
          serviceImpl.rawPut((tikv.Kvrpcpb.RawPutRequest) request,
              (io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawPutResponse>) responseObserver);
          break;
        case METHODID_RAW_BATCH_PUT:
          serviceImpl.rawBatchPut((tikv.Kvrpcpb.RawBatchPutRequest) request,
              (io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchPutResponse>) responseObserver);
          break;
        case METHODID_RAW_DELETE:
          serviceImpl.rawDelete((tikv.Kvrpcpb.RawDeleteRequest) request,
              (io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawDeleteResponse>) responseObserver);
          break;
        case METHODID_RAW_BATCH_DELETE:
          serviceImpl.rawBatchDelete((tikv.Kvrpcpb.RawBatchDeleteRequest) request,
              (io.grpc.stub.StreamObserver<tikv.Kvrpcpb.RawBatchDeleteResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRawGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tikv.Kvrpcpb.RawGetRequest,
              tikv.Kvrpcpb.RawGetResponse>(
                service, METHODID_RAW_GET)))
        .addMethod(
          getRawBatchGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tikv.Kvrpcpb.RawBatchGetRequest,
              tikv.Kvrpcpb.RawBatchGetResponse>(
                service, METHODID_RAW_BATCH_GET)))
        .addMethod(
          getRawPutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tikv.Kvrpcpb.RawPutRequest,
              tikv.Kvrpcpb.RawPutResponse>(
                service, METHODID_RAW_PUT)))
        .addMethod(
          getRawBatchPutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tikv.Kvrpcpb.RawBatchPutRequest,
              tikv.Kvrpcpb.RawBatchPutResponse>(
                service, METHODID_RAW_BATCH_PUT)))
        .addMethod(
          getRawDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tikv.Kvrpcpb.RawDeleteRequest,
              tikv.Kvrpcpb.RawDeleteResponse>(
                service, METHODID_RAW_DELETE)))
        .addMethod(
          getRawBatchDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tikv.Kvrpcpb.RawBatchDeleteRequest,
              tikv.Kvrpcpb.RawBatchDeleteResponse>(
                service, METHODID_RAW_BATCH_DELETE)))
        .build();
  }

  private static abstract class TikvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TikvBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tikv.Tikvpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tikv");
    }
  }

  private static final class TikvFileDescriptorSupplier
      extends TikvBaseDescriptorSupplier {
    TikvFileDescriptorSupplier() {}
  }

  private static final class TikvMethodDescriptorSupplier
      extends TikvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TikvMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TikvGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TikvFileDescriptorSupplier())
              .addMethod(getRawGetMethod())
              .addMethod(getRawBatchGetMethod())
              .addMethod(getRawPutMethod())
              .addMethod(getRawBatchPutMethod())
              .addMethod(getRawDeleteMethod())
              .addMethod(getRawBatchDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
