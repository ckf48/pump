package com.example.pump.model;

public class Optimization {
    private Integer pump1;

    private Integer pump2;

    private Integer pump3;

    private Integer pump4;

    private Integer pump5;

    private Integer pump6;

    private String time;

    public Integer getPump1() {
        return pump1;
    }

    public void setPump1(Integer pump1) {
        this.pump1 = pump1;
    }

    public Integer getPump2() {
        return pump2;
    }

    public void setPump2(Integer pump2) {
        this.pump2 = pump2;
    }

    public Integer getPump3() {
        return pump3;
    }

    public void setPump3(Integer pump3) {
        this.pump3 = pump3;
    }

    public Integer getPump4() {
        return pump4;
    }

    public void setPump4(Integer pump4) {
        this.pump4 = pump4;
    }

    public Integer getPump5() {
        return pump5;
    }

    public void setPump5(Integer pump5) {
        this.pump5 = pump5;
    }

    public Integer getPump6() {
        return pump6;
    }

    public void setPump6(Integer pump6) {
        this.pump6 = pump6;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pump1=").append(pump1);
        sb.append(", pump2=").append(pump2);
        sb.append(", pump3=").append(pump3);
        sb.append(", pump4=").append(pump4);
        sb.append(", pump5=").append(pump5);
        sb.append(", pump6=").append(pump6);
        sb.append(", time=").append(time);
        sb.append("]");
        return sb.toString();
    }
}