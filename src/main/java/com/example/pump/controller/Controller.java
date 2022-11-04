package com.example.pump.controller;

import com.example.pump.data.Block;
import com.example.pump.model.EfficiencyStatistics;
import com.example.pump.service.Service;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/service")
public class Controller {


    @Resource
    private Service service;


    @PostMapping("/head_flow")
    public List<Block> getHeadFlow(@RequestParam int pumpNo,
                                   @RequestParam String start,
                                   @RequestParam String end) {

        return service.head_flow(pumpNo, start, end);
    }


    @PostMapping("/work_flow")
    public List<Block> getWorkFlow(@RequestParam int pumpNo,
                                   @RequestParam String start,
                                   @RequestParam String end) {

        return service.work_flow(pumpNo, start, end);
    }

    @PostMapping("/efficiency_flow")
    public List<Block> getEfficiencyFlow(@RequestParam int pumpNo,
                                         @RequestParam String start,
                                         @RequestParam String end) {


        return service.efficiency_flow(pumpNo, start, end);
    }

    @PostMapping("/predict_flow")
    public List<Block> getPredictFlow(@RequestParam int pumpNo,
                                      @RequestParam String start,
                                      @RequestParam String end) {


        return service.predict_flow(pumpNo, start, end);
    }

    @PostMapping("/efficiency_statistics")
    public Map<Integer, List<ModelForStatistics>> getEfficiencyStatistics(@RequestParam List<Integer> pumpNos,
                                                                          @RequestParam String start,
                                                                          @RequestParam String end) {
        Map<Integer, List<ModelForStatistics>> map = new LinkedHashMap<>();
        for (int pumpNo : pumpNos) {
            List<EfficiencyStatistics> dataList = service.efficiency_statistics(pumpNo, start, end);
            List<ModelForStatistics> list = new LinkedList<>();
            for (EfficiencyStatistics item : dataList) {
                list.add(new ModelForStatistics(item.getTime(), item.getEfficiency()));
            }

            map.put(pumpNo, list);
        }

        return map;
    }

    @PostMapping("/optimization")
    public Map<Integer, Integer> optimization(String date) {
        return service.optimization(date);
    }

    @PostMapping("/signIn")

    public String signIn(@RequestParam String username,
                         @RequestParam String password) {
        return service.getUserToken(username, password);
    }

    @Data
    private static class ModelForStatistics {
        String time;
        double efficiency;

        public ModelForStatistics(String time, double efficiency) {
            this.time = time;
            this.efficiency = efficiency;
        }
    }


}
