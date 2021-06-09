package com.zhy.newblogserverjava.mapper;


import com.zhy.newblogserverjava.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user")
    List<User> selectAllUsers();

}
