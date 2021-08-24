package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: vald/apis/proto/v1/vald/search.proto")
public final class SearchGrpc {

  private SearchGrpc() {}

  public static final String SERVICE_NAME = "vald.v1.Search";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.Response> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = org.vdaas.vald.api.v1.payload.Search.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.Response> getSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.Response> getSearchMethod;
    if ((getSearchMethod = SearchGrpc.getSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSearchMethod = SearchGrpc.getSearchMethod) == null) {
          SearchGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByID",
      requestType = org.vdaas.vald.api.v1.payload.Search.IDRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.Response> getSearchByIDMethod;
    if ((getSearchByIDMethod = SearchGrpc.getSearchByIDMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSearchByIDMethod = SearchGrpc.getSearchByIDMethod) == null) {
          SearchGrpc.getSearchByIDMethod = getSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SearchByID"))
              .build();
        }
      }
    }
    return getSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSearch",
      requestType = org.vdaas.vald.api.v1.payload.Search.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchMethod;
    if ((getStreamSearchMethod = SearchGrpc.getStreamSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getStreamSearchMethod = SearchGrpc.getStreamSearchMethod) == null) {
          SearchGrpc.getStreamSearchMethod = getStreamSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("StreamSearch"))
              .build();
        }
      }
    }
    return getStreamSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSearchByID",
      requestType = org.vdaas.vald.api.v1.payload.Search.IDRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamSearchByIDMethod;
    if ((getStreamSearchByIDMethod = SearchGrpc.getStreamSearchByIDMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getStreamSearchByIDMethod = SearchGrpc.getStreamSearchByIDMethod) == null) {
          SearchGrpc.getStreamSearchByIDMethod = getStreamSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("StreamSearchByID"))
              .build();
        }
      }
    }
    return getStreamSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiSearch",
      requestType = org.vdaas.vald.api.v1.payload.Search.MultiRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Responses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiRequest, org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchMethod;
    if ((getMultiSearchMethod = SearchGrpc.getMultiSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getMultiSearchMethod = SearchGrpc.getMultiSearchMethod) == null) {
          SearchGrpc.getMultiSearchMethod = getMultiSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.MultiRequest, org.vdaas.vald.api.v1.payload.Search.Responses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.MultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Responses.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("MultiSearch"))
              .build();
        }
      }
    }
    return getMultiSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiSearchByID",
      requestType = org.vdaas.vald.api.v1.payload.Search.MultiIDRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Responses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest, org.vdaas.vald.api.v1.payload.Search.Responses> getMultiSearchByIDMethod;
    if ((getMultiSearchByIDMethod = SearchGrpc.getMultiSearchByIDMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getMultiSearchByIDMethod = SearchGrpc.getMultiSearchByIDMethod) == null) {
          SearchGrpc.getMultiSearchByIDMethod = getMultiSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest, org.vdaas.vald.api.v1.payload.Search.Responses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiSearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.MultiIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Responses.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("MultiSearchByID"))
              .build();
        }
      }
    }
    return getMultiSearchByIDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchStub>() {
        @java.lang.Override
        public SearchStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchStub(channel, callOptions);
        }
      };
    return SearchStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchBlockingStub>() {
        @java.lang.Override
        public SearchBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchBlockingStub(channel, callOptions);
        }
      };
    return SearchBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchFutureStub>() {
        @java.lang.Override
        public SearchFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchFutureStub(channel, callOptions);
        }
      };
    return SearchFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SearchImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(org.vdaas.vald.api.v1.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void searchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchByIDMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Request> streamSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamSearchMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.IDRequest> streamSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamSearchByIDMethod(), responseObserver);
    }

    /**
     */
    public void multiSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiSearchMethod(), responseObserver);
    }

    /**
     */
    public void multiSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiSearchByIDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.Request,
                org.vdaas.vald.api.v1.payload.Search.Response>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.IDRequest,
                org.vdaas.vald.api.v1.payload.Search.Response>(
                  this, METHODID_SEARCH_BY_ID)))
          .addMethod(
            getStreamSearchMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.Request,
                org.vdaas.vald.api.v1.payload.Search.StreamResponse>(
                  this, METHODID_STREAM_SEARCH)))
          .addMethod(
            getStreamSearchByIDMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.IDRequest,
                org.vdaas.vald.api.v1.payload.Search.StreamResponse>(
                  this, METHODID_STREAM_SEARCH_BY_ID)))
          .addMethod(
            getMultiSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.MultiRequest,
                org.vdaas.vald.api.v1.payload.Search.Responses>(
                  this, METHODID_MULTI_SEARCH)))
          .addMethod(
            getMultiSearchByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.api.v1.payload.Search.MultiIDRequest,
                org.vdaas.vald.api.v1.payload.Search.Responses>(
                  this, METHODID_MULTI_SEARCH_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SearchStub extends io.grpc.stub.AbstractAsyncStub<SearchStub> {
    private SearchStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchStub(channel, callOptions);
    }

    /**
     */
    public void search(org.vdaas.vald.api.v1.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Request> streamSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.IDRequest> streamSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchByIDMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchBlockingStub extends io.grpc.stub.AbstractBlockingStub<SearchBlockingStub> {
    private SearchBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Search.Response search(org.vdaas.vald.api.v1.payload.Search.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Search.Response searchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Search.Responses multiSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.api.v1.payload.Search.Responses multiSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiSearchByIDMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchFutureStub extends io.grpc.stub.AbstractFutureStub<SearchFutureStub> {
    private SearchFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> search(
        org.vdaas.vald.api.v1.payload.Search.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> searchByID(
        org.vdaas.vald.api.v1.payload.Search.IDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Responses> multiSearch(
        org.vdaas.vald.api.v1.payload.Search.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Responses> multiSearchByID(
        org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiSearchByIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_SEARCH_BY_ID = 1;
  private static final int METHODID_MULTI_SEARCH = 2;
  private static final int METHODID_MULTI_SEARCH_BY_ID = 3;
  private static final int METHODID_STREAM_SEARCH = 4;
  private static final int METHODID_STREAM_SEARCH_BY_ID = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((org.vdaas.vald.api.v1.payload.Search.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response>) responseObserver);
          break;
        case METHODID_SEARCH_BY_ID:
          serviceImpl.searchByID((org.vdaas.vald.api.v1.payload.Search.IDRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response>) responseObserver);
          break;
        case METHODID_MULTI_SEARCH:
          serviceImpl.multiSearch((org.vdaas.vald.api.v1.payload.Search.MultiRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses>) responseObserver);
          break;
        case METHODID_MULTI_SEARCH_BY_ID:
          serviceImpl.multiSearchByID((org.vdaas.vald.api.v1.payload.Search.MultiIDRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses>) responseObserver);
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
        case METHODID_STREAM_SEARCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamSearch(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse>) responseObserver);
        case METHODID_STREAM_SEARCH_BY_ID:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamSearchByID(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.api.v1.vald.ValdSearch.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Search");
    }
  }

  private static final class SearchFileDescriptorSupplier
      extends SearchBaseDescriptorSupplier {
    SearchFileDescriptorSupplier() {}
  }

  private static final class SearchMethodDescriptorSupplier
      extends SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getSearchByIDMethod())
              .addMethod(getStreamSearchMethod())
              .addMethod(getStreamSearchByIDMethod())
              .addMethod(getMultiSearchMethod())
              .addMethod(getMultiSearchByIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
