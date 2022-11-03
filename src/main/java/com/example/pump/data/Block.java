package com.example.pump.data;


import java.util.LinkedHashMap;
import java.util.Map;

public class Block {
    private String name;
    private final String type = "line";
    private Map<String, Double> data;

    public Block(String name) {
        this.name = name;
        data = new LinkedHashMap<>();
    }

    public void setData(Map<String, Double> map) {
        data.putAll(map);
    }


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getData() {
        return data;
    }
}
