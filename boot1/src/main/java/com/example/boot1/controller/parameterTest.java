package com.example.boot1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class parameterTest {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @ResponseBody
    @RequestMapping("/parameterTest")
    public String paramater(){
        return name+","+age;
    }

}
