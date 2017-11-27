package com.dmsd.dao;

import com.dmsd.pojo.TAres;
import com.dmsd.pojo.TAresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAresMapper {
    int countByExample(TAresExample example);

    int deleteByExample(TAresExample example);

    int deleteByPrimaryKey(String id);

    int insert(TAres record);

    int insertSelective(TAres record);

    List<TAres> selectByExample(TAresExample example);

    TAres selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TAres record, @Param("example") TAresExample example);

    int updateByExample(@Param("record") TAres record, @Param("example") TAresExample example);

    int updateByPrimaryKeySelective(TAres record);

    int updateByPrimaryKey(TAres record);
}