package com.aaa.lee.springboot.controller;

import com.aaa.lee.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/role/{username}")
    public List<String> selectRoleNameByUsername(@PathVariable("username") String username) {
        return roleService.selectRoleNameByUsername(username);
    }

}
