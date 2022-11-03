package com.example.pump.mapper;

import com.example.pump.model.EfficiencyStatistics;
import com.example.pump.model.EfficiencyStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EfficiencyStatisticsMapper {
    long countByExample(EfficiencyStatisticsExample example);

    int deleteByExample(EfficiencyStatisticsExample example);

    int insert(EfficiencyStatistics record);

    int insertSelective(EfficiencyStatistics record);

    List<EfficiencyStatistics> selectByExample(EfficiencyStatisticsExample example);

    int updateByExampleSelective(@Param("record") EfficiencyStatistics record, @Param("example") EfficiencyStatisticsExample example);

    int updateByExample(@Param("record") EfficiencyStatistics record, @Param("example") EfficiencyStatisticsExample example);
}