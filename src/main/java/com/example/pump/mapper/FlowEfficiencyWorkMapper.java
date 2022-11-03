package com.example.pump.mapper;

import com.example.pump.model.FlowEfficiencyWork;
import com.example.pump.model.FlowEfficiencyWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowEfficiencyWorkMapper {
    long countByExample(FlowEfficiencyWorkExample example);

    int deleteByExample(FlowEfficiencyWorkExample example);

    int insert(FlowEfficiencyWork record);

    int insertSelective(FlowEfficiencyWork record);

    List<FlowEfficiencyWork> selectByExample(FlowEfficiencyWorkExample example);

    int updateByExampleSelective(@Param("record") FlowEfficiencyWork record, @Param("example") FlowEfficiencyWorkExample example);

    int updateByExample(@Param("record") FlowEfficiencyWork record, @Param("example") FlowEfficiencyWorkExample example);
}