package com.taiji.gz.dao;

import com.taiji.gz.entity.userLogin;

public interface userLoginMapper {

    //添加功能（非自动生成）
    userLogin login(String userloginname);

    //
    int deleteByPrimaryKey(Integer id);

    int insert(userLogin record);

    int insertSelective(userLogin record);

    userLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userLogin record);

    int updateByPrimaryKey(userLogin record);
}