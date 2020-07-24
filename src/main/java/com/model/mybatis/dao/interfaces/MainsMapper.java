package com.model.mybatis.dao.interfaces;

import com.model.mybatis.entitys.Mains;

public interface MainsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mains record);

    int insertSelective(Mains record);

    Mains selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mains record);

    int updateByPrimaryKey(Mains record);
}