package org.vdaas.vald.api.v1.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Overview
 * Represent the resource stats service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/rpc/stats/stats.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StatsGrpc {

  private StatsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rpc.v1.Stats";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.ResourceStats> getResourceStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceStats",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.ResourceStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.ResourceStats> getResourceStatsMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.ResourceStats> getResourceStatsMethod;
    if ((getResourceStatsMethod = StatsGrpc.getResourceStatsMethod) == null) {
      synchronized (StatsGrpc.class) {
        if ((getResourceStatsMethod = StatsGrpc.getResourceStatsMethod) == null) {
          StatsGrpc.getResourceStatsMethod = getResourceStatsMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.ResourceStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.ResourceStats.getDefaultInstance()))
              .setSchemaDescriptor(new StatsMethodDescriptorSupplier("ResourceStats"))
              .build();
        }
      }
    }
    return getResourceStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StatsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatsStub>() {
        @java.lang.Override
        public StatsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatsStub(channel, callOptions);
        }
      };
    return StatsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StatsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatsBlockingV2Stub>() {
        @java.lang.Override
        public StatsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatsBlockingV2Stub(channel, callOptions);
        }
      };
    return StatsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StatsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatsBlockingStub>() {
        @java.lang.Override
        public StatsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatsBlockingStub(channel, callOptions);
        }
      };
    return StatsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StatsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatsFutureStub>() {
        @java.lang.Override
        public StatsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatsFutureStub(channel, callOptions);
        }
      };
    return StatsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Overview
   * Represent the resource stats service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the resource stats.
     * </pre>
     */
    default void resourceStats(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.ResourceStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceStatsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Stats.
   * <pre>
   * Overview
   * Represent the resource stats service.
   * </pre>
   */
  public static abstract class StatsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StatsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Stats.
   * <pre>
   * Overview
   * Represent the resource stats service.
   * </pre>
   */
  public static final class StatsStub
      extends io.grpc.stub.AbstractAsyncStub<StatsStub> {
    private StatsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the resource stats.
     * </pre>
     */
    public void resourceStats(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.ResourceStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Stats.
   * <pre>
   * Overview
   * Represent the resource stats service.
   * </pre>
   */
  public static final class StatsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StatsBlockingV2Stub> {
    private StatsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the resource stats.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.ResourceStats resourceStats(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Stats.
   * <pre>
   * Overview
   * Represent the resource stats service.
   * </pre>
   */
  public static final class StatsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StatsBlockingStub> {
    private StatsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the resource stats.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.ResourceStats resourceStats(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Stats.
   * <pre>
   * Overview
   * Represent the resource stats service.
   * </pre>
   */
  public static final class StatsFutureStub
      extends io.grpc.stub.AbstractFutureStub<StatsFutureStub> {
    private StatsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the resource stats.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.ResourceStats> resourceStats(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESOURCE_STATS = 0;

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
        case METHODID_RESOURCE_STATS:
          serviceImpl.resourceStats((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.ResourceStats>) responseObserver);
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
          getResourceStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Empty,
              org.vdaas.vald.api.v1.payload.Info.ResourceStats>(
                service, METHODID_RESOURCE_STATS)))
        .build();
  }

  private static abstract class StatsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StatsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.rpc.StatsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Stats");
    }
  }

  private static final class StatsFileDescriptorSupplier
      extends StatsBaseDescriptorSupplier {
    StatsFileDescriptorSupplier() {}
  }

  private static final class StatsMethodDescriptorSupplier
      extends StatsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StatsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StatsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StatsFileDescriptorSupplier())
              .addMethod(getResourceStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
