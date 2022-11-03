package com.example.pump.controller;

import com.example.pump.data.Block;
import com.example.pump.service.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

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

}
