package com.all.boot6mybatis.dao;

import com.all.boot6mybatis.domain.student;
import org.apache.ibatis.annotations.Param;

public interface studentDao {

    student selectByID(@Param("stuID") Integer id);


}
