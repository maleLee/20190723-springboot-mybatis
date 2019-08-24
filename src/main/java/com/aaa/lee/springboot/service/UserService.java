package com.aaa.lee.springboot.service;

import com.aaa.lee.springboot.mapper.UserMapper;
import com.aaa.lee.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @descriotion
 *      在service层无法找到UserMapper类型，如何导致该错误？
 *          没有<bean></bean> 在spring的配置文件中，mybatis框架是需要被spring所代理的
 *          当在spring中已经声明过某些框架后，该框架所被需要的对象，直接由spring进行管理和创建(并且一定是单利的)
 *          mapper接口(mybatis框架)并没有spring进行托管，所以在整个spring体系项目中，找不到该类型
 *          换句话说，没有在spring的xml中进行配置<bean></bean>
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    public User selectUserById(Long id) {
        return userMapper.selectUserById(id);
    }

}
