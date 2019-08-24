package com.aaa.lee.springboot.service;

import com.aaa.lee.springboot.mapper.PermissionMapper;
import com.aaa.lee.springboot.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    public List<Permission> selectAllPermission() {
        List<Permission> permissionList = permissionMapper.selectAll();
        System.out.println(permissionList);
        return permissionMapper.selectAll();

    }

}
