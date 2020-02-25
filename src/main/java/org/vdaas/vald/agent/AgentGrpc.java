package org.vdaas.vald.agent;

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
    comments = "Source: agent.proto")
public final class AgentGrpc {

  private AgentGrpc() {}

  public static final String SERVICE_NAME = "agent.Agent";

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
    if ((getExistsMethod = AgentGrpc.getExistsMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getExistsMethod = AgentGrpc.getExistsMethod) == null) {
          AgentGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Object.ID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("Exists"))
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
    if ((getSearchMethod = AgentGrpc.getSearchMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getSearchMethod = AgentGrpc.getSearchMethod) == null) {
          AgentGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.Request, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("Search"))
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
    if ((getSearchByIDMethod = AgentGrpc.getSearchByIDMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getSearchByIDMethod = AgentGrpc.getSearchByIDMethod) == null) {
          AgentGrpc.getSearchByIDMethod = getSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.IDRequest, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("SearchByID"))
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
    if ((getStreamSearchMethod = AgentGrpc.getStreamSearchMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getStreamSearchMethod = AgentGrpc.getStreamSearchMethod) == null) {
          AgentGrpc.getStreamSearchMethod = getStreamSearchMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.Request, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("StreamSearch"))
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
    if ((getStreamSearchByIDMethod = AgentGrpc.getStreamSearchByIDMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getStreamSearchByIDMethod = AgentGrpc.getStreamSearchByIDMethod) == null) {
          AgentGrpc.getStreamSearchByIDMethod = getStreamSearchByIDMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Search.IDRequest, org.vdaas.vald.payload.Search.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.IDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Search.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("StreamSearchByID"))
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
    if ((getInsertMethod = AgentGrpc.getInsertMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getInsertMethod = AgentGrpc.getInsertMethod) == null) {
          AgentGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("Insert"))
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
    if ((getStreamInsertMethod = AgentGrpc.getStreamInsertMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getStreamInsertMethod = AgentGrpc.getStreamInsertMethod) == null) {
          AgentGrpc.getStreamInsertMethod = getStreamInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("StreamInsert"))
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
    if ((getMultiInsertMethod = AgentGrpc.getMultiInsertMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getMultiInsertMethod = AgentGrpc.getMultiInsertMethod) == null) {
          AgentGrpc.getMultiInsertMethod = getMultiInsertMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vectors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("MultiInsert"))
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
    if ((getUpdateMethod = AgentGrpc.getUpdateMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getUpdateMethod = AgentGrpc.getUpdateMethod) == null) {
          AgentGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("Update"))
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
    if ((getStreamUpdateMethod = AgentGrpc.getStreamUpdateMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getStreamUpdateMethod = AgentGrpc.getStreamUpdateMethod) == null) {
          AgentGrpc.getStreamUpdateMethod = getStreamUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vector, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("StreamUpdate"))
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
    if ((getMultiUpdateMethod = AgentGrpc.getMultiUpdateMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getMultiUpdateMethod = AgentGrpc.getMultiUpdateMethod) == null) {
          AgentGrpc.getMultiUpdateMethod = getMultiUpdateMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.Vectors, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vectors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("MultiUpdate"))
              .build();
        }
      }
    }
    return getMultiUpdateMethod;
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
    if ((getRemoveMethod = AgentGrpc.getRemoveMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getRemoveMethod = AgentGrpc.getRemoveMethod) == null) {
          AgentGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("Remove"))
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
    if ((getStreamRemoveMethod = AgentGrpc.getStreamRemoveMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getStreamRemoveMethod = AgentGrpc.getStreamRemoveMethod) == null) {
          AgentGrpc.getStreamRemoveMethod = getStreamRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("StreamRemove"))
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
    if ((getMultiRemoveMethod = AgentGrpc.getMultiRemoveMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getMultiRemoveMethod = AgentGrpc.getMultiRemoveMethod) == null) {
          AgentGrpc.getMultiRemoveMethod = getMultiRemoveMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.IDs, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.IDs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("MultiRemove"))
              .build();
        }
      }
    }
    return getMultiRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Object.Vector> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = org.vdaas.vald.payload.Object.ID.class,
      responseType = org.vdaas.vald.payload.Object.Vector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Object.Vector> getGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Object.Vector> getGetObjectMethod;
    if ((getGetObjectMethod = AgentGrpc.getGetObjectMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getGetObjectMethod = AgentGrpc.getGetObjectMethod) == null) {
          AgentGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Object.Vector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Object.Vector> getStreamGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamGetObject",
      requestType = org.vdaas.vald.payload.Object.ID.class,
      responseType = org.vdaas.vald.payload.Object.Vector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID,
      org.vdaas.vald.payload.Object.Vector> getStreamGetObjectMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Object.Vector> getStreamGetObjectMethod;
    if ((getStreamGetObjectMethod = AgentGrpc.getStreamGetObjectMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getStreamGetObjectMethod = AgentGrpc.getStreamGetObjectMethod) == null) {
          AgentGrpc.getStreamGetObjectMethod = getStreamGetObjectMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Object.ID, org.vdaas.vald.payload.Object.Vector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamGetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Object.Vector.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("StreamGetObject"))
              .build();
        }
      }
    }
    return getStreamGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Control.CreateIndexRequest,
      org.vdaas.vald.payload.Empty> getCreateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIndex",
      requestType = org.vdaas.vald.payload.Control.CreateIndexRequest.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Control.CreateIndexRequest,
      org.vdaas.vald.payload.Empty> getCreateIndexMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Control.CreateIndexRequest, org.vdaas.vald.payload.Empty> getCreateIndexMethod;
    if ((getCreateIndexMethod = AgentGrpc.getCreateIndexMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getCreateIndexMethod = AgentGrpc.getCreateIndexMethod) == null) {
          AgentGrpc.getCreateIndexMethod = getCreateIndexMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Control.CreateIndexRequest, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Control.CreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("CreateIndex"))
              .build();
        }
      }
    }
    return getCreateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Empty,
      org.vdaas.vald.payload.Empty> getSaveIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveIndex",
      requestType = org.vdaas.vald.payload.Empty.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Empty,
      org.vdaas.vald.payload.Empty> getSaveIndexMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Empty, org.vdaas.vald.payload.Empty> getSaveIndexMethod;
    if ((getSaveIndexMethod = AgentGrpc.getSaveIndexMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getSaveIndexMethod = AgentGrpc.getSaveIndexMethod) == null) {
          AgentGrpc.getSaveIndexMethod = getSaveIndexMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Empty, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("SaveIndex"))
              .build();
        }
      }
    }
    return getSaveIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Control.CreateIndexRequest,
      org.vdaas.vald.payload.Empty> getCreateAndSaveIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAndSaveIndex",
      requestType = org.vdaas.vald.payload.Control.CreateIndexRequest.class,
      responseType = org.vdaas.vald.payload.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Control.CreateIndexRequest,
      org.vdaas.vald.payload.Empty> getCreateAndSaveIndexMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Control.CreateIndexRequest, org.vdaas.vald.payload.Empty> getCreateAndSaveIndexMethod;
    if ((getCreateAndSaveIndexMethod = AgentGrpc.getCreateAndSaveIndexMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getCreateAndSaveIndexMethod = AgentGrpc.getCreateAndSaveIndexMethod) == null) {
          AgentGrpc.getCreateAndSaveIndexMethod = getCreateAndSaveIndexMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Control.CreateIndexRequest, org.vdaas.vald.payload.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAndSaveIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Control.CreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("CreateAndSaveIndex"))
              .build();
        }
      }
    }
    return getCreateAndSaveIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.vdaas.vald.payload.Empty,
      org.vdaas.vald.payload.Info.Index> getIndexInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexInfo",
      requestType = org.vdaas.vald.payload.Empty.class,
      responseType = org.vdaas.vald.payload.Info.Index.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.vdaas.vald.payload.Empty,
      org.vdaas.vald.payload.Info.Index> getIndexInfoMethod() {
    io.grpc.MethodDescriptor<org.vdaas.vald.payload.Empty, org.vdaas.vald.payload.Info.Index> getIndexInfoMethod;
    if ((getIndexInfoMethod = AgentGrpc.getIndexInfoMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getIndexInfoMethod = AgentGrpc.getIndexInfoMethod) == null) {
          AgentGrpc.getIndexInfoMethod = getIndexInfoMethod =
              io.grpc.MethodDescriptor.<org.vdaas.vald.payload.Empty, org.vdaas.vald.payload.Info.Index>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.vdaas.vald.payload.Info.Index.getDefaultInstance()))
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
    return new AgentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AgentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AgentFutureStub(channel);
  }

  /**
   */
  public static abstract class AgentImplBase implements io.grpc.BindableService {

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
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamGetObjectMethod(), responseObserver);
    }

    /**
     */
    public void createIndex(org.vdaas.vald.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIndexMethod(), responseObserver);
    }

    /**
     */
    public void saveIndex(org.vdaas.vald.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveIndexMethod(), responseObserver);
    }

    /**
     */
    public void createAndSaveIndex(org.vdaas.vald.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAndSaveIndexMethod(), responseObserver);
    }

    /**
     */
    public void indexInfo(org.vdaas.vald.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Info.Index> responseObserver) {
      asyncUnimplementedUnaryCall(getIndexInfoMethod(), responseObserver);
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
                org.vdaas.vald.payload.Object.Vector>(
                  this, METHODID_GET_OBJECT)))
          .addMethod(
            getStreamGetObjectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Object.ID,
                org.vdaas.vald.payload.Object.Vector>(
                  this, METHODID_STREAM_GET_OBJECT)))
          .addMethod(
            getCreateIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Control.CreateIndexRequest,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_CREATE_INDEX)))
          .addMethod(
            getSaveIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Empty,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_SAVE_INDEX)))
          .addMethod(
            getCreateAndSaveIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Control.CreateIndexRequest,
                org.vdaas.vald.payload.Empty>(
                  this, METHODID_CREATE_AND_SAVE_INDEX)))
          .addMethod(
            getIndexInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.vdaas.vald.payload.Empty,
                org.vdaas.vald.payload.Info.Index>(
                  this, METHODID_INDEX_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class AgentStub extends io.grpc.stub.AbstractStub<AgentStub> {
    private AgentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentStub(channel, callOptions);
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
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.ID> streamGetObject(
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamGetObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void createIndex(org.vdaas.vald.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveIndex(org.vdaas.vald.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAndSaveIndex(org.vdaas.vald.payload.Control.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAndSaveIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void indexInfo(org.vdaas.vald.payload.Empty request,
        io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Info.Index> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AgentBlockingStub extends io.grpc.stub.AbstractStub<AgentBlockingStub> {
    private AgentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentBlockingStub(channel, callOptions);
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
    public org.vdaas.vald.payload.Object.Vector getObject(org.vdaas.vald.payload.Object.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty createIndex(org.vdaas.vald.payload.Control.CreateIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty saveIndex(org.vdaas.vald.payload.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSaveIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Empty createAndSaveIndex(org.vdaas.vald.payload.Control.CreateIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAndSaveIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.vdaas.vald.payload.Info.Index indexInfo(org.vdaas.vald.payload.Empty request) {
      return blockingUnaryCall(
          getChannel(), getIndexInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AgentFutureStub extends io.grpc.stub.AbstractStub<AgentFutureStub> {
    private AgentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Object.Vector> getObject(
        org.vdaas.vald.payload.Object.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> createIndex(
        org.vdaas.vald.payload.Control.CreateIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> saveIndex(
        org.vdaas.vald.payload.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Empty> createAndSaveIndex(
        org.vdaas.vald.payload.Control.CreateIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAndSaveIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.vdaas.vald.payload.Info.Index> indexInfo(
        org.vdaas.vald.payload.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getIndexInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXISTS = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_SEARCH_BY_ID = 2;
  private static final int METHODID_INSERT = 3;
  private static final int METHODID_MULTI_INSERT = 4;
  private static final int METHODID_UPDATE = 5;
  private static final int METHODID_MULTI_UPDATE = 6;
  private static final int METHODID_REMOVE = 7;
  private static final int METHODID_MULTI_REMOVE = 8;
  private static final int METHODID_GET_OBJECT = 9;
  private static final int METHODID_CREATE_INDEX = 10;
  private static final int METHODID_SAVE_INDEX = 11;
  private static final int METHODID_CREATE_AND_SAVE_INDEX = 12;
  private static final int METHODID_INDEX_INFO = 13;
  private static final int METHODID_STREAM_SEARCH = 14;
  private static final int METHODID_STREAM_SEARCH_BY_ID = 15;
  private static final int METHODID_STREAM_INSERT = 16;
  private static final int METHODID_STREAM_UPDATE = 17;
  private static final int METHODID_STREAM_REMOVE = 18;
  private static final int METHODID_STREAM_GET_OBJECT = 19;

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
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector>) responseObserver);
          break;
        case METHODID_CREATE_INDEX:
          serviceImpl.createIndex((org.vdaas.vald.payload.Control.CreateIndexRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_SAVE_INDEX:
          serviceImpl.saveIndex((org.vdaas.vald.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_CREATE_AND_SAVE_INDEX:
          serviceImpl.createAndSaveIndex((org.vdaas.vald.payload.Control.CreateIndexRequest) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
          break;
        case METHODID_INDEX_INFO:
          serviceImpl.indexInfo((org.vdaas.vald.payload.Empty) request,
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Info.Index>) responseObserver);
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
        case METHODID_STREAM_REMOVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRemove(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Empty>) responseObserver);
        case METHODID_STREAM_GET_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamGetObject(
              (io.grpc.stub.StreamObserver<org.vdaas.vald.payload.Object.Vector>) responseObserver);
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
      return org.vdaas.vald.agent.ValdAgent.getDescriptor();
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
              .addMethod(getRemoveMethod())
              .addMethod(getStreamRemoveMethod())
              .addMethod(getMultiRemoveMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getStreamGetObjectMethod())
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
