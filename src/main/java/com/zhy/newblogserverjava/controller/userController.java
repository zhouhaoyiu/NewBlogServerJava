package com.zhy.newblogserverjava.controller;


import com.zhy.newblogserverjava.domain.User;
import com.zhy.newblogserverjava.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("user")
@RestController
public class userController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("getAllUsers")
    public Object getAllUsers(HttpServletRequest request, HttpServletResponse response) {

        List<User> user = userMapper.selectAllUsers();
        Map<String, Object> json = new HashMap<>();
//        System.out.println(user);
        json.put("user", user);
        return json;

    }
}
