package com.example.d4.controller;

import com.example.d4.entity.User;
import com.example.d4.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class indexController {
    @GetMapping(value = "/")
    public String index() {
        return "hello ";
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userMapper.getAll();
    }
}
