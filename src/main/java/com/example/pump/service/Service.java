package com.example.pump.service;

import com.example.pump.data.Block;
import com.example.pump.data.Series;
import com.example.pump.mapper.*;
import com.example.pump.model.*;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {
    @Resource
    private HeadFlowMapper headFlowMapper;

    @Resource
    private WorkFlowMapper workFlowMapper;

    @Resource
    private EfficiencyFlowMapper efficiencyFlowMapper;

    @Resource
    private PredictFlowMapper predictFlowMapper;

    @Resource
    private OptimizationMapper optimizationMapper;

    @Resource
    private UserMapper userMapper;





//    private List<FlowEfficiencyWork> getFlowEfficiencyWork(int pumpNo, String start, String end) {
//        FlowEfficiencyWorkExample example = new FlowEfficiencyWorkExample();
//
//        example.createCriteria().andTimeBetween(start, end).andPumpnoEqualTo(pumpNo);
////        example.createCriteria().andPumpnoEqualTo(pumpNo);
//        return flowEfficiencyWorkMapper.selectByExample(example);
//    }

    private List<HeadFlow> getHeadFlow(int pumpNo,String start,String end){
        HeadFlowExample example = new HeadFlowExample();
        example.createCriteria().andTimeBetween(start,end).andPumpnoEqualTo(pumpNo);
        return headFlowMapper.selectByExample(example);
    }

    private List<WorkFlow> getWorkFlow(int pumpNo, String start, String end){
        WorkFlowExample example = new WorkFlowExample();
        example.createCriteria().andTimeBetween(start,end).andPumpnoEqualTo(pumpNo);
        return workFlowMapper.selectByExample(example);
    }

    private List<EfficiencyFlow> getEfficiencyFlow(int pumpNo, String start, String end){
        EfficiencyFlowExample example = new EfficiencyFlowExample();
        example.createCriteria().andTimeBetween(start,end).andPumpnoEqualTo(pumpNo);
        return efficiencyFlowMapper.selectByExample(example);
    }
    
    private List<PredictFlow> getPredictFlow(int pumpNo,String start,String end){
        PredictFlowExample example = new PredictFlowExample();
        example.createCriteria().andTimeBetween(start,end).andPumpnoEqualTo(pumpNo);
        return predictFlowMapper.selectByExample(example);
    }

    public List<Block> head_flow(int pumpNo, String start, String end) {
        List<HeadFlow> dataList = getHeadFlow(pumpNo, start, end);
        Map<String,Double> heads = new LinkedHashMap<>();
        Map<String,Double> flows = new LinkedHashMap<>();

        for (HeadFlow item : dataList) {
            heads.put(item.getTime(),item.getHead());
            flows.put(item.getTime(),item.getFlow());
        }

        Block head = new Block("head");
        head.setData(heads);

        Block flow = new Block("flow");
        flow.setData(flows);

        Series series = new Series();
        series.addBlock(head);
        series.addBlock(flow);

        return series.getBlocks();

    }

    public List<Block> work_flow(int pumpNo, String start, String end) {
        List<WorkFlow> dataList = getWorkFlow(pumpNo, start, end);
        Map<String,Double> works = new LinkedHashMap<>();
        Map<String,Double> flows = new LinkedHashMap<>();

        for (WorkFlow item : dataList) {
            works.put(item.getTime(),item.getWork());
            flows.put(item.getTime(),item.getFlow());
        }

        Block work = new Block("work");
        work.setData(works);

        Block flow = new Block("flow");
        flow.setData(flows);

        Series series = new Series();
        series.addBlock(work);
        series.addBlock(flow);

        return series.getBlocks();
    }

    public List<Block> efficiency_flow(int pumpNo, String start, String end) {
        List<EfficiencyFlow> dataList = getEfficiencyFlow(pumpNo, start, end);
        Map<String,Double> efficiencys = new LinkedHashMap<>();
        Map<String,Double> flows = new LinkedHashMap<>();

        for (EfficiencyFlow item : dataList) {
            efficiencys.put(item.getTime(),item.getEfficiency());
            flows.put(item.getTime(),item.getFlow());
        }

        Block efficiency = new Block("efficiency");
        efficiency.setData(efficiencys);

        Block flow = new Block("flow");
        flow.setData(flows);

        Series series = new Series();
        series.addBlock(efficiency);
        series.addBlock(flow);

        return series.getBlocks();
    }

    public List<Block> predict_flow(int pumpNo, String start, String end) {
        List<PredictFlow> dataList = getPredictFlow(pumpNo, start, end);
        Map<String,Double> predicts = new LinkedHashMap<>();
        Map<String,Double> flows = new LinkedHashMap<>();

        for (PredictFlow item : dataList) {
            predicts.put(item.getTime(),item.getPredict());
            flows.put(item.getTime(),item.getFlow());
        }

        Block predict = new Block("predict");
        predict.setData(predicts);

        Block flow = new Block("flow");
        flow.setData(flows);

        Series series = new Series();
        series.addBlock(predict);
        series.addBlock(flow);

        return series.getBlocks();
    }
}
