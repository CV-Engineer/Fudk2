package com.itszt.Mapper;

import com.itszt.pojo.Fucker;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FuckerMapper {
    int deleteByPrimaryKey(String username);

    int insert(Fucker record);

    int insertSelective(Fucker record);

    Fucker selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Fucker record);

    int updateByPrimaryKey(Fucker record);
}