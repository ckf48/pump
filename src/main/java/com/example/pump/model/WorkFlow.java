package com.example.pump.model;

public class WorkFlow {
    private Integer pumpno;

    private String time;

    private Double flow;

    private Double efficiency;

    private Double work;

    private Double head;

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

    public Double getWork() {
        return work;
    }

    public void setWork(Double work) {
        this.work = work;
    }

    public Double getHead() {
        return head;
    }

    public void setHead(Double head) {
        this.head = head;
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
        sb.append(", work=").append(work);
        sb.append(", head=").append(head);
        sb.append("]");
        return sb.toString();
    }
}