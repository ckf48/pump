package com.example.pump.model;

public class EfficiencyFlow {
    private Integer pumpno;

    private String time;

    private Double flow;

    private Double efficiency;

    public Integer getPumpno() {
        return pumpno;
    }

    public void setPumpno(Integer pumpno) {
        this.pumpno = pumpno;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getFlow() {
        return flow;
    }

    public void setFlow(Double flow) {
        this.flow = flow;
    }

    public Double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pumpno=").append(pumpno);
        sb.append(", time=").append(time);
        sb.append(", flow=").append(flow);
        sb.append(", efficiency=").append(efficiency);
        sb.append("]");
        return sb.toString();
    }
}