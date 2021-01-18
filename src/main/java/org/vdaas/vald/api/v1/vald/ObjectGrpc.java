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
    comments = "Source: vald/apis/proto/v1/vald/object.proto")
public final class ObjectGrpc {

  private ObjectGrpc() {}

  public static final String SERVICE_NAME = "vald.v1.Object";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.ID> getExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exists",
      requestType = org.vdaas.vald.api.v1.payload.Object.ID.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.ID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.ID> getExistsMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.ID> getExistsMethod;
    if ((getExistsMethod = ObjectGrpc.getExistsMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getExistsMethod = ObjectGrpc.getExistsMethod) == null) {
          ObjectGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.ID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.ID.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("Exists"))
              .build();
        }
      }
    }
    return getExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.Vector> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.ID.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Vector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.Vector> getGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.Vector> getGetObjectMethod;
    if ((getGetObjectMethod = ObjectGrpc.getGetObjectMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getGetObjectMethod = ObjectGrpc.getGetObjectMethod) == null) {
          ObjectGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.Vector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Vector.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.StreamVector> getStreamGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamGetObject",
      requestType = org.vdaas.vald.api.v1.payload.Object.ID.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamVector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID,
      org.vdaas.vald.api.v1.payload.Object.StreamVector> getStreamGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.StreamVector> getStreamGetObjectMethod;
    if ((getStreamGetObjectMethod = ObjectGrpc.getStreamGetObjectMethod) == null) {
      synchronized (ObjectGrpc.class) {
        if ((getStreamGetObjectMethod = ObjectGrpc.getStreamGetObjectMethod) == null) {
          ObjectGrpc.getStreamGetObjectMethod = getStreamGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Object.ID, org.vdaas.vald.api.v1.payload.Object.StreamVector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamGetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamVector.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectMethodDescriptorSupplier("StreamGetObject"))
              .build();
        }
      }
    }
    return getStreamGetObjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectStub>() {
        @java.lang.Override
        public ObjectStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectStub(channel, callOptions);
        }
      };
    return ObjectStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectBlockingStub>() {
        @java.lang.Override
        public ObjectBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectBlockingStub(channel, callOptions);
        }
      };
    return ObjectBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectFutureStub>() {
        @java.lang.Override
        public ObjectFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectFutureStub(channel, callOptions);
        }
      };
    return ObjectFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ObjectImplBase implements io.grpc.BindableService {

    /**
     */
    public void exists(org.vdaas.vald.api.v1.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID> responseObserver) {
      asyncUnimplementedUnaryCall(getExistsMethod(), responseObserver);
    }

    /**
     */
    public void getObject(org.vdaas.vald.api.v1.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamVector> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamGetObjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.ID,
                org.vdaas.vald.api.v1.payload.Object.ID>(
                  this, METHODID_EXISTS)))
          .addMethod(
            getGetObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.ID,
                org.vdaas.vald.api.v1.payload.Object.Vector>(
                  this, METHODID_GET_OBJECT)))
          .addMethod(
            getStreamGetObjectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Object.ID,
                org.vdaas.vald.api.v1.payload.Object.StreamVector>(
                  this, METHODID_STREAM_GET_OBJECT)))
          .build();
    }
  }

  /**
   */
  public static final class ObjectStub extends io.grpc.stub.AbstractAsyncStub<ObjectStub> {
    private ObjectStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectStub(channel, callOptions);
    }

    /**
     */
    public void exists(org.vdaas.vald.api.v1.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObject(org.vdaas.vald.api.v1.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Vector> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamVector> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamGetObjectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ObjectBlockingStub extends io.grpc.stub.AbstractBlockingStub<ObjectBlockingStub> {
    private ObjectBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.ID exists(org.vdaas.vald.api.v1.payload.Object.ID request) {
      return blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Vector getObject(org.vdaas.vald.api.v1.payload.Object.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ObjectFutureStub extends io.grpc.stub.AbstractFutureStub<ObjectFutureStub> {
    private ObjectFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.ID> exists(
        org.vdaas.vald.api.v1.payload.Object.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Vector> getObject(
        org.vdaas.vald.api.v1.payload.Object.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXISTS = 0;
  private static final int METHODID_GET_OBJECT = 1;
  private static final int METHODID_STREAM_GET_OBJECT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ObjectImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ObjectImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXISTS:
          serviceImpl.exists((org.vdaas.vald.api.v1.payload.Object.ID) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.ID>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((org.vdaas.vald.api.v1.payload.Object.ID) request,
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
        case METHODID_STREAM_GET_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamGetObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamVector>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ObjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdObject.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Object");
    }
  }

  private static final class ObjectFileDescriptorSupplier
      extends ObjectBaseDescriptorSupplier {
    ObjectFileDescriptorSupplier() {}
  }

  private static final class ObjectMethodDescriptorSupplier
      extends ObjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObjectMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObjectGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObjectFileDescriptorSupplier())
              .addMethod(getExistsMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getStreamGetObjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
