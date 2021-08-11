package com.example.springbootjwt.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

public class AuthUser {

    private String username;
    private String password;

    public AuthUser() {

    }

    public AuthUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
