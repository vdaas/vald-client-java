package org.vdaas.vald.api.v1.filter.ingress;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Represent the ingress filter service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: v1/filter/ingress/ingress_filter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FilterGrpc {

  private FilterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "filter.ingress.v1.Filter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Vector> getGenVectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenVector",
      requestType = org.vdaas.vald.api.v1.payload.Object.Blob.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Vector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob,
      org.vdaas.vald.api.v1.payload.Object.Vector> getGenVectorMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Vector> getGenVectorMethod;
    if ((getGenVectorMethod = FilterGrpc.getGenVectorMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getGenVectorMethod = FilterGrpc.getGenVectorMethod) == null) {
          FilterGrpc.getGenVectorMethod = getGenVectorMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Blob, org.vdaas.vald.api.v1.payload.Object.Vector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenVector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Blob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Vector.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("GenVector"))
              .build();
        }
      }
    }
    return getGenVectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Vector,
      org.vdaas.vald.api.v1.payload.Object.Vector> getFilterVectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterVector",
      requestType = org.vdaas.vald.api.v1.payload.Object.Vector.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Vector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Vector,
      org.vdaas.vald.api.v1.payload.Object.Vector> getFilterVectorMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.Vector, org.vdaas.vald.api.v1.payload.Object.Vector> getFilterVectorMethod;
    if ((getFilterVectorMethod = FilterGrpc.getFilterVectorMethod) == null) {
      synchronized (FilterGrpc.class) {
        if ((getFilterVectorMethod = FilterGrpc.getFilterVectorMethod) == null) {
          FilterGrpc.getFilterVectorMethod = getFilterVectorMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.Vector, org.vdaas.vald.api.v1.payload.Object.Vector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterVector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Vector.getDefaultInstance()))
              .setSchemaDescriptor(new FilterMethodDescriptorSupplier("FilterVector"))
              .build();
        }
      }
    }
    return getFilterVectorMethod;
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
   * Represent the ingress filter service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Represent the RPC to generate the vector.
     * </pre>
     */
    default void genVector(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenVectorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Represent the RPC to filter the vector.
     * </pre>
     */
    default void filterVector(org.vdaas.vald.api.v1.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterVectorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Filter.
   * <pre>
   * Represent the ingress filter service.
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
   * Represent the ingress filter service.
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
     * Represent the RPC to generate the vector.
     * </pre>
     */
    public void genVector(org.vdaas.vald.api.v1.payload.Object.Blob request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenVectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Represent the RPC to filter the vector.
     * </pre>
     */
    public void filterVector(org.vdaas.vald.api.v1.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterVectorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Filter.
   * <pre>
   * Represent the ingress filter service.
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
     * Represent the RPC to generate the vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Vector genVector(org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenVectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Represent the RPC to filter the vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Vector filterVector(org.vdaas.vald.api.v1.payload.Object.Vector request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterVectorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Filter.
   * <pre>
   * Represent the ingress filter service.
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
     * Represent the RPC to generate the vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Vector> genVector(
        org.vdaas.vald.api.v1.payload.Object.Blob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenVectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Represent the RPC to filter the vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Vector> filterVector(
        org.vdaas.vald.api.v1.payload.Object.Vector request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterVectorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GEN_VECTOR = 0;
  private static final int METHODID_FILTER_VECTOR = 1;

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
        case METHODID_GEN_VECTOR:
          serviceImpl.genVector((org.vdaas.vald.api.v1.payload.Object.Blob) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector>) responseObserver);
          break;
        case METHODID_FILTER_VECTOR:
          serviceImpl.filterVector((org.vdaas.vald.api.v1.payload.Object.Vector) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector>) responseObserver);
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
          getGenVectorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Object.Blob,
              org.vdaas.vald.api.v1.payload.Object.Vector>(
                service, METHODID_GEN_VECTOR)))
        .addMethod(
          getFilterVectorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Object.Vector,
              org.vdaas.vald.api.v1.payload.Object.Vector>(
                service, METHODID_FILTER_VECTOR)))
        .build();
  }

  private static abstract class FilterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FilterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.filter.ingress.ValdIngressFilter.getDescriptor();
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
              .addMethod(getGenVectorMethod())
              .addMethod(getFilterVectorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
