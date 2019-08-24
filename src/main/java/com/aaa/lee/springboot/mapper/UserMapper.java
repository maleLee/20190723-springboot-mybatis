package com.aaa.lee.springboot.mapper;

import com.aaa.lee.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description
 *      使用注解的形式进行对数据库的操作(CRUD)
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> selectAllUsers();

    @Select("select * from user where id = #{id}")
    User selectUserById(Long id);

}