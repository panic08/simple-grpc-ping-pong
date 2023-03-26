package com.example;

import io.grpc.stub.StreamObserver;

public class GrpcServer extends GreetingGrpc.GreetingImplBase{
    @Override
    public void greeting(Hello request, StreamObserver<Greet> responseObserver) {
        System.out.println("fucking void message ): " + request);

        Greet grret = Greet.newBuilder()
                .setMessage("lox")
                .build();
        responseObserver.onNext(grret);
        responseObserver.onCompleted();
    }
}
