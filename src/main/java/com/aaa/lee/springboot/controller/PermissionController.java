package com.aaa.lee.springboot.controller;

import com.aaa.lee.springboot.model.Permission;
import com.aaa.lee.springboot.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/allPermission")
    public List<Permission> selectAllPermission() {
        return permissionService.selectAllPermission();
    }

}
