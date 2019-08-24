package com.aaa.lee.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description
 *      使用@Select。。。这些注解进行操作数据库的时候，方便于简单的单表查询，对于多表而言就会很负责
 *      在实际开发过程中，很少会有项目出现这种情况，大多数还是使用xml进行映射
 *      也可以两种方式进行结合(当使用逆向工程的时候，所有单表增删改查全部被生成了，直接可以使用)
 *      所以大多数公司还是会使用xml文件进行映射不使用注解形式
 */
@Mapper
public interface RoleMapper {

    @Select("select r.role_name from user u " +
            "left join user_role ur on ur.user_id = u.id " +
            "left join role r on r.id = ur.role_id " +
            "where u.username = #{username}")
    List<String> selectRoleNameByUsername(String username);

}
