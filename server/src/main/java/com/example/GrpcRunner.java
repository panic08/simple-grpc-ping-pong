package com.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcRunner {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(9020)
                .addService(new GrpcServer()).build();

        System.out.println("мы запускаемся");
        server.start();
        System.out.println("мы запустились");
        server.awaitTermination();
    }
}
