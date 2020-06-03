package org.vdaas.vald.gateway.vald;

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
    comments = "Source: vald/vald.proto")
public final class ValdGrpc {

  private ValdGrpc() {}

  public static final String SERVICE_NAME = "vald.Vald";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Object.ID> getExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exists",
      requestType = org.vdaas.vald.payload.Object.ID.class,
      responseType = org.vdaas.vald.payload.Object.ID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Object.ID> getExistsMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Object.ID> getExistsMethod;
    if ((getExistsMethod = ValdGrpc.getExistsMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getExistsMethod = ValdGrpc.getExistsMethod) == null) {
          ValdGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Object.ID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("Exists"))
              .build();
        }
      }
    }
    return getExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.Request,
      org.vdaas.vald.payload.Search.Response> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = org.vdaas.vald.payload.Search.Request.class,
      responseType = org.vdaas.vald.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.Request,
      org.vdaas.vald.payload.Search.Response> getSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.Request, org.vdaas.vald.payload.Search.Response> getSearchMethod;
    if ((getSearchMethod = ValdGrpc.getSearchMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getSearchMethod = ValdGrpc.getSearchMethod) == null) {
          ValdGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.Request, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.IDRequest,
      org.vdaas.vald.payload.Search.Response> getSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByID",
      requestType = org.vdaas.vald.payload.Search.IDRequest.class,
      responseType = org.vdaas.vald.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.IDRequest,
      org.vdaas.vald.payload.Search.Response> getSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.IDRequest, org.vdaas.vald.payload.Search.Response> getSearchByIDMethod;
    if ((getSearchByIDMethod = ValdGrpc.getSearchByIDMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getSearchByIDMethod = ValdGrpc.getSearchByIDMethod) == null) {
          ValdGrpc.getSearchByIDMethod = getSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.IDRequest, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("SearchByID"))
              .build();
        }
      }
    }
    return getSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.Request,
      org.vdaas.vald.payload.Search.Response> getStreamSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSearch",
      requestType = org.vdaas.vald.payload.Search.Request.class,
      responseType = org.vdaas.vald.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.Request,
      org.vdaas.vald.payload.Search.Response> getStreamSearchMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.Request, org.vdaas.vald.payload.Search.Response> getStreamSearchMethod;
    if ((getStreamSearchMethod = ValdGrpc.getStreamSearchMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getStreamSearchMethod = ValdGrpc.getStreamSearchMethod) == null) {
          ValdGrpc.getStreamSearchMethod = getStreamSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.Request, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("StreamSearch"))
              .build();
        }
      }
    }
    return getStreamSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.IDRequest,
      org.vdaas.vald.payload.Search.Response> getStreamSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSearchByID",
      requestType = org.vdaas.vald.payload.Search.IDRequest.class,
      responseType = org.vdaas.vald.payload.Search.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.IDRequest,
      org.vdaas.vald.payload.Search.Response> getStreamSearchByIDMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Search.IDRequest, org.vdaas.vald.payload.Search.Response> getStreamSearchByIDMethod;
    if ((getStreamSearchByIDMethod = ValdGrpc.getStreamSearchByIDMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getStreamSearchByIDMethod = ValdGrpc.getStreamSearchByIDMethod) == null) {
          ValdGrpc.getStreamSearchByIDMethod = getStreamSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.IDRequest, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("StreamSearchByID"))
              .build();
        }
      }
    }
    return getStreamSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Insert",
      requestType = org.vdaas.vald.payload.Object.Vector.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getInsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty> getInsertMethod;
    if ((getInsertMethod = ValdGrpc.getInsertMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getInsertMethod = ValdGrpc.getInsertMethod) == null) {
          ValdGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("Insert"))
              .build();
        }
      }
    }
    return getInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getStreamInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInsert",
      requestType = org.vdaas.vald.payload.Object.Vector.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getStreamInsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty> getStreamInsertMethod;
    if ((getStreamInsertMethod = ValdGrpc.getStreamInsertMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getStreamInsertMethod = ValdGrpc.getStreamInsertMethod) == null) {
          ValdGrpc.getStreamInsertMethod = getStreamInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("StreamInsert"))
              .build();
        }
      }
    }
    return getStreamInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors,
      org.vdaas.vald.payload.Empty> getMultiInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiInsert",
      requestType = org.vdaas.vald.payload.Object.Vectors.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors,
      org.vdaas.vald.payload.Empty> getMultiInsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty> getMultiInsertMethod;
    if ((getMultiInsertMethod = ValdGrpc.getMultiInsertMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getMultiInsertMethod = ValdGrpc.getMultiInsertMethod) == null) {
          ValdGrpc.getMultiInsertMethod = getMultiInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vectors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("MultiInsert"))
              .build();
        }
      }
    }
    return getMultiInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = org.vdaas.vald.payload.Object.Vector.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getUpdateMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty> getUpdateMethod;
    if ((getUpdateMethod = ValdGrpc.getUpdateMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getUpdateMethod = ValdGrpc.getUpdateMethod) == null) {
          ValdGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getStreamUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpdate",
      requestType = org.vdaas.vald.payload.Object.Vector.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getStreamUpdateMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty> getStreamUpdateMethod;
    if ((getStreamUpdateMethod = ValdGrpc.getStreamUpdateMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getStreamUpdateMethod = ValdGrpc.getStreamUpdateMethod) == null) {
          ValdGrpc.getStreamUpdateMethod = getStreamUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("StreamUpdate"))
              .build();
        }
      }
    }
    return getStreamUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors,
      org.vdaas.vald.payload.Empty> getMultiUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpdate",
      requestType = org.vdaas.vald.payload.Object.Vectors.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors,
      org.vdaas.vald.payload.Empty> getMultiUpdateMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty> getMultiUpdateMethod;
    if ((getMultiUpdateMethod = ValdGrpc.getMultiUpdateMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getMultiUpdateMethod = ValdGrpc.getMultiUpdateMethod) == null) {
          ValdGrpc.getMultiUpdateMethod = getMultiUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vectors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("MultiUpdate"))
              .build();
        }
      }
    }
    return getMultiUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getUpsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upsert",
      requestType = org.vdaas.vald.payload.Object.Vector.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getUpsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty> getUpsertMethod;
    if ((getUpsertMethod = ValdGrpc.getUpsertMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getUpsertMethod = ValdGrpc.getUpsertMethod) == null) {
          ValdGrpc.getUpsertMethod = getUpsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("Upsert"))
              .build();
        }
      }
    }
    return getUpsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getStreamUpsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpsert",
      requestType = org.vdaas.vald.payload.Object.Vector.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector,
      org.vdaas.vald.payload.Empty> getStreamUpsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty> getStreamUpsertMethod;
    if ((getStreamUpsertMethod = ValdGrpc.getStreamUpsertMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getStreamUpsertMethod = ValdGrpc.getStreamUpsertMethod) == null) {
          ValdGrpc.getStreamUpsertMethod = getStreamUpsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("StreamUpsert"))
              .build();
        }
      }
    }
    return getStreamUpsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors,
      org.vdaas.vald.payload.Empty> getMultiUpsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiUpsert",
      requestType = org.vdaas.vald.payload.Object.Vectors.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors,
      org.vdaas.vald.payload.Empty> getMultiUpsertMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty> getMultiUpsertMethod;
    if ((getMultiUpsertMethod = ValdGrpc.getMultiUpsertMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getMultiUpsertMethod = ValdGrpc.getMultiUpsertMethod) == null) {
          ValdGrpc.getMultiUpsertMethod = getMultiUpsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vectors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("MultiUpsert"))
              .build();
        }
      }
    }
    return getMultiUpsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Empty> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = org.vdaas.vald.payload.Object.ID.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Empty> getRemoveMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Empty> getRemoveMethod;
    if ((getRemoveMethod = ValdGrpc.getRemoveMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getRemoveMethod = ValdGrpc.getRemoveMethod) == null) {
          ValdGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Empty> getStreamRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamRemove",
      requestType = org.vdaas.vald.payload.Object.ID.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Empty> getStreamRemoveMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Empty> getStreamRemoveMethod;
    if ((getStreamRemoveMethod = ValdGrpc.getStreamRemoveMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getStreamRemoveMethod = ValdGrpc.getStreamRemoveMethod) == null) {
          ValdGrpc.getStreamRemoveMethod = getStreamRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("StreamRemove"))
              .build();
        }
      }
    }
    return getStreamRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.IDs,
      org.vdaas.vald.payload.Empty> getMultiRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiRemove",
      requestType = org.vdaas.vald.payload.Object.IDs.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.IDs,
      org.vdaas.vald.payload.Empty> getMultiRemoveMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.IDs, org.vdaas.vald.payload.Empty> getMultiRemoveMethod;
    if ((getMultiRemoveMethod = ValdGrpc.getMultiRemoveMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getMultiRemoveMethod = ValdGrpc.getMultiRemoveMethod) == null) {
          ValdGrpc.getMultiRemoveMethod = getMultiRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.IDs, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.IDs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("MultiRemove"))
              .build();
        }
      }
    }
    return getMultiRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Backup.MetaVector> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = org.vdaas.vald.payload.Object.ID.class,
      responseType = org.vdaas.vald.payload.Backup.MetaVector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Backup.MetaVector> getGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Backup.MetaVector> getGetObjectMethod;
    if ((getGetObjectMethod = ValdGrpc.getGetObjectMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getGetObjectMethod = ValdGrpc.getGetObjectMethod) == null) {
          ValdGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Backup.MetaVector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Backup.MetaVector.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Backup.MetaVector> getStreamGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamGetObject",
      requestType = org.vdaas.vald.payload.Object.ID.class,
      responseType = org.vdaas.vald.payload.Backup.MetaVector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Backup.MetaVector> getStreamGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Backup.MetaVector> getStreamGetObjectMethod;
    if ((getStreamGetObjectMethod = ValdGrpc.getStreamGetObjectMethod) == null) {
      synchronized (ValdGrpc.class) {
        if ((getStreamGetObjectMethod = ValdGrpc.getStreamGetObjectMethod) == null) {
          ValdGrpc.getStreamGetObjectMethod = getStreamGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Backup.MetaVector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamGetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Backup.MetaVector.getDefaultInstance()))
              .setSchemaDescriptor(new ValdMethodDescriptorSupplier("StreamGetObject"))
              .build();
        }
      }
    }
    return getStreamGetObjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValdStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValdStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValdStub>() {
        @java.lang.Override
        public ValdStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValdStub(channel, callOptions);
        }
      };
    return ValdStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValdBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValdBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValdBlockingStub>() {
        @java.lang.Override
        public ValdBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValdBlockingStub(channel, callOptions);
        }
      };
    return ValdBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValdFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValdFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValdFutureStub>() {
        @java.lang.Override
        public ValdFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValdFutureStub(channel, callOptions);
        }
      };
    return ValdFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ValdImplBase implements io.grpc.BindableService {

    /**
     */
    public void exists(org.vdaas.vald.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> responseObserver) {
      asyncUnimplementedUnaryCall(getExistsMethod(), responseObserver);
    }

    /**
     */
    public void search(org.vdaas.vald.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void searchByID(org.vdaas.vald.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByIDMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Request> streamSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamSearchMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.IDRequest> streamSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamSearchByIDMethod(), responseObserver);
    }

    /**
     */
    public void insert(org.vdaas.vald.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> streamInsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamInsertMethod(), responseObserver);
    }

    /**
     */
    public void multiInsert(org.vdaas.vald.payload.Object.Vectors request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiInsertMethod(), responseObserver);
    }

    /**
     */
    public void update(org.vdaas.vald.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> streamUpdate(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamUpdateMethod(), responseObserver);
    }

    /**
     */
    public void multiUpdate(org.vdaas.vald.payload.Object.Vectors request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiUpdateMethod(), responseObserver);
    }

    /**
     */
    public void upsert(org.vdaas.vald.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> streamUpsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamUpsertMethod(), responseObserver);
    }

    /**
     */
    public void multiUpsert(org.vdaas.vald.payload.Object.Vectors request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiUpsertMethod(), responseObserver);
    }

    /**
     */
    public void remove(org.vdaas.vald.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> streamRemove(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamRemoveMethod(), responseObserver);
    }

    /**
     */
    public void multiRemove(org.vdaas.vald.payload.Object.IDs request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiRemoveMethod(), responseObserver);
    }

    /**
     */
    public void getObject(org.vdaas.vald.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Backup.MetaVector> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Backup.MetaVector> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamGetObjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.ID,
                org.vdaas.vald.payload.Object.ID>(
                  this, METHODID_EXISTS)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Search.Request,
                org.vdaas.vald.payload.Search.Response>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Search.IDRequest,
                org.vdaas.vald.payload.Search.Response>(
                  this, METHODID_SEARCH_BY_ID)))
          .addMethod(
            getStreamSearchMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Search.Request,
                org.vdaas.vald.payload.Search.Response>(
                  this, METHODID_STREAM_SEARCH)))
          .addMethod(
            getStreamSearchByIDMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Search.IDRequest,
                org.vdaas.vald.payload.Search.Response>(
                  this, METHODID_STREAM_SEARCH_BY_ID)))
          .addMethod(
            getInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vector,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_INSERT)))
          .addMethod(
            getStreamInsertMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vector,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_STREAM_INSERT)))
          .addMethod(
            getMultiInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vectors,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_MULTI_INSERT)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vector,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getStreamUpdateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vector,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_STREAM_UPDATE)))
          .addMethod(
            getMultiUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vectors,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_MULTI_UPDATE)))
          .addMethod(
            getUpsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vector,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_UPSERT)))
          .addMethod(
            getStreamUpsertMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vector,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_STREAM_UPSERT)))
          .addMethod(
            getMultiUpsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.Vectors,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_MULTI_UPSERT)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.ID,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getStreamRemoveMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.ID,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_STREAM_REMOVE)))
          .addMethod(
            getMultiRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.IDs,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_MULTI_REMOVE)))
          .addMethod(
            getGetObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.ID,
                org.vdaas.vald.payload.Backup.MetaVector>(
                  this, METHODID_GET_OBJECT)))
          .addMethod(
            getStreamGetObjectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.ID,
                org.vdaas.vald.payload.Backup.MetaVector>(
                  this, METHODID_STREAM_GET_OBJECT)))
          .build();
    }
  }

  /**
   */
  public static final class ValdStub extends io.grpc.stub.AbstractAsyncStub<ValdStub> {
    private ValdStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValdStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValdStub(channel, callOptions);
    }

    /**
     */
    public void exists(org.vdaas.vald.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(org.vdaas.vald.payload.Search.Request request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByID(org.vdaas.vald.payload.Search.IDRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Request> streamSearch(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.IDRequest> streamSearchByID(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamSearchByIDMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void insert(org.vdaas.vald.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> streamInsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamInsertMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiInsert(org.vdaas.vald.payload.Object.Vectors request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(org.vdaas.vald.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> streamUpdate(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpdateMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiUpdate(org.vdaas.vald.payload.Object.Vectors request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsert(org.vdaas.vald.payload.Object.Vector request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> streamUpsert(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamUpsertMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiUpsert(org.vdaas.vald.payload.Object.Vectors request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiUpsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remove(org.vdaas.vald.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> streamRemove(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamRemoveMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void multiRemove(org.vdaas.vald.payload.Object.IDs request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObject(org.vdaas.vald.payload.Object.ID request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Backup.MetaVector> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Backup.MetaVector> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamGetObjectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ValdBlockingStub extends io.grpc.stub.AbstractBlockingStub<ValdBlockingStub> {
    private ValdBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValdBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValdBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.vdaas.vald.payload.Object.ID exists(org.vdaas.vald.payload.Object.ID request) {
      return blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Search.Response search(org.vdaas.vald.payload.Search.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Search.Response searchByID(org.vdaas.vald.payload.Search.IDRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty insert(org.vdaas.vald.payload.Object.Vector request) {
      return blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty multiInsert(org.vdaas.vald.payload.Object.Vectors request) {
      return blockingUnaryCall(
          getChannel(), getMultiInsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty update(org.vdaas.vald.payload.Object.Vector request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty multiUpdate(org.vdaas.vald.payload.Object.Vectors request) {
      return blockingUnaryCall(
          getChannel(), getMultiUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty upsert(org.vdaas.vald.payload.Object.Vector request) {
      return blockingUnaryCall(
          getChannel(), getUpsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty multiUpsert(org.vdaas.vald.payload.Object.Vectors request) {
      return blockingUnaryCall(
          getChannel(), getMultiUpsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty remove(org.vdaas.vald.payload.Object.ID request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty multiRemove(org.vdaas.vald.payload.Object.IDs request) {
      return blockingUnaryCall(
          getChannel(), getMultiRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Backup.MetaVector getObject(org.vdaas.vald.payload.Object.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ValdFutureStub extends io.grpc.stub.AbstractFutureStub<ValdFutureStub> {
    private ValdFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValdFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValdFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Object.ID> exists(
        org.vdaas.vald.payload.Object.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Search.Response> search(
        org.vdaas.vald.payload.Search.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Search.Response> searchByID(
        org.vdaas.vald.payload.Search.IDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> insert(
        org.vdaas.vald.payload.Object.Vector request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> multiInsert(
        org.vdaas.vald.payload.Object.Vectors request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiInsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> update(
        org.vdaas.vald.payload.Object.Vector request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> multiUpdate(
        org.vdaas.vald.payload.Object.Vectors request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> upsert(
        org.vdaas.vald.payload.Object.Vector request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> multiUpsert(
        org.vdaas.vald.payload.Object.Vectors request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiUpsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> remove(
        org.vdaas.vald.payload.Object.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> multiRemove(
        org.vdaas.vald.payload.Object.IDs request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Backup.MetaVector> getObject(
        org.vdaas.vald.payload.Object.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXISTS = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_SEARCH_BY_ID = 2;
  private static final int METHODID_INSERT = 3;
  private static final int METHODID_MULTI_INSERT = 4;
  private static final int METHODID_UPDATE = 5;
  private static final int METHODID_MULTI_UPDATE = 6;
  private static final int METHODID_UPSERT = 7;
  private static final int METHODID_MULTI_UPSERT = 8;
  private static final int METHODID_REMOVE = 9;
  private static final int METHODID_MULTI_REMOVE = 10;
  private static final int METHODID_GET_OBJECT = 11;
  private static final int METHODID_STREAM_SEARCH = 12;
  private static final int METHODID_STREAM_SEARCH_BY_ID = 13;
  private static final int METHODID_STREAM_INSERT = 14;
  private static final int METHODID_STREAM_UPDATE = 15;
  private static final int METHODID_STREAM_UPSERT = 16;
  private static final int METHODID_STREAM_REMOVE = 17;
  private static final int METHODID_STREAM_GET_OBJECT = 18;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValdImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValdImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXISTS:
          serviceImpl.exists((org.vdaas.vald.payload.Object.ID) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((org.vdaas.vald.payload.Search.Request) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response>) responseObserver);
          break;
        case METHODID_SEARCH_BY_ID:
          serviceImpl.searchByID((org.vdaas.vald.payload.Search.IDRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response>) responseObserver);
          break;
        case METHODID_INSERT:
          serviceImpl.insert((org.vdaas.vald.payload.Object.Vector) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_MULTI_INSERT:
          serviceImpl.multiInsert((org.vdaas.vald.payload.Object.Vectors) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((org.vdaas.vald.payload.Object.Vector) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_MULTI_UPDATE:
          serviceImpl.multiUpdate((org.vdaas.vald.payload.Object.Vectors) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_UPSERT:
          serviceImpl.upsert((org.vdaas.vald.payload.Object.Vector) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_MULTI_UPSERT:
          serviceImpl.multiUpsert((org.vdaas.vald.payload.Object.Vectors) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((org.vdaas.vald.payload.Object.ID) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_MULTI_REMOVE:
          serviceImpl.multiRemove((org.vdaas.vald.payload.Object.IDs) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((org.vdaas.vald.payload.Object.ID) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Backup.MetaVector>) responseObserver);
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
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response>) responseObserver);
        case METHODID_STREAM_SEARCH_BY_ID:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamSearchByID(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Search.Response>) responseObserver);
        case METHODID_STREAM_INSERT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamInsert(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
        case METHODID_STREAM_UPDATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpdate(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
        case METHODID_STREAM_UPSERT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpsert(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
        case METHODID_STREAM_REMOVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRemove(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
        case METHODID_STREAM_GET_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamGetObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Backup.MetaVector>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ValdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValdBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.vdaas.vald.gateway.vald.ValdApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vald");
    }
  }

  private static final class ValdFileDescriptorSupplier
      extends ValdBaseDescriptorSupplier {
    ValdFileDescriptorSupplier() {}
  }

  private static final class ValdMethodDescriptorSupplier
      extends ValdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValdMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValdGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValdFileDescriptorSupplier())
              .addMethod(getExistsMethod())
              .addMethod(getSearchMethod())
              .addMethod(getSearchByIDMethod())
              .addMethod(getStreamSearchMethod())
              .addMethod(getStreamSearchByIDMethod())
              .addMethod(getInsertMethod())
              .addMethod(getStreamInsertMethod())
              .addMethod(getMultiInsertMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getStreamUpdateMethod())
              .addMethod(getMultiUpdateMethod())
              .addMethod(getUpsertMethod())
              .addMethod(getStreamUpsertMethod())
              .addMethod(getMultiUpsertMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getStreamRemoveMethod())
              .addMethod(getMultiRemoveMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getStreamGetObjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
