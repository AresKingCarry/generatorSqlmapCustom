package com.dmsd.dao;

import com.dmsd.pojo.TGroupUuid;
import com.dmsd.pojo.TGroupUuidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGroupUuidMapper {
    int countByExample(TGroupUuidExample example);

    int deleteByExample(TGroupUuidExample example);

    int deleteByPrimaryKey(String id);

    int insert(TGroupUuid record);

    int insertSelective(TGroupUuid record);

    List<TGroupUuid> selectByExample(TGroupUuidExample example);

    TGroupUuid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TGroupUuid record, @Param("example") TGroupUuidExample example);

    int updateByExample(@Param("record") TGroupUuid record, @Param("example") TGroupUuidExample example);

    int updateByPrimaryKeySelective(TGroupUuid record);

    int updateByPrimaryKey(TGroupUuid record);
}