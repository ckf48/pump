package com.example.pump.model;

public class HeadFlow {
    private Double head;

    private Double flow;

    private Integer pumpno;

    private String time;

    public Double getHead() {
        return head;
    }

    public void setHead(Double head) {
        this.head = head;
    }

    public Double getFlow() {
        return flow;
    }

    public void setFlow(Double flow) {
        this.flow = flow;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", head=").append(head);
        sb.append(", flow=").append(flow);
        sb.append(", pumpno=").append(pumpno);
        sb.append(", time=").append(time);
        sb.append("]");
        return sb.toString();
    }
}