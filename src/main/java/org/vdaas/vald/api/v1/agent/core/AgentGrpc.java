package org.vdaas.vald.api.v1.agent.core;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Represent the agent service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/agent/core/agent.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentGrpc {

  private AgentGrpc() {}

  public static final java.lang.String SERVICE_NAME = "core.v1.Agent";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
      org.vdaas.vald.api.v1.payload.Empty> getCreateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIndex",
      requestType = org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
      org.vdaas.vald.api.v1.payload.Empty> getCreateIndexMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest, org.vdaas.vald.api.v1.payload.Empty> getCreateIndexMethod;
    if ((getCreateIndexMethod = AgentGrpc.getCreateIndexMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getCreateIndexMethod = AgentGrpc.getCreateIndexMethod) == null) {
          AgentGrpc.getCreateIndexMethod = getCreateIndexMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest, org.vdaas.vald.api.v1.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("CreateIndex"))
              .build();
        }
      }
    }
    return getCreateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Empty> getSaveIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveIndex",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Empty> getSaveIndexMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Empty> getSaveIndexMethod;
    if ((getSaveIndexMethod = AgentGrpc.getSaveIndexMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getSaveIndexMethod = AgentGrpc.getSaveIndexMethod) == null) {
          AgentGrpc.getSaveIndexMethod = getSaveIndexMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("SaveIndex"))
              .build();
        }
      }
    }
    return getSaveIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
      org.vdaas.vald.api.v1.payload.Empty> getCreateAndSaveIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAndSaveIndex",
      requestType = org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
      org.vdaas.vald.api.v1.payload.Empty> getCreateAndSaveIndexMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest, org.vdaas.vald.api.v1.payload.Empty> getCreateAndSaveIndexMethod;
    if ((getCreateAndSaveIndexMethod = AgentGrpc.getCreateAndSaveIndexMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getCreateAndSaveIndexMethod = AgentGrpc.getCreateAndSaveIndexMethod) == null) {
          AgentGrpc.getCreateAndSaveIndexMethod = getCreateAndSaveIndexMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest, org.vdaas.vald.api.v1.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAndSaveIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("CreateAndSaveIndex"))
              .build();
        }
      }
    }
    return getCreateAndSaveIndexMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentStub>() {
        @java.lang.Override
        public AgentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentStub(channel, callOptions);
        }
      };
    return AgentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AgentBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentBlockingV2Stub>() {
        @java.lang.Override
        public AgentBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentBlockingV2Stub(channel, callOptions);
        }
      };
    return AgentBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentBlockingStub>() {
        @java.lang.Override
        public AgentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentBlockingStub(channel, callOptions);
        }
      };
    return AgentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentFutureStub>() {
        @java.lang.Override
        public AgentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentFutureStub(channel, callOptions);
        }
      };
    return AgentFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Represent the agent service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Represent the creating index RPC.
     * </pre>
     */
    default void createIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Represent the saving index RPC.
     * </pre>
     */
    default void saveIndex(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Represent the creating and saving index RPC.
     * </pre>
     */
    default void createAndSaveIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAndSaveIndexMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Agent.
   * <pre>
   * Represent the agent service.
   * </pre>
   */
  public static abstract class AgentImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Agent.
   * <pre>
   * Represent the agent service.
   * </pre>
   */
  public static final class AgentStub
      extends io.grpc.stub.AbstractAsyncStub<AgentStub> {
    private AgentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the creating index RPC.
     * </pre>
     */
    public void createIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Represent the saving index RPC.
     * </pre>
     */
    public void saveIndex(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Represent the creating and saving index RPC.
     * </pre>
     */
    public void createAndSaveIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAndSaveIndexMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Agent.
   * <pre>
   * Represent the agent service.
   * </pre>
   */
  public static final class AgentBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AgentBlockingV2Stub> {
    private AgentBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the creating index RPC.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Empty createIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Represent the saving index RPC.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Empty saveIndex(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Represent the creating and saving index RPC.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Empty createAndSaveIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAndSaveIndexMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Agent.
   * <pre>
   * Represent the agent service.
   * </pre>
   */
  public static final class AgentBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentBlockingStub> {
    private AgentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the creating index RPC.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Empty createIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Represent the saving index RPC.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Empty saveIndex(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Represent the creating and saving index RPC.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Empty createAndSaveIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAndSaveIndexMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Agent.
   * <pre>
   * Represent the agent service.
   * </pre>
   */
  public static final class AgentFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentFutureStub> {
    private AgentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Represent the creating index RPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> createIndex(
        org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Represent the saving index RPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> saveIndex(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Represent the creating and saving index RPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> createAndSaveIndex(
        org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAndSaveIndexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INDEX = 0;
  private static final int METHODID_SAVE_INDEX = 1;
  private static final int METHODID_CREATE_AND_SAVE_INDEX = 2;

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
        case METHODID_CREATE_INDEX:
          serviceImpl.createIndex((org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty>) responseObserver);
          break;
        case METHODID_SAVE_INDEX:
          serviceImpl.saveIndex((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty>) responseObserver);
          break;
        case METHODID_CREATE_AND_SAVE_INDEX:
          serviceImpl.createAndSaveIndex((org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest) request,
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
          getCreateIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
              org.vdaas.vald.api.v1.payload.Empty>(
                service, METHODID_CREATE_INDEX)))
        .addMethod(
          getSaveIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Empty,
              org.vdaas.vald.api.v1.payload.Empty>(
                service, METHODID_SAVE_INDEX)))
        .addMethod(
          getCreateAndSaveIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
              org.vdaas.vald.api.v1.payload.Empty>(
                service, METHODID_CREATE_AND_SAVE_INDEX)))
        .build();
  }

  private static abstract class AgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.agent.core.ValdAgent.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Agent");
    }
  }

  private static final class AgentFileDescriptorSupplier
      extends AgentBaseDescriptorSupplier {
    AgentFileDescriptorSupplier() {}
  }

  private static final class AgentMethodDescriptorSupplier
      extends AgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentFileDescriptorSupplier())
              .addMethod(getCreateIndexMethod())
              .addMethod(getSaveIndexMethod())
              .addMethod(getCreateAndSaveIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
