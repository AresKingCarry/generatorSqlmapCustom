package com.dmsd.dao;

import com.dmsd.pojo.TSchoolUuid;
import com.dmsd.pojo.TSchoolUuidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSchoolUuidMapper {
    int countByExample(TSchoolUuidExample example);

    int deleteByExample(TSchoolUuidExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSchoolUuid record);

    int insertSelective(TSchoolUuid record);

    List<TSchoolUuid> selectByExample(TSchoolUuidExample example);

    TSchoolUuid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSchoolUuid record, @Param("example") TSchoolUuidExample example);

    int updateByExample(@Param("record") TSchoolUuid record, @Param("example") TSchoolUuidExample example);

    int updateByPrimaryKeySelective(TSchoolUuid record);

    int updateByPrimaryKey(TSchoolUuid record);
}