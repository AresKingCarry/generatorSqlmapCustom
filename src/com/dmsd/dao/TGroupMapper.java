package com.dmsd.dao;

import com.dmsd.pojo.TGroup;
import com.dmsd.pojo.TGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGroupMapper {
    int countByExample(TGroupExample example);

    int deleteByExample(TGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    List<TGroup> selectByExample(TGroupExample example);

    TGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByExample(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);
}