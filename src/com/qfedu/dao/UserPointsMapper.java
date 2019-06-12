package com.qfedu.dao;

import com.qfedu.entity.UserPoints;

public interface UserPointsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPoints record);

    int insertSelective(UserPoints record);

    UserPoints selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPoints record);

    int updateByPrimaryKey(UserPoints record);
}