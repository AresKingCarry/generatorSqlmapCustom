package com.dmsd.dao;

import com.dmsd.pojo.TTeamUuid;
import com.dmsd.pojo.TTeamUuidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeamUuidMapper {
    int countByExample(TTeamUuidExample example);

    int deleteByExample(TTeamUuidExample example);

    int deleteByPrimaryKey(String id);

    int insert(TTeamUuid record);

    int insertSelective(TTeamUuid record);

    List<TTeamUuid> selectByExample(TTeamUuidExample example);

    TTeamUuid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TTeamUuid record, @Param("example") TTeamUuidExample example);

    int updateByExample(@Param("record") TTeamUuid record, @Param("example") TTeamUuidExample example);

    int updateByPrimaryKeySelective(TTeamUuid record);

    int updateByPrimaryKey(TTeamUuid record);
}