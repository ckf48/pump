package com.example.pump.mapper;

import com.example.pump.model.HeadFlow;
import com.example.pump.model.HeadFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeadFlowMapper {
    long countByExample(HeadFlowExample example);

    int deleteByExample(HeadFlowExample example);

    int insert(HeadFlow record);

    int insertSelective(HeadFlow record);

    List<HeadFlow> selectByExample(HeadFlowExample example);

    int updateByExampleSelective(@Param("record") HeadFlow record, @Param("example") HeadFlowExample example);

    int updateByExample(@Param("record") HeadFlow record, @Param("example") HeadFlowExample example);
}