package com.sunrisedental.web;

import com.sunrisedental.dao.UserDAO;
import com.sunrisedental.model.User;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(
    serviceName = "AuthWebService",
    targetNamespace = "http://service.sunrisedental.com/"
)
public class AuthWebService {

    @WebMethod
    public boolean login(String username, String password) {

        try {
            return new UserDAO().authenticate(
                    username,
                    password
            );

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }


    @WebMethod
    public boolean register(
            String username,
            String email,
            String password) {

        try {

            UserDAO dao = new UserDAO();

            // Check whether username already exists
            if (dao.usernameExists(username)) {
                return false;
            }

            User user = new User(
                    username,
                    email,
                    password
            );

            return dao.registerUser(user);

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }
}