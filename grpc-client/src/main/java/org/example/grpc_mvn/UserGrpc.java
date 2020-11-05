package org.example.grpc_mvn;

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
    comments = "Source: demo.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.LoginRequest,
      org.example.grpc_mvn.Demo.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = org.example.grpc_mvn.Demo.LoginRequest.class,
      responseType = org.example.grpc_mvn.Demo.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.LoginRequest,
      org.example.grpc_mvn.Demo.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.LoginRequest, org.example.grpc_mvn.Demo.APIResponse> getLoginMethod;
    if ((getLoginMethod = UserGrpc.getLoginMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getLoginMethod = UserGrpc.getLoginMethod) == null) {
          UserGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc_mvn.Demo.LoginRequest, org.example.grpc_mvn.Demo.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_mvn.Demo.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_mvn.Demo.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.Empty,
      org.example.grpc_mvn.Demo.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = org.example.grpc_mvn.Demo.Empty.class,
      responseType = org.example.grpc_mvn.Demo.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.Empty,
      org.example.grpc_mvn.Demo.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.Empty, org.example.grpc_mvn.Demo.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = UserGrpc.getLogoutMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getLogoutMethod = UserGrpc.getLogoutMethod) == null) {
          UserGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc_mvn.Demo.Empty, org.example.grpc_mvn.Demo.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_mvn.Demo.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_mvn.Demo.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.TimeStreamRequest,
      org.example.grpc_mvn.Demo.TimeUpdate> getGetTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTime",
      requestType = org.example.grpc_mvn.Demo.TimeStreamRequest.class,
      responseType = org.example.grpc_mvn.Demo.TimeUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.TimeStreamRequest,
      org.example.grpc_mvn.Demo.TimeUpdate> getGetTimeMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_mvn.Demo.TimeStreamRequest, org.example.grpc_mvn.Demo.TimeUpdate> getGetTimeMethod;
    if ((getGetTimeMethod = UserGrpc.getGetTimeMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetTimeMethod = UserGrpc.getGetTimeMethod) == null) {
          UserGrpc.getGetTimeMethod = getGetTimeMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc_mvn.Demo.TimeStreamRequest, org.example.grpc_mvn.Demo.TimeUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "User", "getTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_mvn.Demo.TimeStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_mvn.Demo.TimeUpdate.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("getTime"))
                  .build();
          }
        }
     }
     return getGetTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(org.example.grpc_mvn.Demo.LoginRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(org.example.grpc_mvn.Demo.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void getTime(org.example.grpc_mvn.Demo.TimeStreamRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.TimeUpdate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc_mvn.Demo.LoginRequest,
                org.example.grpc_mvn.Demo.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc_mvn.Demo.Empty,
                org.example.grpc_mvn.Demo.APIResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getGetTimeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.grpc_mvn.Demo.TimeStreamRequest,
                org.example.grpc_mvn.Demo.TimeUpdate>(
                  this, METHODID_GET_TIME)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     */
    public void login(org.example.grpc_mvn.Demo.LoginRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(org.example.grpc_mvn.Demo.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTime(org.example.grpc_mvn.Demo.TimeStreamRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.TimeUpdate> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc_mvn.Demo.APIResponse login(org.example.grpc_mvn.Demo.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc_mvn.Demo.APIResponse logout(org.example.grpc_mvn.Demo.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.grpc_mvn.Demo.TimeUpdate> getTime(
        org.example.grpc_mvn.Demo.TimeStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc_mvn.Demo.APIResponse> login(
        org.example.grpc_mvn.Demo.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc_mvn.Demo.APIResponse> logout(
        org.example.grpc_mvn.Demo.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_GET_TIME = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((org.example.grpc_mvn.Demo.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((org.example.grpc_mvn.Demo.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.APIResponse>) responseObserver);
          break;
        case METHODID_GET_TIME:
          serviceImpl.getTime((org.example.grpc_mvn.Demo.TimeStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc_mvn.Demo.TimeUpdate>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc_mvn.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getGetTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
