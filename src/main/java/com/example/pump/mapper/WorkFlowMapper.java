package com.example.pump.mapper;

import com.example.pump.model.WorkFlow;
import com.example.pump.model.WorkFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkFlowMapper {
    long countByExample(WorkFlowExample example);

    int deleteByExample(WorkFlowExample example);

    int insert(WorkFlow record);

    int insertSelective(WorkFlow record);

    List<WorkFlow> selectByExample(WorkFlowExample example);

    int updateByExampleSelective(@Param("record") WorkFlow record, @Param("example") WorkFlowExample example);

    int updateByExample(@Param("record") WorkFlow record, @Param("example") WorkFlowExample example);
}