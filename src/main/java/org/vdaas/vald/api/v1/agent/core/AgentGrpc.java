package org.vdaas.vald.api.v1.agent.core;

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
    comments = "Source: vald/apis/proto/v1/agent/core/agent.proto")
public final class AgentGrpc {

  private AgentGrpc() {}

  public static final String SERVICE_NAME = "core.v1.Agent";

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

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Count> getIndexInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexInfo",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Index.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Count> getIndexInfoMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Count> getIndexInfoMethod;
    if ((getIndexInfoMethod = AgentGrpc.getIndexInfoMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getIndexInfoMethod = AgentGrpc.getIndexInfoMethod) == null) {
          AgentGrpc.getIndexInfoMethod = getIndexInfoMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.Count.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("IndexInfo"))
              .build();
        }
      }
    }
    return getIndexInfoMethod;
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
   */
  public static abstract class AgentImplBase implements io.grpc.BindableService {

    /**
     */
    public void createIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIndexMethod(), responseObserver);
    }

    /**
     */
    public void saveIndex(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveIndexMethod(), responseObserver);
    }

    /**
     */
    public void createAndSaveIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAndSaveIndexMethod(), responseObserver);
    }

    /**
     */
    public void indexInfo(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      asyncUnimplementedUnaryCall(getIndexInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
                org.vdaas.vald.api.v1.payload.Empty>(
                  this, METHODID_CREATE_INDEX)))
          .addMethod(
            getSaveIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Empty,
                org.vdaas.vald.api.v1.payload.Empty>(
                  this, METHODID_SAVE_INDEX)))
          .addMethod(
            getCreateAndSaveIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest,
                org.vdaas.vald.api.v1.payload.Empty>(
                  this, METHODID_CREATE_AND_SAVE_INDEX)))
          .addMethod(
            getIndexInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Empty,
                org.vdaas.vald.api.v1.payload.Info.Index.Count>(
                  this, METHODID_INDEX_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class AgentStub extends io.grpc.stub.AbstractAsyncStub<AgentStub> {
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
     */
    public void createIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveIndex(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAndSaveIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAndSaveIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void indexInfo(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AgentBlockingStub extends io.grpc.stub.AbstractBlockingStub<AgentBlockingStub> {
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
     */
    public org.vdaas.vald.api.v1.payload.Empty createIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Empty saveIndex(org.vdaas.vald.api.v1.payload.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSaveIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Empty createAndSaveIndex(org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAndSaveIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.Count indexInfo(org.vdaas.vald.api.v1.payload.Empty request) {
      return blockingUnaryCall(
          getChannel(), getIndexInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AgentFutureStub extends io.grpc.stub.AbstractFutureStub<AgentFutureStub> {
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
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> createIndex(
        org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> saveIndex(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Empty> createAndSaveIndex(
        org.vdaas.vald.api.v1.payload.Control.CreateIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAndSaveIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.Count> indexInfo(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INDEX = 0;
  private static final int METHODID_SAVE_INDEX = 1;
  private static final int METHODID_CREATE_AND_SAVE_INDEX = 2;
  private static final int METHODID_INDEX_INFO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentImplBase serviceImpl, int methodId) {
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
        case METHODID_INDEX_INFO:
          serviceImpl.indexInfo((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count>) responseObserver);
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
    private final String methodName;

    AgentMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getIndexInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
