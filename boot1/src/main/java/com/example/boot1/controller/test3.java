package com.example.boot1.controller;

import com.example.boot1.domain.address;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class test3 {

    @Value("${name}")
    private String something;

    @Resource
    private address a1;

    @ResponseBody
    @RequestMapping("/add")
    public String add(){
        return a1.toString();
    }

}
