package com.example.pump.mapper;

import com.example.pump.model.Optimization;
import com.example.pump.model.OptimizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptimizationMapper {
    long countByExample(OptimizationExample example);

    int deleteByExample(OptimizationExample example);

    int insert(Optimization record);

    int insertSelective(Optimization record);

    List<Optimization> selectByExample(OptimizationExample example);

    int updateByExampleSelective(@Param("record") Optimization record, @Param("example") OptimizationExample example);

    int updateByExample(@Param("record") Optimization record, @Param("example") OptimizationExample example);
}