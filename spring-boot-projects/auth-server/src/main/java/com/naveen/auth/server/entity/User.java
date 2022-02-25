package com.naveen.auth.server.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {
    @Id
    private Integer id;
    private String email;
    private String password;
}