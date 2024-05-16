package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Flush service provides ways to flush all indexed vectors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: v1/vald/flush.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlushGrpc {

  private FlushGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Flush";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Flush.Request,
      org.vdaas.vald.api.v1.payload.Info.Index.Count> getFlushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flush",
      requestType = org.vdaas.vald.api.v1.payload.Flush.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Index.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Flush.Request,
      org.vdaas.vald.api.v1.payload.Info.Index.Count> getFlushMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Flush.Request, org.vdaas.vald.api.v1.payload.Info.Index.Count> getFlushMethod;
    if ((getFlushMethod = FlushGrpc.getFlushMethod) == null) {
      synchronized (FlushGrpc.class) {
        if ((getFlushMethod = FlushGrpc.getFlushMethod) == null) {
          FlushGrpc.getFlushMethod = getFlushMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Flush.Request, org.vdaas.vald.api.v1.payload.Info.Index.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Flush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Flush.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.Count.getDefaultInstance()))
              .setSchemaDescriptor(new FlushMethodDescriptorSupplier("Flush"))
              .build();
        }
      }
    }
    return getFlushMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlushStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlushStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlushStub>() {
        @java.lang.Override
        public FlushStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlushStub(channel, callOptions);
        }
      };
    return FlushStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlushBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlushBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlushBlockingStub>() {
        @java.lang.Override
        public FlushBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlushBlockingStub(channel, callOptions);
        }
      };
    return FlushBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlushFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlushFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlushFutureStub>() {
        @java.lang.Override
        public FlushFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlushFutureStub(channel, callOptions);
        }
      };
    return FlushFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Flush service provides ways to flush all indexed vectors.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * A method to flush all indexed vector.
     * </pre>
     */
    default void flush(org.vdaas.vald.api.v1.payload.Flush.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Flush.
   * <pre>
   * Flush service provides ways to flush all indexed vectors.
   * </pre>
   */
  public static abstract class FlushImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FlushGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Flush.
   * <pre>
   * Flush service provides ways to flush all indexed vectors.
   * </pre>
   */
  public static final class FlushStub
      extends io.grpc.stub.AbstractAsyncStub<FlushStub> {
    private FlushStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlushStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlushStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to flush all indexed vector.
     * </pre>
     */
    public void flush(org.vdaas.vald.api.v1.payload.Flush.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Flush.
   * <pre>
   * Flush service provides ways to flush all indexed vectors.
   * </pre>
   */
  public static final class FlushBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FlushBlockingStub> {
    private FlushBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlushBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlushBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to flush all indexed vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.Count flush(org.vdaas.vald.api.v1.payload.Flush.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Flush.
   * <pre>
   * Flush service provides ways to flush all indexed vectors.
   * </pre>
   */
  public static final class FlushFutureStub
      extends io.grpc.stub.AbstractFutureStub<FlushFutureStub> {
    private FlushFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlushFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlushFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method to flush all indexed vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.Count> flush(
        org.vdaas.vald.api.v1.payload.Flush.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FLUSH = 0;

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
        case METHODID_FLUSH:
          serviceImpl.flush((org.vdaas.vald.api.v1.payload.Flush.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count>) responseObserver);
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
          getFlushMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Flush.Request,
              org.vdaas.vald.api.v1.payload.Info.Index.Count>(
                service, METHODID_FLUSH)))
        .build();
  }

  private static abstract class FlushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlushBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdFlush.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Flush");
    }
  }

  private static final class FlushFileDescriptorSupplier
      extends FlushBaseDescriptorSupplier {
    FlushFileDescriptorSupplier() {}
  }

  private static final class FlushMethodDescriptorSupplier
      extends FlushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FlushMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FlushGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlushFileDescriptorSupplier())
              .addMethod(getFlushMethod())
              .build();
        }
      }
    }
    return result;
  }
}
