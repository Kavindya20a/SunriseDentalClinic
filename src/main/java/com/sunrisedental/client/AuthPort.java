package com.sunrisedental.client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(
    targetNamespace = "http://service.sunrisedental.com/",
    name = "AuthWebService"
)
public interface AuthPort {

    @WebMethod
    boolean login(String username, String password);

    @WebMethod
    boolean register(
            String username, String email, String password);
}