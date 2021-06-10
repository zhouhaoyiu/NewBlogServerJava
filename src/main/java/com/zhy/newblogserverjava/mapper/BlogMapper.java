package com.zhy.newblogserverjava.mapper;

import com.zhy.newblogserverjava.domain.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {

    @Select("select * from blog order by id desc")
    List<Blog> selectAllBlogs();

    @Select("select * from blog where id =#{blogId}")
    List<Blog> getBlog(@Param("blogId") Integer blogId);

    @Insert("INSERT into blog(title,description,content,created) VALUES(#{title},#{description},#{content},#{created})")
    int addBlog(@Param("title") String title, @Param("description") String description, @Param("content") String content, @Param("created") String created);

    @Update("update blog set(title,description,content,created) where id=#{id}  VALUES(#{title},#{description},#{content},#{created}")
    int editBlog(Integer id, String title, String description, String content, String created);
}
