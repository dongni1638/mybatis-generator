package com.ice.dao;

import com.ice.demo.NAME;

public interface NAMEMapper {
    int deleteByPrimaryKey(Short id);

    int insert(NAME record);

    int insertSelective(NAME record);

    NAME selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(NAME record);

    int updateByPrimaryKey(NAME record);
}