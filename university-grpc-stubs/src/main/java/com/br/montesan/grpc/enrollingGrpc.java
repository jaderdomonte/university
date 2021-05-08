package com.br.montesan.grpc;

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
    comments = "Source: enrolling.proto")
public final class enrollingGrpc {

  private enrollingGrpc() {}

  public static final String SERVICE_NAME = "enrolling";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.br.montesan.grpc.Enrolling.EnrollingRequest,
      com.br.montesan.grpc.Enrolling.EnrollingResponse> getMakeEnrollingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makeEnrolling",
      requestType = com.br.montesan.grpc.Enrolling.EnrollingRequest.class,
      responseType = com.br.montesan.grpc.Enrolling.EnrollingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.br.montesan.grpc.Enrolling.EnrollingRequest,
      com.br.montesan.grpc.Enrolling.EnrollingResponse> getMakeEnrollingMethod() {
    io.grpc.MethodDescriptor<com.br.montesan.grpc.Enrolling.EnrollingRequest, com.br.montesan.grpc.Enrolling.EnrollingResponse> getMakeEnrollingMethod;
    if ((getMakeEnrollingMethod = enrollingGrpc.getMakeEnrollingMethod) == null) {
      synchronized (enrollingGrpc.class) {
        if ((getMakeEnrollingMethod = enrollingGrpc.getMakeEnrollingMethod) == null) {
          enrollingGrpc.getMakeEnrollingMethod = getMakeEnrollingMethod = 
              io.grpc.MethodDescriptor.<com.br.montesan.grpc.Enrolling.EnrollingRequest, com.br.montesan.grpc.Enrolling.EnrollingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "enrolling", "makeEnrolling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.montesan.grpc.Enrolling.EnrollingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.montesan.grpc.Enrolling.EnrollingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new enrollingMethodDescriptorSupplier("makeEnrolling"))
                  .build();
          }
        }
     }
     return getMakeEnrollingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.br.montesan.grpc.Enrolling.EnrollingCancelRequest,
      com.br.montesan.grpc.Enrolling.EnrollingCancelResponse> getCancelEnrollingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelEnrolling",
      requestType = com.br.montesan.grpc.Enrolling.EnrollingCancelRequest.class,
      responseType = com.br.montesan.grpc.Enrolling.EnrollingCancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.br.montesan.grpc.Enrolling.EnrollingCancelRequest,
      com.br.montesan.grpc.Enrolling.EnrollingCancelResponse> getCancelEnrollingMethod() {
    io.grpc.MethodDescriptor<com.br.montesan.grpc.Enrolling.EnrollingCancelRequest, com.br.montesan.grpc.Enrolling.EnrollingCancelResponse> getCancelEnrollingMethod;
    if ((getCancelEnrollingMethod = enrollingGrpc.getCancelEnrollingMethod) == null) {
      synchronized (enrollingGrpc.class) {
        if ((getCancelEnrollingMethod = enrollingGrpc.getCancelEnrollingMethod) == null) {
          enrollingGrpc.getCancelEnrollingMethod = getCancelEnrollingMethod = 
              io.grpc.MethodDescriptor.<com.br.montesan.grpc.Enrolling.EnrollingCancelRequest, com.br.montesan.grpc.Enrolling.EnrollingCancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "enrolling", "cancelEnrolling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.montesan.grpc.Enrolling.EnrollingCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.br.montesan.grpc.Enrolling.EnrollingCancelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new enrollingMethodDescriptorSupplier("cancelEnrolling"))
                  .build();
          }
        }
     }
     return getCancelEnrollingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static enrollingStub newStub(io.grpc.Channel channel) {
    return new enrollingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static enrollingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new enrollingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static enrollingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new enrollingFutureStub(channel);
  }

  /**
   */
  public static abstract class enrollingImplBase implements io.grpc.BindableService {

    /**
     */
    public void makeEnrolling(com.br.montesan.grpc.Enrolling.EnrollingRequest request,
        io.grpc.stub.StreamObserver<com.br.montesan.grpc.Enrolling.EnrollingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeEnrollingMethod(), responseObserver);
    }

    /**
     */
    public void cancelEnrolling(com.br.montesan.grpc.Enrolling.EnrollingCancelRequest request,
        io.grpc.stub.StreamObserver<com.br.montesan.grpc.Enrolling.EnrollingCancelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelEnrollingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMakeEnrollingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.br.montesan.grpc.Enrolling.EnrollingRequest,
                com.br.montesan.grpc.Enrolling.EnrollingResponse>(
                  this, METHODID_MAKE_ENROLLING)))
          .addMethod(
            getCancelEnrollingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.br.montesan.grpc.Enrolling.EnrollingCancelRequest,
                com.br.montesan.grpc.Enrolling.EnrollingCancelResponse>(
                  this, METHODID_CANCEL_ENROLLING)))
          .build();
    }
  }

  /**
   */
  public static final class enrollingStub extends io.grpc.stub.AbstractStub<enrollingStub> {
    private enrollingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private enrollingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected enrollingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new enrollingStub(channel, callOptions);
    }

    /**
     */
    public void makeEnrolling(com.br.montesan.grpc.Enrolling.EnrollingRequest request,
        io.grpc.stub.StreamObserver<com.br.montesan.grpc.Enrolling.EnrollingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeEnrollingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelEnrolling(com.br.montesan.grpc.Enrolling.EnrollingCancelRequest request,
        io.grpc.stub.StreamObserver<com.br.montesan.grpc.Enrolling.EnrollingCancelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelEnrollingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class enrollingBlockingStub extends io.grpc.stub.AbstractStub<enrollingBlockingStub> {
    private enrollingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private enrollingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected enrollingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new enrollingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.br.montesan.grpc.Enrolling.EnrollingResponse makeEnrolling(com.br.montesan.grpc.Enrolling.EnrollingRequest request) {
      return blockingUnaryCall(
          getChannel(), getMakeEnrollingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.br.montesan.grpc.Enrolling.EnrollingCancelResponse cancelEnrolling(com.br.montesan.grpc.Enrolling.EnrollingCancelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelEnrollingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class enrollingFutureStub extends io.grpc.stub.AbstractStub<enrollingFutureStub> {
    private enrollingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private enrollingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected enrollingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new enrollingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.br.montesan.grpc.Enrolling.EnrollingResponse> makeEnrolling(
        com.br.montesan.grpc.Enrolling.EnrollingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeEnrollingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.br.montesan.grpc.Enrolling.EnrollingCancelResponse> cancelEnrolling(
        com.br.montesan.grpc.Enrolling.EnrollingCancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelEnrollingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MAKE_ENROLLING = 0;
  private static final int METHODID_CANCEL_ENROLLING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final enrollingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(enrollingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MAKE_ENROLLING:
          serviceImpl.makeEnrolling((com.br.montesan.grpc.Enrolling.EnrollingRequest) request,
              (io.grpc.stub.StreamObserver<com.br.montesan.grpc.Enrolling.EnrollingResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ENROLLING:
          serviceImpl.cancelEnrolling((com.br.montesan.grpc.Enrolling.EnrollingCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.br.montesan.grpc.Enrolling.EnrollingCancelResponse>) responseObserver);
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

  private static abstract class enrollingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    enrollingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.br.montesan.grpc.Enrolling.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("enrolling");
    }
  }

  private static final class enrollingFileDescriptorSupplier
      extends enrollingBaseDescriptorSupplier {
    enrollingFileDescriptorSupplier() {}
  }

  private static final class enrollingMethodDescriptorSupplier
      extends enrollingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    enrollingMethodDescriptorSupplier(String methodName) {
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
      synchronized (enrollingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new enrollingFileDescriptorSupplier())
              .addMethod(getMakeEnrollingMethod())
              .addMethod(getCancelEnrollingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
