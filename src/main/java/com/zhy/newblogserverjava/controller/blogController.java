package com.zhy.newblogserverjava.controller;


import com.zhy.newblogserverjava.domain.Blog;
import com.zhy.newblogserverjava.domain.User;
import com.zhy.newblogserverjava.mapper.BlogMapper;
import com.zhy.newblogserverjava.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@RequestMapping("blog")
@RestController
public class blogController {
    @Autowired
    private BlogMapper blogMapper;
    @GetMapping("getAllBlogs")
    public Object getAllUsers(HttpServletRequest request, HttpServletResponse response) {

        List<Blog> blog = blogMapper.selectAllBlogs();
        JSONObject json = new JSONObject();
        System.out.println(blog);
        json.put("user", blog);
        return json;

    }
}
