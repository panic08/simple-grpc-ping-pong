package com.example;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: greeting.proto")
public final class GreetingGrpc {

  private GreetingGrpc() {}

  public static final String SERVICE_NAME = "com.example.Greeting";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.Hello,
      com.example.Greet> METHOD_GREETING =
      io.grpc.MethodDescriptor.<com.example.Hello, com.example.Greet>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.Greeting", "greeting"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.Hello.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.Greet.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingStub newStub(io.grpc.Channel channel) {
    return new GreetingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetingImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting(com.example.Hello request,
        io.grpc.stub.StreamObserver<com.example.Greet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GREETING, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GREETING,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.Hello,
                com.example.Greet>(
                  this, METHODID_GREETING)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingStub extends io.grpc.stub.AbstractStub<GreetingStub> {
    private GreetingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingStub(channel, callOptions);
    }

    /**
     */
    public void greeting(com.example.Hello request,
        io.grpc.stub.StreamObserver<com.example.Greet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GREETING, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetingBlockingStub extends io.grpc.stub.AbstractStub<GreetingBlockingStub> {
    private GreetingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.Greet greeting(com.example.Hello request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GREETING, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingFutureStub extends io.grpc.stub.AbstractStub<GreetingFutureStub> {
    private GreetingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.Greet> greeting(
        com.example.Hello request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GREETING, getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.example.Hello) request,
              (io.grpc.stub.StreamObserver<com.example.Greet>) responseObserver);
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

  private static final class GreetingDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.GreetingOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingDescriptorSupplier())
              .addMethod(METHOD_GREETING)
              .build();
        }
      }
    }
    return result;
  }
}
