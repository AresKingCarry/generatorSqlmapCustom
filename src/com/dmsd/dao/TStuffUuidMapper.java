package com.dmsd.dao;

import com.dmsd.pojo.TStuffUuid;
import com.dmsd.pojo.TStuffUuidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStuffUuidMapper {
    int countByExample(TStuffUuidExample example);

    int deleteByExample(TStuffUuidExample example);

    int deleteByPrimaryKey(String id);

    int insert(TStuffUuid record);

    int insertSelective(TStuffUuid record);

    List<TStuffUuid> selectByExample(TStuffUuidExample example);

    TStuffUuid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TStuffUuid record, @Param("example") TStuffUuidExample example);

    int updateByExample(@Param("record") TStuffUuid record, @Param("example") TStuffUuidExample example);

    int updateByPrimaryKeySelective(TStuffUuid record);

    int updateByPrimaryKey(TStuffUuid record);
}