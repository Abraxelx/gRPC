package org.example.grpc_mvn.services;

import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.example.grpc_mvn.Demo;
import org.example.grpc_mvn.UserGrpc;


public class UserService extends  UserGrpc.UserImplBase{
	 Demo.APIResponse.Builder response = Demo.APIResponse.newBuilder();
    @Override
    public void login(Demo.LoginRequest request, StreamObserver<Demo.APIResponse> responseObserver) {
        System.out.println("Inside Login");
        String username = request.getUsername();
        String password = request.getPassword();

       

        if(username.equals(password)){
            response.setResponseCode(0).setResponseMessage("SUCCESS");
        }else{
            response.setResponseCode(0).setResponseMessage("INVALID PASSWORD");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(Demo.Empty request, StreamObserver<Demo.APIResponse> responseObserver) {
    	response.setResponseCode(200).setResponseMessage("LOGOUT");
    }

    @Override
    public void getTime(Demo.TimeStreamRequest request, StreamObserver<Demo.TimeUpdate> responseObserver) {
        Demo.TimeUpdate.Builder timeBuilder = Demo.TimeUpdate.newBuilder();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Demo.Time.Builder time =Demo.Time.newBuilder().setValue(dtf.format(now));
        timeBuilder.setTime(time);
        responseObserver.onNext(timeBuilder.build());
        responseObserver.onCompleted();
    }
}
