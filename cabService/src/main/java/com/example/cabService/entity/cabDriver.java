package com.example.cabService.entity;





public class cabDriver {
    private int cabId;
    private int driverId;

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getCabId() {
        return cabId;
    }

    public int getDriverId() {
        return driverId;
    }

    public cabDriver(int cabId, int driverId) {
        this.cabId = cabId;
        this.driverId = driverId;
    }
}
