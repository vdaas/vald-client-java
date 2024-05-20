package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Update service provides ways to update indexed vectors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
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
   * Update service provides ways to update indexed vectors.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * A method to update an indexed vector.
     * </pre>
     */
    default void update(org.vdaas.vald.api.v1.payload.Update.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to update multiple indexed vectors by bidirectional streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Update.Request> streamUpdate(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to update multiple indexed vectors in a single request.
     * </pre>
     */
    default void multiUpdate(org.vdaas.vald.api.v1.payload.Update.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Update.
   * <pre>
   * Update service provides ways to update indexed vectors.
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
   * Update service provides ways to update indexed vectors.
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
     * A method to update an indexed vector.
     * </pre>
     */
    public void update(org.vdaas.vald.api.v1.payload.Update.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to update multiple indexed vectors by bidirectional streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Update.Request> streamUpdate(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpdateMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to update multiple indexed vectors in a single request.
     * </pre>
     */
    public void multiUpdate(org.vdaas.vald.api.v1.payload.Update.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Update.
   * <pre>
   * Update service provides ways to update indexed vectors.
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
     * A method to update an indexed vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location update(org.vdaas.vald.api.v1.payload.Update.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to update multiple indexed vectors in a single request.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiUpdate(org.vdaas.vald.api.v1.payload.Update.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Update.
   * <pre>
   * Update service provides ways to update indexed vectors.
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
     * A method to update an indexed vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> update(
        org.vdaas.vald.api.v1.payload.Update.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to update multiple indexed vectors in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiUpdate(
        org.vdaas.vald.api.v1.payload.Update.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE = 0;
  private static final int METHODID_MULTI_UPDATE = 1;
  private static final int METHODID_STREAM_UPDATE = 2;

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
              .build();
        }
      }
    }
    return result;
  }
}
