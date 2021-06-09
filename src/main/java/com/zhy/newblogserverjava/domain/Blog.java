package com.zhy.newblogserverjava.domain;

import lombok.Data;

@Data
public class Blog {
    private Long id;
    private String title;
    private String description;
    private String content;
    private String created;
    private Integer status;
}
