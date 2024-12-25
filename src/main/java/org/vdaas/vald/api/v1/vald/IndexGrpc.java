package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Overview
 * Represent the index manager service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: v1/vald/index.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IndexGrpc {

  private IndexGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Index";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getIndexInfoMethod = IndexGrpc.getIndexInfoMethod) == null) {
      synchronized (IndexGrpc.class) {
        if ((getIndexInfoMethod = IndexGrpc.getIndexInfoMethod) == null) {
          IndexGrpc.getIndexInfoMethod = getIndexInfoMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.Count.getDefaultInstance()))
              .setSchemaDescriptor(new IndexMethodDescriptorSupplier("IndexInfo"))
              .build();
        }
      }
    }
    return getIndexInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Detail> getIndexDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexDetail",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Index.Detail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Detail> getIndexDetailMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Detail> getIndexDetailMethod;
    if ((getIndexDetailMethod = IndexGrpc.getIndexDetailMethod) == null) {
      synchronized (IndexGrpc.class) {
        if ((getIndexDetailMethod = IndexGrpc.getIndexDetailMethod) == null) {
          IndexGrpc.getIndexDetailMethod = getIndexDetailMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Detail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.Detail.getDefaultInstance()))
              .setSchemaDescriptor(new IndexMethodDescriptorSupplier("IndexDetail"))
              .build();
        }
      }
    }
    return getIndexDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Statistics> getIndexStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexStatistics",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Index.Statistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.Statistics> getIndexStatisticsMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Statistics> getIndexStatisticsMethod;
    if ((getIndexStatisticsMethod = IndexGrpc.getIndexStatisticsMethod) == null) {
      synchronized (IndexGrpc.class) {
        if ((getIndexStatisticsMethod = IndexGrpc.getIndexStatisticsMethod) == null) {
          IndexGrpc.getIndexStatisticsMethod = getIndexStatisticsMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.Statistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.Statistics.getDefaultInstance()))
              .setSchemaDescriptor(new IndexMethodDescriptorSupplier("IndexStatistics"))
              .build();
        }
      }
    }
    return getIndexStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail> getIndexStatisticsDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexStatisticsDetail",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail> getIndexStatisticsDetailMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail> getIndexStatisticsDetailMethod;
    if ((getIndexStatisticsDetailMethod = IndexGrpc.getIndexStatisticsDetailMethod) == null) {
      synchronized (IndexGrpc.class) {
        if ((getIndexStatisticsDetailMethod = IndexGrpc.getIndexStatisticsDetailMethod) == null) {
          IndexGrpc.getIndexStatisticsDetailMethod = getIndexStatisticsDetailMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexStatisticsDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail.getDefaultInstance()))
              .setSchemaDescriptor(new IndexMethodDescriptorSupplier("IndexStatisticsDetail"))
              .build();
        }
      }
    }
    return getIndexStatisticsDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail> getIndexPropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexProperty",
      requestType = org.vdaas.vald.api.v1.payload.Empty.class,
      responseType = org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty,
      org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail> getIndexPropertyMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail> getIndexPropertyMethod;
    if ((getIndexPropertyMethod = IndexGrpc.getIndexPropertyMethod) == null) {
      synchronized (IndexGrpc.class) {
        if ((getIndexPropertyMethod = IndexGrpc.getIndexPropertyMethod) == null) {
          IndexGrpc.getIndexPropertyMethod = getIndexPropertyMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Empty, org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail.getDefaultInstance()))
              .setSchemaDescriptor(new IndexMethodDescriptorSupplier("IndexProperty"))
              .build();
        }
      }
    }
    return getIndexPropertyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndexStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexStub>() {
        @java.lang.Override
        public IndexStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexStub(channel, callOptions);
        }
      };
    return IndexStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndexBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexBlockingStub>() {
        @java.lang.Override
        public IndexBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexBlockingStub(channel, callOptions);
        }
      };
    return IndexBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndexFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexFutureStub>() {
        @java.lang.Override
        public IndexFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexFutureStub(channel, callOptions);
        }
      };
    return IndexFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Overview
   * Represent the index manager service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information.
     * </pre>
     */
    default void indexInfo(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information for each agents.
     * </pre>
     */
    default void indexDetail(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Detail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics.
     * </pre>
     */
    default void indexStatistics(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Statistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics for each agents.
     * </pre>
     */
    default void indexStatisticsDetail(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexStatisticsDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index property.
     * </pre>
     */
    default void indexProperty(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexPropertyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Index.
   * <pre>
   * Overview
   * Represent the index manager service.
   * </pre>
   */
  public static abstract class IndexImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IndexGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Index.
   * <pre>
   * Overview
   * Represent the index manager service.
   * </pre>
   */
  public static final class IndexStub
      extends io.grpc.stub.AbstractAsyncStub<IndexStub> {
    private IndexStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information.
     * </pre>
     */
    public void indexInfo(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information for each agents.
     * </pre>
     */
    public void indexDetail(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Detail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics.
     * </pre>
     */
    public void indexStatistics(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Statistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics for each agents.
     * </pre>
     */
    public void indexStatisticsDetail(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexStatisticsDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index property.
     * </pre>
     */
    public void indexProperty(org.vdaas.vald.api.v1.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexPropertyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Index.
   * <pre>
   * Overview
   * Represent the index manager service.
   * </pre>
   */
  public static final class IndexBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IndexBlockingStub> {
    private IndexBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.Count indexInfo(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information for each agents.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.Detail indexDetail(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.Statistics indexStatistics(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics for each agents.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail indexStatisticsDetail(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexStatisticsDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index property.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail indexProperty(org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexPropertyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Index.
   * <pre>
   * Overview
   * Represent the index manager service.
   * </pre>
   */
  public static final class IndexFutureStub
      extends io.grpc.stub.AbstractFutureStub<IndexFutureStub> {
    private IndexFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.Count> indexInfo(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index information for each agents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.Detail> indexDetail(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.Statistics> indexStatistics(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index statistics for each agents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail> indexStatisticsDetail(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexStatisticsDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overview
     * Represent the RPC to get the index property.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail> indexProperty(
        org.vdaas.vald.api.v1.payload.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexPropertyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INDEX_INFO = 0;
  private static final int METHODID_INDEX_DETAIL = 1;
  private static final int METHODID_INDEX_STATISTICS = 2;
  private static final int METHODID_INDEX_STATISTICS_DETAIL = 3;
  private static final int METHODID_INDEX_PROPERTY = 4;

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
        case METHODID_INDEX_INFO:
          serviceImpl.indexInfo((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Count>) responseObserver);
          break;
        case METHODID_INDEX_DETAIL:
          serviceImpl.indexDetail((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Detail>) responseObserver);
          break;
        case METHODID_INDEX_STATISTICS:
          serviceImpl.indexStatistics((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.Statistics>) responseObserver);
          break;
        case METHODID_INDEX_STATISTICS_DETAIL:
          serviceImpl.indexStatisticsDetail((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail>) responseObserver);
          break;
        case METHODID_INDEX_PROPERTY:
          serviceImpl.indexProperty((org.vdaas.vald.api.v1.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail>) responseObserver);
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
          getIndexInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Empty,
              org.vdaas.vald.api.v1.payload.Info.Index.Count>(
                service, METHODID_INDEX_INFO)))
        .addMethod(
          getIndexDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Empty,
              org.vdaas.vald.api.v1.payload.Info.Index.Detail>(
                service, METHODID_INDEX_DETAIL)))
        .addMethod(
          getIndexStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Empty,
              org.vdaas.vald.api.v1.payload.Info.Index.Statistics>(
                service, METHODID_INDEX_STATISTICS)))
        .addMethod(
          getIndexStatisticsDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Empty,
              org.vdaas.vald.api.v1.payload.Info.Index.StatisticsDetail>(
                service, METHODID_INDEX_STATISTICS_DETAIL)))
        .addMethod(
          getIndexPropertyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Empty,
              org.vdaas.vald.api.v1.payload.Info.Index.PropertyDetail>(
                service, METHODID_INDEX_PROPERTY)))
        .build();
  }

  private static abstract class IndexBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndexBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdIndex.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Index");
    }
  }

  private static final class IndexFileDescriptorSupplier
      extends IndexBaseDescriptorSupplier {
    IndexFileDescriptorSupplier() {}
  }

  private static final class IndexMethodDescriptorSupplier
      extends IndexBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IndexMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IndexGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndexFileDescriptorSupplier())
              .addMethod(getIndexInfoMethod())
              .addMethod(getIndexDetailMethod())
              .addMethod(getIndexStatisticsMethod())
              .addMethod(getIndexStatisticsDetailMethod())
              .addMethod(getIndexPropertyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
