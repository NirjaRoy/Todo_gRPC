package com.grpc.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.grpcs.LoginGrpc;
//import com.grpc.TaskGrpc;
import java.io.IOException;

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        SpringApplication.run(TodoApplication.class, args);
        Server server1 = ServerBuilder.forPort(7131).addService(new LoginGrpc()).build();
        //Server server2 = ServerBuilder.forPort(7132).addService(new TaskGrpc()).build();

        server1.start();
        //  server2.start();
        System.out.println("Server1 started at " + server1.getPort());
        //  System.out.println("Server2 started at " + server2.getPort());

        server1.awaitTermination();
        //  server2.awaitTermination();
    }
}

