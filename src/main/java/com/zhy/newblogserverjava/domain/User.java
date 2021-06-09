package com.zhy.newblogserverjava.domain;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String avator;
    private String email;
    private String password;
    private int Status;
    private String created;
}
