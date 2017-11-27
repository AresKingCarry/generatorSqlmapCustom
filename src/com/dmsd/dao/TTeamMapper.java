package com.dmsd.dao;

import com.dmsd.pojo.TTeam;
import com.dmsd.pojo.TTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeamMapper {
    int countByExample(TTeamExample example);

    int deleteByExample(TTeamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTeam record);

    int insertSelective(TTeam record);

    List<TTeam> selectByExample(TTeamExample example);

    TTeam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTeam record, @Param("example") TTeamExample example);

    int updateByExample(@Param("record") TTeam record, @Param("example") TTeamExample example);

    int updateByPrimaryKeySelective(TTeam record);

    int updateByPrimaryKey(TTeam record);
}