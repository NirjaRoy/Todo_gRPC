package com.Stubs.Task;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Task.proto")
public final class taskGrpc {

  private taskGrpc() {}

  public static final String SERVICE_NAME = "task";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Stubs.Task.Task.createTaskRequest,
      com.Stubs.Task.Task.createTaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTask",
      requestType = com.Stubs.Task.Task.createTaskRequest.class,
      responseType = com.Stubs.Task.Task.createTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Stubs.Task.Task.createTaskRequest,
      com.Stubs.Task.Task.createTaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.Stubs.Task.Task.createTaskRequest, com.Stubs.Task.Task.createTaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = taskGrpc.getCreateTaskMethod) == null) {
      synchronized (taskGrpc.class) {
        if ((getCreateTaskMethod = taskGrpc.getCreateTaskMethod) == null) {
          taskGrpc.getCreateTaskMethod = getCreateTaskMethod = 
              io.grpc.MethodDescriptor.<com.Stubs.Task.Task.createTaskRequest, com.Stubs.Task.Task.createTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task", "createTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.createTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.createTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new taskMethodDescriptorSupplier("createTask"))
                  .build();
          }
        }
     }
     return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Stubs.Task.Task.Empty,
      com.Stubs.Task.Task.taskDetails> getFindAllTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllTask",
      requestType = com.Stubs.Task.Task.Empty.class,
      responseType = com.Stubs.Task.Task.taskDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Stubs.Task.Task.Empty,
      com.Stubs.Task.Task.taskDetails> getFindAllTaskMethod() {
    io.grpc.MethodDescriptor<com.Stubs.Task.Task.Empty, com.Stubs.Task.Task.taskDetails> getFindAllTaskMethod;
    if ((getFindAllTaskMethod = taskGrpc.getFindAllTaskMethod) == null) {
      synchronized (taskGrpc.class) {
        if ((getFindAllTaskMethod = taskGrpc.getFindAllTaskMethod) == null) {
          taskGrpc.getFindAllTaskMethod = getFindAllTaskMethod = 
              io.grpc.MethodDescriptor.<com.Stubs.Task.Task.Empty, com.Stubs.Task.Task.taskDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task", "findAllTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.taskDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new taskMethodDescriptorSupplier("findAllTask"))
                  .build();
          }
        }
     }
     return getFindAllTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Stubs.Task.Task.searchTaskRequest,
      com.Stubs.Task.Task.searchTaskResponse> getFindTasksByStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findTasksByStatus",
      requestType = com.Stubs.Task.Task.searchTaskRequest.class,
      responseType = com.Stubs.Task.Task.searchTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Stubs.Task.Task.searchTaskRequest,
      com.Stubs.Task.Task.searchTaskResponse> getFindTasksByStatusMethod() {
    io.grpc.MethodDescriptor<com.Stubs.Task.Task.searchTaskRequest, com.Stubs.Task.Task.searchTaskResponse> getFindTasksByStatusMethod;
    if ((getFindTasksByStatusMethod = taskGrpc.getFindTasksByStatusMethod) == null) {
      synchronized (taskGrpc.class) {
        if ((getFindTasksByStatusMethod = taskGrpc.getFindTasksByStatusMethod) == null) {
          taskGrpc.getFindTasksByStatusMethod = getFindTasksByStatusMethod = 
              io.grpc.MethodDescriptor.<com.Stubs.Task.Task.searchTaskRequest, com.Stubs.Task.Task.searchTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task", "findTasksByStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.searchTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.searchTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new taskMethodDescriptorSupplier("findTasksByStatus"))
                  .build();
          }
        }
     }
     return getFindTasksByStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Stubs.Task.Task.deleteTaskRequest,
      com.Stubs.Task.Task.createTaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTask",
      requestType = com.Stubs.Task.Task.deleteTaskRequest.class,
      responseType = com.Stubs.Task.Task.createTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Stubs.Task.Task.deleteTaskRequest,
      com.Stubs.Task.Task.createTaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<com.Stubs.Task.Task.deleteTaskRequest, com.Stubs.Task.Task.createTaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = taskGrpc.getDeleteTaskMethod) == null) {
      synchronized (taskGrpc.class) {
        if ((getDeleteTaskMethod = taskGrpc.getDeleteTaskMethod) == null) {
          taskGrpc.getDeleteTaskMethod = getDeleteTaskMethod = 
              io.grpc.MethodDescriptor.<com.Stubs.Task.Task.deleteTaskRequest, com.Stubs.Task.Task.createTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task", "deleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.deleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Stubs.Task.Task.createTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new taskMethodDescriptorSupplier("deleteTask"))
                  .build();
          }
        }
     }
     return getDeleteTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static taskStub newStub(io.grpc.Channel channel) {
    return new taskStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static taskBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new taskBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static taskFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new taskFutureStub(channel);
  }

  /**
   */
  public static abstract class taskImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTask(com.Stubs.Task.Task.createTaskRequest request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.createTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    public void findAllTask(com.Stubs.Task.Task.Empty request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.taskDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllTaskMethod(), responseObserver);
    }

    /**
     */
    public void findTasksByStatus(com.Stubs.Task.Task.searchTaskRequest request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.searchTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindTasksByStatusMethod(), responseObserver);
    }

    /**
     */
    public void deleteTask(com.Stubs.Task.Task.deleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.createTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Stubs.Task.Task.createTaskRequest,
                com.Stubs.Task.Task.createTaskResponse>(
                  this, METHODID_CREATE_TASK)))
          .addMethod(
            getFindAllTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Stubs.Task.Task.Empty,
                com.Stubs.Task.Task.taskDetails>(
                  this, METHODID_FIND_ALL_TASK)))
          .addMethod(
            getFindTasksByStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Stubs.Task.Task.searchTaskRequest,
                com.Stubs.Task.Task.searchTaskResponse>(
                  this, METHODID_FIND_TASKS_BY_STATUS)))
          .addMethod(
            getDeleteTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Stubs.Task.Task.deleteTaskRequest,
                com.Stubs.Task.Task.createTaskResponse>(
                  this, METHODID_DELETE_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class taskStub extends io.grpc.stub.AbstractStub<taskStub> {
    private taskStub(io.grpc.Channel channel) {
      super(channel);
    }

    private taskStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taskStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new taskStub(channel, callOptions);
    }

    /**
     */
    public void createTask(com.Stubs.Task.Task.createTaskRequest request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.createTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllTask(com.Stubs.Task.Task.Empty request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.taskDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findTasksByStatus(com.Stubs.Task.Task.searchTaskRequest request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.searchTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindTasksByStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTask(com.Stubs.Task.Task.deleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.Stubs.Task.Task.createTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class taskBlockingStub extends io.grpc.stub.AbstractStub<taskBlockingStub> {
    private taskBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private taskBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taskBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new taskBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.Stubs.Task.Task.createTaskResponse createTask(com.Stubs.Task.Task.createTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Stubs.Task.Task.taskDetails findAllTask(com.Stubs.Task.Task.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindAllTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Stubs.Task.Task.searchTaskResponse findTasksByStatus(com.Stubs.Task.Task.searchTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindTasksByStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Stubs.Task.Task.createTaskResponse deleteTask(com.Stubs.Task.Task.deleteTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class taskFutureStub extends io.grpc.stub.AbstractStub<taskFutureStub> {
    private taskFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private taskFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taskFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new taskFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Stubs.Task.Task.createTaskResponse> createTask(
        com.Stubs.Task.Task.createTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Stubs.Task.Task.taskDetails> findAllTask(
        com.Stubs.Task.Task.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Stubs.Task.Task.searchTaskResponse> findTasksByStatus(
        com.Stubs.Task.Task.searchTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindTasksByStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Stubs.Task.Task.createTaskResponse> deleteTask(
        com.Stubs.Task.Task.deleteTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_FIND_ALL_TASK = 1;
  private static final int METHODID_FIND_TASKS_BY_STATUS = 2;
  private static final int METHODID_DELETE_TASK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final taskImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(taskImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.Stubs.Task.Task.createTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.Stubs.Task.Task.createTaskResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_TASK:
          serviceImpl.findAllTask((com.Stubs.Task.Task.Empty) request,
              (io.grpc.stub.StreamObserver<com.Stubs.Task.Task.taskDetails>) responseObserver);
          break;
        case METHODID_FIND_TASKS_BY_STATUS:
          serviceImpl.findTasksByStatus((com.Stubs.Task.Task.searchTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.Stubs.Task.Task.searchTaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((com.Stubs.Task.Task.deleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.Stubs.Task.Task.createTaskResponse>) responseObserver);
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

  private static abstract class taskBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    taskBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Stubs.Task.Task.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("task");
    }
  }

  private static final class taskFileDescriptorSupplier
      extends taskBaseDescriptorSupplier {
    taskFileDescriptorSupplier() {}
  }

  private static final class taskMethodDescriptorSupplier
      extends taskBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    taskMethodDescriptorSupplier(String methodName) {
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
      synchronized (taskGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new taskFileDescriptorSupplier())
              .addMethod(getCreateTaskMethod())
              .addMethod(getFindAllTaskMethod())
              .addMethod(getFindTasksByStatusMethod())
              .addMethod(getDeleteTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
