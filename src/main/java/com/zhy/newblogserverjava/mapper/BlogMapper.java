package com.zhy.newblogserverjava.mapper;

import com.zhy.newblogserverjava.domain.Blog;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {

    @Select("select * from blognew" )
    List<Blog> selectAllBlogs();
}
