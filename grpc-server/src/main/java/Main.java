import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.grpc_mvn.services.UserService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090).addService(new UserService()).build();
        server.start();
        System.out.println("Server started at :" + server.getPort());
        server.awaitTermination();
    }
}
