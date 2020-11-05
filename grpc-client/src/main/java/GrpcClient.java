import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.grpc_mvn.Demo;
import org.example.grpc_mvn.UserGrpc;

import java.util.Iterator;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        UserGrpc.UserBlockingStub userBlockingStub = UserGrpc.newBlockingStub(channel);
        Demo.LoginRequest loginRequest = Demo.LoginRequest.newBuilder().setUsername("RAM").setPassword("RAhhM").build();
        Demo.TimeStreamRequest timeStreamRequest = Demo.TimeStreamRequest.newBuilder().setLength(10).build();

        Demo.APIResponse response = userBlockingStub.login(loginRequest);
        Iterator<Demo.TimeUpdate> timeUpdate = userBlockingStub.getTime(timeStreamRequest);
        System.out.println(response.getResponseMessage());

      /*  for (Iterator<Demo.TimeUpdate> it = timeUpdate; it.hasNext(); ) {
            System.out.println(it);
        } */

    }
}
