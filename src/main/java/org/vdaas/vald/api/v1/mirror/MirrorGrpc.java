package org.vdaas.vald.api.v1.mirror;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Represent the mirror service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: v1/mirror/mirror.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MirrorGrpc {

  private MirrorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mirror.v1.Mirror";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Mirror.Targets,
      org.vdaas.vald.api.v1.payload.Mirror.Targets> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = org.vdaas.vald.api.v1.payload.Mirror.Targets.class,
      responseType = org.vdaas.vald.api.v1.payload.Mirror.Targets.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Mirror.Targets,
      org.vdaas.vald.api.v1.payload.Mirror.Targets> getRegisterMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Mirror.Targets, org.vdaas.vald.api.v1.payload.Mirror.Targets> getRegisterMethod;
    if ((getRegisterMethod = MirrorGrpc.getRegisterMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getRegisterMethod = MirrorGrpc.getRegisterMethod) == null) {
          MirrorGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Mirror.Targets, org.vdaas.vald.api.v1.payload.Mirror.Targets>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Mirror.Targets.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Mirror.Targets.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MirrorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MirrorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MirrorStub>() {
        @java.lang.Override
        public MirrorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MirrorStub(channel, callOptions);
        }
      };
    return MirrorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MirrorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MirrorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MirrorBlockingStub>() {
        @java.lang.Override
        public MirrorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MirrorBlockingStub(channel, callOptions);
        }
      };
    return MirrorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MirrorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MirrorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MirrorFutureStub>() {
        @java.lang.Override
        public MirrorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MirrorFutureStub(channel, callOptions);
        }
      };
    return MirrorFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Represent the mirror service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Register is the RPC to register other mirror servers.
     * </pre>
     */
    default void register(org.vdaas.vald.api.v1.payload.Mirror.Targets request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Mirror.Targets> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Mirror.
   * <pre>
   * Represent the mirror service.
   * </pre>
   */
  public static abstract class MirrorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MirrorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Mirror.
   * <pre>
   * Represent the mirror service.
   * </pre>
   */
  public static final class MirrorStub
      extends io.grpc.stub.AbstractAsyncStub<MirrorStub> {
    private MirrorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MirrorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MirrorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register is the RPC to register other mirror servers.
     * </pre>
     */
    public void register(org.vdaas.vald.api.v1.payload.Mirror.Targets request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Mirror.Targets> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Mirror.
   * <pre>
   * Represent the mirror service.
   * </pre>
   */
  public static final class MirrorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MirrorBlockingStub> {
    private MirrorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MirrorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MirrorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register is the RPC to register other mirror servers.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Mirror.Targets register(org.vdaas.vald.api.v1.payload.Mirror.Targets request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Mirror.
   * <pre>
   * Represent the mirror service.
   * </pre>
   */
  public static final class MirrorFutureStub
      extends io.grpc.stub.AbstractFutureStub<MirrorFutureStub> {
    private MirrorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MirrorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MirrorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register is the RPC to register other mirror servers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Mirror.Targets> register(
        org.vdaas.vald.api.v1.payload.Mirror.Targets request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;

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
        case METHODID_REGISTER:
          serviceImpl.register((org.vdaas.vald.api.v1.payload.Mirror.Targets) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Mirror.Targets>) responseObserver);
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
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Mirror.Targets,
              org.vdaas.vald.api.v1.payload.Mirror.Targets>(
                service, METHODID_REGISTER)))
        .build();
  }

  private static abstract class MirrorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MirrorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.mirror.ValdMirror.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Mirror");
    }
  }

  private static final class MirrorFileDescriptorSupplier
      extends MirrorBaseDescriptorSupplier {
    MirrorFileDescriptorSupplier() {}
  }

  private static final class MirrorMethodDescriptorSupplier
      extends MirrorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MirrorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MirrorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MirrorFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
