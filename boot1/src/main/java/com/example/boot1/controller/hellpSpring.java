package com.example.boot1.controller;


import com.example.boot1.domain.student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class hellpSpring {

    @Value("${name}")
    private String name;
    @Resource
    private student s1;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return s1.toString()+"       "+name;
    }

}
