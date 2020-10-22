package com.grpcs;
import com.Stubs.Login.Authentication.APIResponse;
import com.Stubs.Login.Authentication.LoginRequest;
import com.Stubs.Login.Authentication.Empty;
import com.Stubs.Login.userGrpc;
import io.grpc.stub.StreamObserver;

public class LoginGrpc extends userGrpc.userImplBase {
    @Override
    public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
        String username = request.getUsername();
        String password = request.getPassword();

        APIResponse.Builder response = APIResponse.newBuilder();
        if (username.contentEquals(password)) {
            response.setResponseCode(0).setResponsemessage("SUCCESS");
        } else {
            response.setResponseCode(100).setResponsemessage("INVALID");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
        APIResponse.Builder response = APIResponse.newBuilder();
        response.setResponsemessage("Logged out");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
