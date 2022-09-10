package com.all.boot6mybatis.controller;

import com.all.boot6mybatis.service.stuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class stuController {

    @Resource
    private stuService stuService;

    @RequestMapping("/user/search")
    @ResponseBody
    public String test1(Integer id){


        return stuService.searchByID(id).toString();

    }

}
