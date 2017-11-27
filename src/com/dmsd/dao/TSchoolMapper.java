package com.dmsd.dao;

import com.dmsd.pojo.TSchool;
import com.dmsd.pojo.TSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSchoolMapper {
    int countByExample(TSchoolExample example);

    int deleteByExample(TSchoolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSchool record);

    int insertSelective(TSchool record);

    List<TSchool> selectByExample(TSchoolExample example);

    TSchool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSchool record, @Param("example") TSchoolExample example);

    int updateByExample(@Param("record") TSchool record, @Param("example") TSchoolExample example);

    int updateByPrimaryKeySelective(TSchool record);

    int updateByPrimaryKey(TSchool record);
}