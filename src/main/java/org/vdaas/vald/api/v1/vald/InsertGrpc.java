package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Insert service provides ways to add new vectors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: v1/vald/insert.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InsertGrpc {

  private InsertGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Insert";

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
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInsert",
      requestType = org.vdaas.vald.api.v1.payload.Insert.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Object.StreamLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request,
      org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamInsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Insert.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation> getStreamInsertMethod;
    if ((getStreamInsertMethod = InsertGrpc.getStreamInsertMethod) == null) {
      synchronized (InsertGrpc.class) {
        if ((getStreamInsertMethod = InsertGrpc.getStreamInsertMethod) == null) {
          InsertGrpc.getStreamInsertMethod = getStreamInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Insert.Request, org.vdaas.vald.api.v1.payload.Object.StreamLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Insert.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Object.StreamLocation.getDefaultInstance()))
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
   * <pre>
   * Insert service provides ways to add new vectors.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * A method to add a new single vector.
     * </pre>
     */
    default void insert(org.vdaas.vald.api.v1.payload.Insert.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to add new multiple vectors by bidirectional streaming.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Insert.Request> streamInsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamInsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to add new multiple vectors in a single request.
     * </pre>
     */
    default void multiInsert(org.vdaas.vald.api.v1.payload.Insert.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiInsertMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Insert.
   * <pre>
   * Insert service provides ways to add new vectors.
   * </pre>
   */
  public static abstract class InsertImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InsertGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Insert.
   * <pre>
   * Insert service provides ways to add new vectors.
   * </pre>
   */
  public static final class InsertStub
      extends io.grpc.stub.AbstractAsyncStub<InsertStub> {
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
     * <pre>
     * A method to add a new single vector.
     * </pre>
     */
    public void insert(org.vdaas.vald.api.v1.payload.Insert.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to add new multiple vectors by bidirectional streaming.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Insert.Request> streamInsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamInsertMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to add new multiple vectors in a single request.
     * </pre>
     */
    public void multiInsert(org.vdaas.vald.api.v1.payload.Insert.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.Locations> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiInsertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Insert.
   * <pre>
   * Insert service provides ways to add new vectors.
   * </pre>
   */
  public static final class InsertBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InsertBlockingStub> {
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
     * <pre>
     * A method to add a new single vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Location insert(org.vdaas.vald.api.v1.payload.Insert.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to add new multiple vectors in a single request.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Object.Locations multiInsert(org.vdaas.vald.api.v1.payload.Insert.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiInsertMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Insert.
   * <pre>
   * Insert service provides ways to add new vectors.
   * </pre>
   */
  public static final class InsertFutureStub
      extends io.grpc.stub.AbstractFutureStub<InsertFutureStub> {
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
     * <pre>
     * A method to add a new single vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Location> insert(
        org.vdaas.vald.api.v1.payload.Insert.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to add new multiple vectors in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Object.Locations> multiInsert(
        org.vdaas.vald.api.v1.payload.Insert.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Object.StreamLocation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getInsertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Insert.Request,
              org.vdaas.vald.api.v1.payload.Object.Location>(
                service, METHODID_INSERT)))
        .addMethod(
          getStreamInsertMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Insert.Request,
              org.vdaas.vald.api.v1.payload.Object.StreamLocation>(
                service, METHODID_STREAM_INSERT)))
        .addMethod(
          getMultiInsertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Insert.MultiRequest,
              org.vdaas.vald.api.v1.payload.Object.Locations>(
                service, METHODID_MULTI_INSERT)))
        .build();
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
    private final java.lang.String methodName;

    InsertMethodDescriptorSupplier(java.lang.String methodName) {
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
