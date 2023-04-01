package ma.enset.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.enset.service.JeuGrpcService;

import java.io.IOException;

public class ServerGrpc{
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server= ServerBuilder.forPort(1234)
                .addService(new JeuGrpcService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
