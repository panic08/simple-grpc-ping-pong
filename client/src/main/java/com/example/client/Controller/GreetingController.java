package com.example.client.Controller;

import com.example.Greet;
import com.example.GreetingGrpc;
import com.example.GreetingOuterClass;
import com.example.Hello;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class GreetingController {

    @GetMapping
    public void greeting(){
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9020)
                .usePlaintext().build();

        GreetingGrpc.GreetingBlockingStub stub = GreetingGrpc.newBlockingStub(channel);
        Greet greet = stub.greeting(Hello.newBuilder()
                        .setMessage("life style ne po zubam")
                .build());
        System.out.println(greet);

        channel.shutdown();
    }

}
