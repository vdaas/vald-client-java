package org.vdaas.vald.api.v1.vald;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Search service provides ways to search indexed vectors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: v1/vald/search.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchGrpc {

  private SearchGrpc() {}

  public static final java.lang.String SERVICE_NAME = "vald.v1.Search";

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

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.Response> getLinearSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinearSearch",
      requestType = org.vdaas.vald.api.v1.payload.Search.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.Response> getLinearSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.Response> getLinearSearchMethod;
    if ((getLinearSearchMethod = SearchGrpc.getLinearSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getLinearSearchMethod = SearchGrpc.getLinearSearchMethod) == null) {
          SearchGrpc.getLinearSearchMethod = getLinearSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinearSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("LinearSearch"))
              .build();
        }
      }
    }
    return getLinearSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getLinearSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LinearSearchByID",
      requestType = org.vdaas.vald.api.v1.payload.Search.IDRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.Response> getLinearSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.Response> getLinearSearchByIDMethod;
    if ((getLinearSearchByIDMethod = SearchGrpc.getLinearSearchByIDMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getLinearSearchByIDMethod = SearchGrpc.getLinearSearchByIDMethod) == null) {
          SearchGrpc.getLinearSearchByIDMethod = getLinearSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LinearSearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("LinearSearchByID"))
              .build();
        }
      }
    }
    return getLinearSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamLinearSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLinearSearch",
      requestType = org.vdaas.vald.api.v1.payload.Search.Request.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamLinearSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamLinearSearchMethod;
    if ((getStreamLinearSearchMethod = SearchGrpc.getStreamLinearSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getStreamLinearSearchMethod = SearchGrpc.getStreamLinearSearchMethod) == null) {
          SearchGrpc.getStreamLinearSearchMethod = getStreamLinearSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.Request, org.vdaas.vald.api.v1.payload.Search.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLinearSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("StreamLinearSearch"))
              .build();
        }
      }
    }
    return getStreamLinearSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamLinearSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLinearSearchByID",
      requestType = org.vdaas.vald.api.v1.payload.Search.IDRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest,
      org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamLinearSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.StreamResponse> getStreamLinearSearchByIDMethod;
    if ((getStreamLinearSearchByIDMethod = SearchGrpc.getStreamLinearSearchByIDMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getStreamLinearSearchByIDMethod = SearchGrpc.getStreamLinearSearchByIDMethod) == null) {
          SearchGrpc.getStreamLinearSearchByIDMethod = getStreamLinearSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.IDRequest, org.vdaas.vald.api.v1.payload.Search.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLinearSearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("StreamLinearSearchByID"))
              .build();
        }
      }
    }
    return getStreamLinearSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiLinearSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiLinearSearch",
      requestType = org.vdaas.vald.api.v1.payload.Search.MultiRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Responses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiLinearSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiRequest, org.vdaas.vald.api.v1.payload.Search.Responses> getMultiLinearSearchMethod;
    if ((getMultiLinearSearchMethod = SearchGrpc.getMultiLinearSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getMultiLinearSearchMethod = SearchGrpc.getMultiLinearSearchMethod) == null) {
          SearchGrpc.getMultiLinearSearchMethod = getMultiLinearSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.MultiRequest, org.vdaas.vald.api.v1.payload.Search.Responses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiLinearSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.MultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Responses.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("MultiLinearSearch"))
              .build();
        }
      }
    }
    return getMultiLinearSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiLinearSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiLinearSearchByID",
      requestType = org.vdaas.vald.api.v1.payload.Search.MultiIDRequest.class,
      responseType = org.vdaas.vald.api.v1.payload.Search.Responses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest,
      org.vdaas.vald.api.v1.payload.Search.Responses> getMultiLinearSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest, org.vdaas.vald.api.v1.payload.Search.Responses> getMultiLinearSearchByIDMethod;
    if ((getMultiLinearSearchByIDMethod = SearchGrpc.getMultiLinearSearchByIDMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getMultiLinearSearchByIDMethod = SearchGrpc.getMultiLinearSearchByIDMethod) == null) {
          SearchGrpc.getMultiLinearSearchByIDMethod = getMultiLinearSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.api.v1.payload.Search.MultiIDRequest, org.vdaas.vald.api.v1.payload.Search.Responses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiLinearSearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.MultiIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.api.v1.payload.Search.Responses.getDefaultInstance()))
              .setSchemaDescriptor(new SearchMethodDescriptorSupplier("MultiLinearSearchByID"))
              .build();
        }
      }
    }
    return getMultiLinearSearchByIDMethod;
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
   * <pre>
   * Search service provides ways to search indexed vectors.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * A method to search indexed vectors by a raw vector.
     * </pre>
     */
    default void search(org.vdaas.vald.api.v1.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by ID.
     * </pre>
     */
    default void searchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple vectors.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Request> streamSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple IDs.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.IDRequest> streamSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamSearchByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple vectors in a single request.
     * </pre>
     */
    default void multiSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple IDs in a single request.
     * </pre>
     */
    default void multiSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiSearchByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by a raw vector.
     * </pre>
     */
    default void linearSearch(org.vdaas.vald.api.v1.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinearSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by ID.
     * </pre>
     */
    default void linearSearchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinearSearchByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple vectors.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Request> streamLinearSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamLinearSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple IDs.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.IDRequest> streamLinearSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamLinearSearchByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple vectors in a single
     * request.
     * </pre>
     */
    default void multiLinearSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiLinearSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple IDs in a single
     * request.
     * </pre>
     */
    default void multiLinearSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiLinearSearchByIDMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Search.
   * <pre>
   * Search service provides ways to search indexed vectors.
   * </pre>
   */
  public static abstract class SearchImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SearchGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Search.
   * <pre>
   * Search service provides ways to search indexed vectors.
   * </pre>
   */
  public static final class SearchStub
      extends io.grpc.stub.AbstractAsyncStub<SearchStub> {
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
     * <pre>
     * A method to search indexed vectors by a raw vector.
     * </pre>
     */
    public void search(org.vdaas.vald.api.v1.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by ID.
     * </pre>
     */
    public void searchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple vectors.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Request> streamSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple IDs.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.IDRequest> streamSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchByIDMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple vectors in a single request.
     * </pre>
     */
    public void multiSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple IDs in a single request.
     * </pre>
     */
    public void multiSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by a raw vector.
     * </pre>
     */
    public void linearSearch(org.vdaas.vald.api.v1.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinearSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by ID.
     * </pre>
     */
    public void linearSearchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinearSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple vectors.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Request> streamLinearSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamLinearSearchMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple IDs.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.IDRequest> streamLinearSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamLinearSearchByIDMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple vectors in a single
     * request.
     * </pre>
     */
    public void multiLinearSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiLinearSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple IDs in a single
     * request.
     * </pre>
     */
    public void multiLinearSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiLinearSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Search.
   * <pre>
   * Search service provides ways to search indexed vectors.
   * </pre>
   */
  public static final class SearchBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SearchBlockingStub> {
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
     * <pre>
     * A method to search indexed vectors by a raw vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Response search(org.vdaas.vald.api.v1.payload.Search.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to search indexed vectors by ID.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Response searchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple vectors in a single request.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Responses multiSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple IDs in a single request.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Responses multiSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiSearchByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by a raw vector.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Response linearSearch(org.vdaas.vald.api.v1.payload.Search.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinearSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by ID.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Response linearSearchByID(org.vdaas.vald.api.v1.payload.Search.IDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinearSearchByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple vectors in a single
     * request.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Responses multiLinearSearch(org.vdaas.vald.api.v1.payload.Search.MultiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiLinearSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple IDs in a single
     * request.
     * </pre>
     */
    public org.vdaas.vald.api.v1.payload.Search.Responses multiLinearSearchByID(org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiLinearSearchByIDMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Search.
   * <pre>
   * Search service provides ways to search indexed vectors.
   * </pre>
   */
  public static final class SearchFutureStub
      extends io.grpc.stub.AbstractFutureStub<SearchFutureStub> {
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
     * <pre>
     * A method to search indexed vectors by a raw vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> search(
        org.vdaas.vald.api.v1.payload.Search.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to search indexed vectors by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> searchByID(
        org.vdaas.vald.api.v1.payload.Search.IDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple vectors in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Responses> multiSearch(
        org.vdaas.vald.api.v1.payload.Search.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to search indexed vectors by multiple IDs in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Responses> multiSearchByID(
        org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiSearchByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by a raw vector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> linearSearch(
        org.vdaas.vald.api.v1.payload.Search.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinearSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Response> linearSearchByID(
        org.vdaas.vald.api.v1.payload.Search.IDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinearSearchByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple vectors in a single
     * request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Responses> multiLinearSearch(
        org.vdaas.vald.api.v1.payload.Search.MultiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiLinearSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method to linear search indexed vectors by multiple IDs in a single
     * request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.api.v1.payload.Search.Responses> multiLinearSearchByID(
        org.vdaas.vald.api.v1.payload.Search.MultiIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiLinearSearchByIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_SEARCH_BY_ID = 1;
  private static final int METHODID_MULTI_SEARCH = 2;
  private static final int METHODID_MULTI_SEARCH_BY_ID = 3;
  private static final int METHODID_LINEAR_SEARCH = 4;
  private static final int METHODID_LINEAR_SEARCH_BY_ID = 5;
  private static final int METHODID_MULTI_LINEAR_SEARCH = 6;
  private static final int METHODID_MULTI_LINEAR_SEARCH_BY_ID = 7;
  private static final int METHODID_STREAM_SEARCH = 8;
  private static final int METHODID_STREAM_SEARCH_BY_ID = 9;
  private static final int METHODID_STREAM_LINEAR_SEARCH = 10;
  private static final int METHODID_STREAM_LINEAR_SEARCH_BY_ID = 11;

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
        case METHODID_LINEAR_SEARCH:
          serviceImpl.linearSearch((org.vdaas.vald.api.v1.payload.Search.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response>) responseObserver);
          break;
        case METHODID_LINEAR_SEARCH_BY_ID:
          serviceImpl.linearSearchByID((org.vdaas.vald.api.v1.payload.Search.IDRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Response>) responseObserver);
          break;
        case METHODID_MULTI_LINEAR_SEARCH:
          serviceImpl.multiLinearSearch((org.vdaas.vald.api.v1.payload.Search.MultiRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.Responses>) responseObserver);
          break;
        case METHODID_MULTI_LINEAR_SEARCH_BY_ID:
          serviceImpl.multiLinearSearchByID((org.vdaas.vald.api.v1.payload.Search.MultiIDRequest) request,
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
        case METHODID_STREAM_LINEAR_SEARCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamLinearSearch(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse>) responseObserver);
        case METHODID_STREAM_LINEAR_SEARCH_BY_ID:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamLinearSearchByID(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.api.v1.payload.Search.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.Request,
              org.vdaas.vald.api.v1.payload.Search.Response>(
                service, METHODID_SEARCH)))
        .addMethod(
          getSearchByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.IDRequest,
              org.vdaas.vald.api.v1.payload.Search.Response>(
                service, METHODID_SEARCH_BY_ID)))
        .addMethod(
          getStreamSearchMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.Request,
              org.vdaas.vald.api.v1.payload.Search.StreamResponse>(
                service, METHODID_STREAM_SEARCH)))
        .addMethod(
          getStreamSearchByIDMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.IDRequest,
              org.vdaas.vald.api.v1.payload.Search.StreamResponse>(
                service, METHODID_STREAM_SEARCH_BY_ID)))
        .addMethod(
          getMultiSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.MultiRequest,
              org.vdaas.vald.api.v1.payload.Search.Responses>(
                service, METHODID_MULTI_SEARCH)))
        .addMethod(
          getMultiSearchByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.MultiIDRequest,
              org.vdaas.vald.api.v1.payload.Search.Responses>(
                service, METHODID_MULTI_SEARCH_BY_ID)))
        .addMethod(
          getLinearSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.Request,
              org.vdaas.vald.api.v1.payload.Search.Response>(
                service, METHODID_LINEAR_SEARCH)))
        .addMethod(
          getLinearSearchByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.IDRequest,
              org.vdaas.vald.api.v1.payload.Search.Response>(
                service, METHODID_LINEAR_SEARCH_BY_ID)))
        .addMethod(
          getStreamLinearSearchMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.Request,
              org.vdaas.vald.api.v1.payload.Search.StreamResponse>(
                service, METHODID_STREAM_LINEAR_SEARCH)))
        .addMethod(
          getStreamLinearSearchByIDMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.IDRequest,
              org.vdaas.vald.api.v1.payload.Search.StreamResponse>(
                service, METHODID_STREAM_LINEAR_SEARCH_BY_ID)))
        .addMethod(
          getMultiLinearSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.MultiRequest,
              org.vdaas.vald.api.v1.payload.Search.Responses>(
                service, METHODID_MULTI_LINEAR_SEARCH)))
        .addMethod(
          getMultiLinearSearchByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.vdaas.vald.api.v1.payload.Search.MultiIDRequest,
              org.vdaas.vald.api.v1.payload.Search.Responses>(
                service, METHODID_MULTI_LINEAR_SEARCH_BY_ID)))
        .build();
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
    private final java.lang.String methodName;

    SearchMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getLinearSearchMethod())
              .addMethod(getLinearSearchByIDMethod())
              .addMethod(getStreamLinearSearchMethod())
              .addMethod(getStreamLinearSearchByIDMethod())
              .addMethod(getMultiLinearSearchMethod())
              .addMethod(getMultiLinearSearchByIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
