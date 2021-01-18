package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: vald/apis/proto/v1/vald/remove.proto")
public final class RemoveGrpc {

  private RemoveGrpc() {}

  public static final String SERVICE_NAME = "vald.v1.Remove";

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
   */
  public static abstract class RemoveImplBase implements io.grpc.BindableService {

    /**
     */
    public void remove(org.vdaas.vald.api.v1.payload.Remove.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Remove.Request> streamRemove(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamRemoveMethod(), responseObserver);
    }

    /**
     */
    public void multiRemove(org.vdaas.vald.api.v1.payload.Remove.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiRemoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Remove.Request,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getStreamRemoveMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Remove.Request,
                org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                  this, METHODID_STREAM_REMOVE)))
          .addMethod(
            getMultiRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Remove.MultiRequest,
                org.vdaas.vald.api.v1.payload.Object.Locations>(
                  this, METHODID_MULTI_REMOVE)))
          .build();
    }
  }

  /**
   */
  public static final class RemoveStub extends io.grpc.stub.AbstractAsyncStub<RemoveStub> {
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
     */
    public void remove(org.vdaas.vald.api.v1.payload.Remove.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Remove.Request> streamRemove(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamRemoveMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiRemove(org.vdaas.vald.api.v1.payload.Remove.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RemoveBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemoveBlockingStub> {
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
     */
    public org.vdaas.vald.api.v1.payload.Object.Location remove(org.vdaas.vald.api.v1.payload.Remove.Request request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiRemove(org.vdaas.vald.api.v1.payload.Remove.MultiRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultiRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RemoveFutureStub extends io.grpc.stub.AbstractFutureStub<RemoveFutureStub> {
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
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> remove(
        org.vdaas.vald.api.v1.payload.Remove.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiRemove(
        org.vdaas.vald.api.v1.payload.Remove.MultiRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE = 0;
  private static final int METHODID_MULTI_REMOVE = 1;
  private static final int METHODID_STREAM_REMOVE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemoveImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoveImplBase serviceImpl, int methodId) {
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
    private final String methodName;

    RemoveMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getStreamRemoveMethod())
              .addMethod(getMultiRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
