package ma.enset.stubs;

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
    comments = "Source: Jeu.proto")
public final class JeuGrpc {

  private JeuGrpc() {}

  public static final String SERVICE_NAME = "Jeu";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.StartRequest,
      ma.enset.stubs.JeuOuterClass.StartResponse> getStartGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartGame",
      requestType = ma.enset.stubs.JeuOuterClass.StartRequest.class,
      responseType = ma.enset.stubs.JeuOuterClass.StartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.StartRequest,
      ma.enset.stubs.JeuOuterClass.StartResponse> getStartGameMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.StartRequest, ma.enset.stubs.JeuOuterClass.StartResponse> getStartGameMethod;
    if ((getStartGameMethod = JeuGrpc.getStartGameMethod) == null) {
      synchronized (JeuGrpc.class) {
        if ((getStartGameMethod = JeuGrpc.getStartGameMethod) == null) {
          JeuGrpc.getStartGameMethod = getStartGameMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.JeuOuterClass.StartRequest, ma.enset.stubs.JeuOuterClass.StartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Jeu", "StartGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.StartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.StartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JeuMethodDescriptorSupplier("StartGame"))
                  .build();
          }
        }
     }
     return getStartGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.GuessRequest,
      ma.enset.stubs.JeuOuterClass.GuessResponse> getGuessNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GuessNumber",
      requestType = ma.enset.stubs.JeuOuterClass.GuessRequest.class,
      responseType = ma.enset.stubs.JeuOuterClass.GuessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.GuessRequest,
      ma.enset.stubs.JeuOuterClass.GuessResponse> getGuessNumberMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.GuessRequest, ma.enset.stubs.JeuOuterClass.GuessResponse> getGuessNumberMethod;
    if ((getGuessNumberMethod = JeuGrpc.getGuessNumberMethod) == null) {
      synchronized (JeuGrpc.class) {
        if ((getGuessNumberMethod = JeuGrpc.getGuessNumberMethod) == null) {
          JeuGrpc.getGuessNumberMethod = getGuessNumberMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.JeuOuterClass.GuessRequest, ma.enset.stubs.JeuOuterClass.GuessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Jeu", "GuessNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.GuessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.GuessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JeuMethodDescriptorSupplier("GuessNumber"))
                  .build();
          }
        }
     }
     return getGuessNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.WinnerRequest,
      ma.enset.stubs.JeuOuterClass.WinnerResponse> getWinnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Winner",
      requestType = ma.enset.stubs.JeuOuterClass.WinnerRequest.class,
      responseType = ma.enset.stubs.JeuOuterClass.WinnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.WinnerRequest,
      ma.enset.stubs.JeuOuterClass.WinnerResponse> getWinnerMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.WinnerRequest, ma.enset.stubs.JeuOuterClass.WinnerResponse> getWinnerMethod;
    if ((getWinnerMethod = JeuGrpc.getWinnerMethod) == null) {
      synchronized (JeuGrpc.class) {
        if ((getWinnerMethod = JeuGrpc.getWinnerMethod) == null) {
          JeuGrpc.getWinnerMethod = getWinnerMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.JeuOuterClass.WinnerRequest, ma.enset.stubs.JeuOuterClass.WinnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Jeu", "Winner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.WinnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.WinnerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JeuMethodDescriptorSupplier("Winner"))
                  .build();
          }
        }
     }
     return getWinnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.PlayerRequest,
      ma.enset.stubs.JeuOuterClass.PlayerResponse> getAddPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPlayer",
      requestType = ma.enset.stubs.JeuOuterClass.PlayerRequest.class,
      responseType = ma.enset.stubs.JeuOuterClass.PlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.PlayerRequest,
      ma.enset.stubs.JeuOuterClass.PlayerResponse> getAddPlayerMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.JeuOuterClass.PlayerRequest, ma.enset.stubs.JeuOuterClass.PlayerResponse> getAddPlayerMethod;
    if ((getAddPlayerMethod = JeuGrpc.getAddPlayerMethod) == null) {
      synchronized (JeuGrpc.class) {
        if ((getAddPlayerMethod = JeuGrpc.getAddPlayerMethod) == null) {
          JeuGrpc.getAddPlayerMethod = getAddPlayerMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.JeuOuterClass.PlayerRequest, ma.enset.stubs.JeuOuterClass.PlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Jeu", "AddPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.PlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.JeuOuterClass.PlayerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JeuMethodDescriptorSupplier("AddPlayer"))
                  .build();
          }
        }
     }
     return getAddPlayerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JeuStub newStub(io.grpc.Channel channel) {
    return new JeuStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JeuBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JeuBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JeuFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JeuFutureStub(channel);
  }

  /**
   */
  public static abstract class JeuImplBase implements io.grpc.BindableService {

    /**
     */
    public void startGame(ma.enset.stubs.JeuOuterClass.StartRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.StartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartGameMethod(), responseObserver);
    }

    /**
     */
    public void guessNumber(ma.enset.stubs.JeuOuterClass.GuessRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.GuessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGuessNumberMethod(), responseObserver);
    }

    /**
     */
    public void winner(ma.enset.stubs.JeuOuterClass.WinnerRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.WinnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWinnerMethod(), responseObserver);
    }

    /**
     */
    public void addPlayer(ma.enset.stubs.JeuOuterClass.PlayerRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.PlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPlayerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.JeuOuterClass.StartRequest,
                ma.enset.stubs.JeuOuterClass.StartResponse>(
                  this, METHODID_START_GAME)))
          .addMethod(
            getGuessNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.JeuOuterClass.GuessRequest,
                ma.enset.stubs.JeuOuterClass.GuessResponse>(
                  this, METHODID_GUESS_NUMBER)))
          .addMethod(
            getWinnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.JeuOuterClass.WinnerRequest,
                ma.enset.stubs.JeuOuterClass.WinnerResponse>(
                  this, METHODID_WINNER)))
          .addMethod(
            getAddPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.JeuOuterClass.PlayerRequest,
                ma.enset.stubs.JeuOuterClass.PlayerResponse>(
                  this, METHODID_ADD_PLAYER)))
          .build();
    }
  }

  /**
   */
  public static final class JeuStub extends io.grpc.stub.AbstractStub<JeuStub> {
    private JeuStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JeuStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JeuStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JeuStub(channel, callOptions);
    }

    /**
     */
    public void startGame(ma.enset.stubs.JeuOuterClass.StartRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.StartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void guessNumber(ma.enset.stubs.JeuOuterClass.GuessRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.GuessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGuessNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void winner(ma.enset.stubs.JeuOuterClass.WinnerRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.WinnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWinnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPlayer(ma.enset.stubs.JeuOuterClass.PlayerRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.PlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPlayerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JeuBlockingStub extends io.grpc.stub.AbstractStub<JeuBlockingStub> {
    private JeuBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JeuBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JeuBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JeuBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.stubs.JeuOuterClass.StartResponse startGame(ma.enset.stubs.JeuOuterClass.StartRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.stubs.JeuOuterClass.GuessResponse guessNumber(ma.enset.stubs.JeuOuterClass.GuessRequest request) {
      return blockingUnaryCall(
          getChannel(), getGuessNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.stubs.JeuOuterClass.WinnerResponse winner(ma.enset.stubs.JeuOuterClass.WinnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getWinnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.stubs.JeuOuterClass.PlayerResponse addPlayer(ma.enset.stubs.JeuOuterClass.PlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPlayerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JeuFutureStub extends io.grpc.stub.AbstractStub<JeuFutureStub> {
    private JeuFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JeuFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JeuFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JeuFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.JeuOuterClass.StartResponse> startGame(
        ma.enset.stubs.JeuOuterClass.StartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.JeuOuterClass.GuessResponse> guessNumber(
        ma.enset.stubs.JeuOuterClass.GuessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGuessNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.JeuOuterClass.WinnerResponse> winner(
        ma.enset.stubs.JeuOuterClass.WinnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWinnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.JeuOuterClass.PlayerResponse> addPlayer(
        ma.enset.stubs.JeuOuterClass.PlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_GAME = 0;
  private static final int METHODID_GUESS_NUMBER = 1;
  private static final int METHODID_WINNER = 2;
  private static final int METHODID_ADD_PLAYER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JeuImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JeuImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_GAME:
          serviceImpl.startGame((ma.enset.stubs.JeuOuterClass.StartRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.StartResponse>) responseObserver);
          break;
        case METHODID_GUESS_NUMBER:
          serviceImpl.guessNumber((ma.enset.stubs.JeuOuterClass.GuessRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.GuessResponse>) responseObserver);
          break;
        case METHODID_WINNER:
          serviceImpl.winner((ma.enset.stubs.JeuOuterClass.WinnerRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.WinnerResponse>) responseObserver);
          break;
        case METHODID_ADD_PLAYER:
          serviceImpl.addPlayer((ma.enset.stubs.JeuOuterClass.PlayerRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.JeuOuterClass.PlayerResponse>) responseObserver);
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

  private static abstract class JeuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JeuBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.JeuOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Jeu");
    }
  }

  private static final class JeuFileDescriptorSupplier
      extends JeuBaseDescriptorSupplier {
    JeuFileDescriptorSupplier() {}
  }

  private static final class JeuMethodDescriptorSupplier
      extends JeuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JeuMethodDescriptorSupplier(String methodName) {
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
      synchronized (JeuGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JeuFileDescriptorSupplier())
              .addMethod(getStartGameMethod())
              .addMethod(getGuessNumberMethod())
              .addMethod(getWinnerMethod())
              .addMethod(getAddPlayerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
