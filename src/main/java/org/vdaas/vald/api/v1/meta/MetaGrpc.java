package org.vdaas.vald.api.v1.meta;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: v1/meta/meta.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetaGrpc {

  private MetaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "meta.v1.Meta";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.Key,
      org.vdaas.vald.api.v1.payload.Meta.Value> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = org.vdaas.vald.api.v1.payload.Meta.Key.class,
      responseType = org.vdaas.vald.api.v1.payload.Meta.Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.Key,
      org.vdaas.vald.api.v1.payload.Meta.Value> getGetMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.Key, org.vdaas.vald.api.v1.payload.Meta.Value> getGetMethod;
    if ((getGetMethod = MetaGrpc.getGetMethod) == null) {
      synchronized (MetaGrpc.class) {
        if ((getGetMethod = MetaGrpc.getGetMethod) == null) {
          MetaGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Meta.Key, org.vdaas.vald.api.v1.payload.Meta.Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Meta.Key.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Meta.Value.getDefaultInstance()))
              .setSchemaDescriptor(new MetaMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.KeyValue,
      org.vdaas.vald.api.v1.payload.Empty> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = org.vdaas.vald.api.v1.payload.Meta.KeyValue.class,
      responseType = org.vdaas.vald.api.v1.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.KeyValue,
      org.vdaas.vald.api.v1.payload.Empty> getSetMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.KeyValue, org.vdaas.vald.api.v1.payload.Empty> getSetMethod;
    if ((getSetMethod = MetaGrpc.getSetMethod) == null) {
      synchronized (MetaGrpc.class) {
        if ((getSetMethod = MetaGrpc.getSetMethod) == null) {
          MetaGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Meta.KeyValue, org.vdaas.vald.api.v1.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Meta.KeyValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MetaMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.Key,
      org.vdaas.vald.api.v1.payload.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = org.vdaas.vald.api.v1.payload.Meta.Key.class,
      responseType = org.vdaas.vald.api.v1.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.Key,
      org.vdaas.vald.api.v1.payload.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Meta.Key, org.vdaas.vald.api.v1.payload.Empty> getDeleteMethod;
    if ((getDeleteMethod = MetaGrpc.getDeleteMethod) == null) {
      synchronized (MetaGrpc.class) {
        if ((getDeleteMethod = MetaGrpc.getDeleteMethod) == null) {
          MetaGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Meta.Key, org.vdaas.vald.api.v1.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Meta.Key.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MetaMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaStub>() {
        @java.lang.Override
        public MetaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaStub(channel, callOptions);
        }
      };
    return MetaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaBlockingStub>() {
        @java.lang.Override
        public MetaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaBlockingStub(channel, callOptions);
        }
      };
    return MetaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetaFutureStub>() {
        @java.lang.Override
        public MetaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetaFutureStub(channel, callOptions);
        }
      };
    return MetaFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(org.vdaas.vald.api.v1.payload.Meta.Key request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Meta.Value> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void set(org.vdaas.vald.api.v1.payload.Meta.KeyValue request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     */
    default void delete(org.vdaas.vald.api.v1.payload.Meta.Key request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Meta.
   */
  public static abstract class MetaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MetaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Meta.
   */
  public static final class MetaStub
      extends io.grpc.stub.AbstractAsyncStub<MetaStub> {
    private MetaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaStub(channel, callOptions);
    }

    /**
     */
    public void get(org.vdaas.vald.api.v1.payload.Meta.Key request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Meta.Value> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void set(org.vdaas.vald.api.v1.payload.Meta.KeyValue request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(org.vdaas.vald.api.v1.payload.Meta.Key request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Meta.
   */
  public static final class MetaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MetaBlockingStub> {
    private MetaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Meta.Value get(org.vdaas.vald.api.v1.payload.Meta.Key request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Empty set(org.vdaas.vald.api.v1.payload.Meta.KeyValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Empty delete(org.vdaas.vald.api.v1.payload.Meta.Key request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Meta.
   */
  public static final class MetaFutureStub
      extends io.grpc.stub.AbstractFutureStub<MetaFutureStub> {
    private MetaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Meta.Value> get(
        org.vdaas.vald.api.v1.payload.Meta.Key request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> set(
        org.vdaas.vald.api.v1.payload.Meta.KeyValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> delete(
        org.vdaas.vald.api.v1.payload.Meta.Key request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_SET = 1;
  private static final int METHODID_DELETE = 2;

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
        case METHODID_GET:
          serviceImpl.get((org.vdaas.vald.api.v1.payload.Meta.Key) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Meta.Value>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((org.vdaas.vald.api.v1.payload.Meta.KeyValue) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.vdaas.vald.api.v1.payload.Meta.Key) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty>) responseObserver);
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
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Meta.Key,
              org.vdaas.vald.api.v1.payload.Meta.Value>(
                service, METHODID_GET)))
        .addMethod(
          getSetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Meta.KeyValue,
              org.vdaas.vald.api.v1.payload.Empty>(
                service, METHODID_SET)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Meta.Key,
              org.vdaas.vald.api.v1.payload.Empty>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class MetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.meta.ValdMeta.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Meta");
    }
  }

  private static final class MetaFileDescriptorSupplier
      extends MetaBaseDescriptorSupplier {
    MetaFileDescriptorSupplier() {}
  }

  private static final class MetaMethodDescriptorSupplier
      extends MetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MetaMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MetaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetaFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getSetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
