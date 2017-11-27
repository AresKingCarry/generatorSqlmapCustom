package com.dmsd.dao;

import com.dmsd.pojo.TClass;
import com.dmsd.pojo.TClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TClassMapper {
    int countByExample(TClassExample example);

    int deleteByExample(TClassExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TClass record);

    int insertSelective(TClass record);

    List<TClass> selectByExample(TClassExample example);

    TClass selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TClass record, @Param("example") TClassExample example);

    int updateByExample(@Param("record") TClass record, @Param("example") TClassExample example);

    int updateByPrimaryKeySelective(TClass record);

    int updateByPrimaryKey(TClass record);
}