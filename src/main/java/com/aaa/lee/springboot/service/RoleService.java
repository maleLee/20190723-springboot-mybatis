package com.aaa.lee.springboot.service;

import com.aaa.lee.springboot.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<String> selectRoleNameByUsername(String username) {
        return roleMapper.selectRoleNameByUsername(username);
    }

}
