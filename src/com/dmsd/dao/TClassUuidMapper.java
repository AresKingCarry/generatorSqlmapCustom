package com.dmsd.dao;

import com.dmsd.pojo.TClassUuid;
import com.dmsd.pojo.TClassUuidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TClassUuidMapper {
    int countByExample(TClassUuidExample example);

    int deleteByExample(TClassUuidExample example);

    int deleteByPrimaryKey(String id);

    int insert(TClassUuid record);

    int insertSelective(TClassUuid record);

    List<TClassUuid> selectByExample(TClassUuidExample example);

    TClassUuid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TClassUuid record, @Param("example") TClassUuidExample example);

    int updateByExample(@Param("record") TClassUuid record, @Param("example") TClassUuidExample example);

    int updateByPrimaryKeySelective(TClassUuid record);

    int updateByPrimaryKey(TClassUuid record);
}