package com.example.pump.model;

public class EfficiencyStatistics {
    private String time;

    private Integer pumpno;

    private Double efficiency;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getPumpno() {
        return pumpno;
    }

    public void setPumpno(Integer pumpno) {
        this.pumpno = pumpno;
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
        sb.append(", time=").append(time);
        sb.append(", pumpno=").append(pumpno);
        sb.append(", efficiency=").append(efficiency);
        sb.append("]");
        return sb.toString();
    }
}