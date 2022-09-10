package com.all.boot6mybatis.service;

import com.all.boot6mybatis.dao.studentDao;
import com.all.boot6mybatis.domain.student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class stuService {

    @Resource
    private studentDao dao;

    public student searchByID(Integer id){

        return dao.selectByID(id);

    }


}
