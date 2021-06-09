package com.zhy.newblogserverjava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.zhy.newblogserverjava.mapper")
public class NewBlogServerJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewBlogServerJavaApplication.class, args);
    }

}
