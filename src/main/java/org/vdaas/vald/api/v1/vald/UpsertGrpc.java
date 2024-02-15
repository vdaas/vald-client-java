package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Upsert service provides ways to insert/update vectors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: v1/vald/upsert.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UpsertGrpc {

  private UpsertGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Upsert";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upsert",
      requestType = org.vdaas.vald.api.v1.payload.Upsert.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getUpsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.Request, org.vdaas.vald.api.v1.payload.Object.Location> getUpsertMethod;
    if ((getUpsertMethod = UpsertGrpc.getUpsertMethod) == null) {
      synchronized (UpsertGrpc.class) {
        if ((getUpsertMethod = UpsertGrpc.getUpsertMethod) == null) {
          UpsertGrpc.getUpsertMethod = getUpsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Upsert.Request, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Upsert.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new UpsertMethodDescriptorSupplier("Upsert"))
              .build();
        }
      }
    }
    return getUpsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.Request,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpsert",
      requestType = org.vdaas.vald.api.v1.payload.Upsert.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.Request,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamUpsertMethod;
    if ((getStreamUpsertMethod = UpsertGrpc.getStreamUpsertMethod) == null) {
      synchronized (UpsertGrpc.class) {
        if ((getStreamUpsertMethod = UpsertGrpc.getStreamUpsertMethod) == null) {
          UpsertGrpc.getStreamUpsertMethod = getStreamUpsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Upsert.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Upsert.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamLocation.getDefaultInstance()))
              .setSchemaDescriptor(new UpsertMethodDescriptorSupplier("StreamUpsert"))
              .build();
        }
      }
    }
    return getStreamUpsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpsert",
      requestType = org.vdaas.vald.api.v1.payload.Upsert.MultiRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Upsert.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiUpsertMethod;
    if ((getMultiUpsertMethod = UpsertGrpc.getMultiUpsertMethod) == null) {
      synchronized (UpsertGrpc.class) {
        if ((getMultiUpsertMethod = UpsertGrpc.getMultiUpsertMethod) == null) {
          UpsertGrpc.getMultiUpsertMethod = getMultiUpsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Upsert.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Upsert.MultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new UpsertMethodDescriptorSupplier("MultiUpsert"))
              .build();
        }
      }
    }
    return getMultiUpsertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpsertStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpsertStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpsertStub>() {
        @java.lang.Override
        public UpsertStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpsertStub(channel, callOptions);
        }
      };
    return UpsertStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpsertBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpsertBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpsertBlockingStub>() {
        @java.lang.Override
        public UpsertBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpsertBlockingStub(channel, callOptions);
        }
      };
    return UpsertBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpsertFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpsertFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpsertFutureStub>() {
        @java.lang.Override
        public UpsertFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpsertFutureStub(channel, callOptions);
        }
      };
    return UpsertFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Upsert service provides ways to insert/update vectors.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * A method to insert/update a vector.
     * </pre>
     */
    default void upsert(org.vdaas.vald.api.v1.payload.Upsert.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to insert/update multiple vectors by bidirectional streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Upsert.Request> streamUpsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamUpsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to insert/update multiple vectors in a single request.
     * </pre>
     */
    default void multiUpsert(org.vdaas.vald.api.v1.payload.Upsert.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiUpsertMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Upsert.
   * <pre>
   * Upsert service provides ways to insert/update vectors.
   * </pre>
   */
  public static abstract class UpsertImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UpsertGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Upsert.
   * <pre>
   * Upsert service provides ways to insert/update vectors.
   * </pre>
   */
  public static final class UpsertStub
      extends io.grpc.stub.AbstractAsyncStub<UpsertStub> {
    private UpsertStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpsertStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpsertStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to insert/update a vector.
     * </pre>
     */
    public void upsert(org.vdaas.vald.api.v1.payload.Upsert.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to insert/update multiple vectors by bidirectional streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Upsert.Request> streamUpsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpsertMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to insert/update multiple vectors in a single request.
     * </pre>
     */
    public void multiUpsert(org.vdaas.vald.api.v1.payload.Upsert.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiUpsertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Upsert.
   * <pre>
   * Upsert service provides ways to insert/update vectors.
   * </pre>
   */
  public static final class UpsertBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UpsertBlockingStub> {
    private UpsertBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpsertBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpsertBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to insert/update a vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location upsert(org.vdaas.vald.api.v1.payload.Upsert.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to insert/update multiple vectors in a single request.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpsert(org.vdaas.vald.api.v1.payload.Upsert.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiUpsertMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Upsert.
   * <pre>
   * Upsert service provides ways to insert/update vectors.
   * </pre>
   */
  public static final class UpsertFutureStub
      extends io.grpc.stub.AbstractFutureStub<UpsertFutureStub> {
    private UpsertFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpsertFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpsertFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to insert/update a vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> upsert(
        org.vdaas.vald.api.v1.payload.Upsert.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to insert/update multiple vectors in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiUpsert(
        org.vdaas.vald.api.v1.payload.Upsert.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiUpsertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPSERT = 0;
  private static final int METHODID_MULTI_UPSERT = 1;
  private static final int METHODID_STREAM_UPSERT = 2;

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
        case METHODID_UPSERT:
          serviceImpl.upsert((org.vdaas.vald.api.v1.payload.Upsert.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_UPSERT:
          serviceImpl.multiUpsert((org.vdaas.vald.api.v1.payload.Upsert.MultiRequest) request,
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
        case METHODID_STREAM_UPSERT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpsert(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUpsertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Upsert.Request,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_UPSERT)))
        .addMethod(
          getStreamUpsertMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Upsert.Request,
              org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                service, METHODID_STREAM_UPSERT)))
        .addMethod(
          getMultiUpsertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Upsert.MultiRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_MULTI_UPSERT)))
        .build();
  }

  private static abstract class UpsertBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpsertBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdUpsert.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Upsert");
    }
  }

  private static final class UpsertFileDescriptorSupplier
      extends UpsertBaseDescriptorSupplier {
    UpsertFileDescriptorSupplier() {}
  }

  private static final class UpsertMethodDescriptorSupplier
      extends UpsertBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UpsertMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UpsertGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpsertFileDescriptorSupplier())
              .addMethod(getUpsertMethod())
              .addMethod(getStreamUpsertMethod())
              .addMethod(getMultiUpsertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
