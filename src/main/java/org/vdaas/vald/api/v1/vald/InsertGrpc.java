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
    comments = "Source: vald/apis/proto/v1/vald/insert.proto")
public final class InsertGrpc {

  private InsertGrpc() {}

  public static final String SERVICE_NAME = "vald.v1.Insert";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Insert",
      requestType = org.vdaas.vald.api.v1.payload.Insert.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getInsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request, org.vdaas.vald.api.v1.payload.Object.Location> getInsertMethod;
    if ((getInsertMethod = InsertGrpc.getInsertMethod) == null) {
      synchronized (InsertGrpc.class) {
        if ((getInsertMethod = InsertGrpc.getInsertMethod) == null) {
          InsertGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Insert.Request, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Insert.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new InsertMethodDescriptorSupplier("Insert"))
              .build();
        }
      }
    }
    return getInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInsert",
      requestType = org.vdaas.vald.api.v1.payload.Insert.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request,
      org.vdaas.vald.api.v1.payload.Object.Location> getStreamInsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request, org.vdaas.vald.api.v1.payload.Object.Location> getStreamInsertMethod;
    if ((getStreamInsertMethod = InsertGrpc.getStreamInsertMethod) == null) {
      synchronized (InsertGrpc.class) {
        if ((getStreamInsertMethod = InsertGrpc.getStreamInsertMethod) == null) {
          InsertGrpc.getStreamInsertMethod = getStreamInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Insert.Request, org.vdaas.vald.api.v1.payload.Object.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Insert.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Location.getDefaultInstance()))
              .setSchemaDescriptor(new InsertMethodDescriptorSupplier("StreamInsert"))
              .build();
        }
      }
    }
    return getStreamInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiInsert",
      requestType = org.vdaas.vald.api.v1.payload.Insert.MultiRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.Locations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.MultiRequest,
      org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations> getMultiInsertMethod;
    if ((getMultiInsertMethod = InsertGrpc.getMultiInsertMethod) == null) {
      synchronized (InsertGrpc.class) {
        if ((getMultiInsertMethod = InsertGrpc.getMultiInsertMethod) == null) {
          InsertGrpc.getMultiInsertMethod = getMultiInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Insert.MultiRequest, org.vdaas.vald.api.v1.payload.Object.Locations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Insert.MultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.Locations.getDefaultInstance()))
              .setSchemaDescriptor(new InsertMethodDescriptorSupplier("MultiInsert"))
              .build();
        }
      }
    }
    return getMultiInsertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InsertStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsertStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsertStub>() {
        @java.lang.Override
        public InsertStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsertStub(channel, callOptions);
        }
      };
    return InsertStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InsertBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsertBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsertBlockingStub>() {
        @java.lang.Override
        public InsertBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsertBlockingStub(channel, callOptions);
        }
      };
    return InsertBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InsertFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsertFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsertFutureStub>() {
        @java.lang.Override
        public InsertFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsertFutureStub(channel, callOptions);
        }
      };
    return InsertFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InsertImplBase implements io.grpc.BindableService {

    /**
     */
    public void insert(org.vdaas.vald.api.v1.payload.Insert.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Insert.Request> streamInsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamInsertMethod(), responseObserver);
    }

    /**
     */
    public void multiInsert(org.vdaas.vald.api.v1.payload.Insert.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiInsertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Insert.Request,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_INSERT)))
          .addMethod(
            getStreamInsertMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Insert.Request,
                org.vdaas.vald.api.v1.payload.Object.Location>(
                  this, METHODID_STREAM_INSERT)))
          .addMethod(
            getMultiInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Insert.MultiRequest,
                org.vdaas.vald.api.v1.payload.Object.Locations>(
                  this, METHODID_MULTI_INSERT)))
          .build();
    }
  }

  /**
   */
  public static final class InsertStub extends io.grpc.stub.AbstractAsyncStub<InsertStub> {
    private InsertStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsertStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsertStub(channel, callOptions);
    }

    /**
     */
    public void insert(org.vdaas.vald.api.v1.payload.Insert.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Insert.Request> streamInsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamInsertMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiInsert(org.vdaas.vald.api.v1.payload.Insert.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiInsertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InsertBlockingStub extends io.grpc.stub.AbstractBlockingStub<InsertBlockingStub> {
    private InsertBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsertBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsertBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Location insert(org.vdaas.vald.api.v1.payload.Insert.Request request) {
      return blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiInsert(org.vdaas.vald.api.v1.payload.Insert.MultiRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultiInsertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InsertFutureStub extends io.grpc.stub.AbstractFutureStub<InsertFutureStub> {
    private InsertFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsertFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsertFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> insert(
        org.vdaas.vald.api.v1.payload.Insert.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiInsert(
        org.vdaas.vald.api.v1.payload.Insert.MultiRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiInsertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSERT = 0;
  private static final int METHODID_MULTI_INSERT = 1;
  private static final int METHODID_STREAM_INSERT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InsertImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InsertImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSERT:
          serviceImpl.insert((org.vdaas.vald.api.v1.payload.Insert.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
          break;
        case METHODID_MULTI_INSERT:
          serviceImpl.multiInsert((org.vdaas.vald.api.v1.payload.Insert.MultiRequest) request,
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
        case METHODID_STREAM_INSERT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamInsert(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InsertBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InsertBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdInsert.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Insert");
    }
  }

  private static final class InsertFileDescriptorSupplier
      extends InsertBaseDescriptorSupplier {
    InsertFileDescriptorSupplier() {}
  }

  private static final class InsertMethodDescriptorSupplier
      extends InsertBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InsertMethodDescriptorSupplier(String methodName) {
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
      synchronized (InsertGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InsertFileDescriptorSupplier())
              .addMethod(getInsertMethod())
              .addMethod(getStreamInsertMethod())
              .addMethod(getMultiInsertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
