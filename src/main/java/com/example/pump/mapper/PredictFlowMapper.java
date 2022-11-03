package com.example.pump.mapper;

import com.example.pump.model.PredictFlow;
import com.example.pump.model.PredictFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PredictFlowMapper {
    long countByExample(PredictFlowExample example);

    int deleteByExample(PredictFlowExample example);

    int insert(PredictFlow record);

    int insertSelective(PredictFlow record);

    List<PredictFlow> selectByExample(PredictFlowExample example);

    int updateByExampleSelective(@Param("record") PredictFlow record, @Param("example") PredictFlowExample example);

    int updateByExample(@Param("record") PredictFlow record, @Param("example") PredictFlowExample example);
}