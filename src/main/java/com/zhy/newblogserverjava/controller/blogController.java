package com.zhy.newblogserverjava.controller;


import com.zhy.newblogserverjava.domain.Blog;
import com.zhy.newblogserverjava.mapper.BlogMapper;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        json.put("code", 1000);
        json.put("blog", blog);
        return json;
    }

    @GetMapping("getBlog")
    public Object getBlog(HttpServletRequest request, HttpServletResponse response) {
        Integer blogId = Integer.valueOf(request.getParameter("blogId"));
        List<Blog> blog = blogMapper.getBlog(blogId);
        JSONObject json = new JSONObject();
        json.put("code", 1000);
        json.put("blog", blog);
        return json;
    }
    @PostMapping("addBlog")
    public Object addBlog(HttpServletRequest request,HttpServletResponse response){
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String content = request.getParameter("content");
        String created = request.getParameter("created");
        int result = blogMapper.addBlog(title,description,content,created);
        JSONObject json = new JSONObject();
        if (result == 0){
            json.put("code","1001");
            json.put("message","fail");
        }
        else{
            json.put("code","1000");
            json.put("message","success");
        }
        return json;

    }
}
