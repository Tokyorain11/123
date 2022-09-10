package com.all.boot5filter.controller;

import com.all.boot5filter.domain.stu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class myController {

    @Resource
    private stu s1;

    @RequestMapping("/user/login")
    @ResponseBody
    public String c1(){
        return s1.toString();
    }

}
