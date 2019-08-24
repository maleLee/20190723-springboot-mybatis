package com.aaa.lee.springboot.controller;

import com.aaa.lee.springboot.model.User;
import com.aaa.lee.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public List<User> selectUsers() {
        return userService.selectAllUsers();
    }

    @RequestMapping("/user/{id}")
    public User selectUserById(@PathVariable("id") Long id) {
        return userService.selectUserById(id);
    }

}
