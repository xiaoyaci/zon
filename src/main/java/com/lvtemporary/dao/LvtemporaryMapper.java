package com.lvtemporary.dao;

import com.lvtemporary.entity.Lvtemporary;
import com.lvtemporary.entity.LvtemporaryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LvtemporaryMapper {
    long countByExample(LvtemporaryExample example);

    int deleteByExample(LvtemporaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Lvtemporary record);

    int insertSelective(Lvtemporary record);

    List<Lvtemporary> selectByExample(LvtemporaryExample example);

    Lvtemporary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Lvtemporary record, @Param("example") LvtemporaryExample example);

    int updateByExample(@Param("record") Lvtemporary record, @Param("example") LvtemporaryExample example);

    int updateByPrimaryKeySelective(Lvtemporary record);

    int updateByPrimaryKey(Lvtemporary record);
}