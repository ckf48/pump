package com.example.pump.data;

import java.util.ArrayList;
import java.util.List;

public class Series {
    private List<Block> blocks;

    public Series(){
        blocks = new ArrayList<>();
    }

    public void addBlock(Block block){
        blocks.add(block);
    }

    public List<Block> getBlocks(){
        return blocks;
    }
}
