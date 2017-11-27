package com.dmsd.dao;

import com.dmsd.pojo.TStuff;
import com.dmsd.pojo.TStuffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStuffMapper {
    int countByExample(TStuffExample example);

    int deleteByExample(TStuffExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TStuff record);

    int insertSelective(TStuff record);

    List<TStuff> selectByExample(TStuffExample example);

    TStuff selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TStuff record, @Param("example") TStuffExample example);

    int updateByExample(@Param("record") TStuff record, @Param("example") TStuffExample example);

    int updateByPrimaryKeySelective(TStuff record);

    int updateByPrimaryKey(TStuff record);
}