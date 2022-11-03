package com.example.pump.mapper;

import com.example.pump.model.EfficiencyFlow;
import com.example.pump.model.EfficiencyFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EfficiencyFlowMapper {
    long countByExample(EfficiencyFlowExample example);

    int deleteByExample(EfficiencyFlowExample example);

    int insert(EfficiencyFlow record);

    int insertSelective(EfficiencyFlow record);

    List<EfficiencyFlow> selectByExample(EfficiencyFlowExample example);

    int updateByExampleSelective(@Param("record") EfficiencyFlow record, @Param("example") EfficiencyFlowExample example);

    int updateByExample(@Param("record") EfficiencyFlow record, @Param("example") EfficiencyFlowExample example);
}