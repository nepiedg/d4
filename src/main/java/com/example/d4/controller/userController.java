package com.example.d4.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/")
public class userController {
    @PostMapping("/login")
    public void login(@RequestParam Map<String, Object> params) {
        System.out.println(params.get("name"));
    }

}
