package com.example.cabService.entity;

import com.example.cabService.status.driverStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class driver {
    @Id
    private int driverId;
    private String name;
    private int rating ;
    private int exp;
    private boolean currentRideStatus = false;

    public void setCurrentRideStatus(boolean currentRideStatus) {
        this.currentRideStatus = currentRideStatus;
    }

    public boolean getCurrentRideStatus() {
        return currentRideStatus;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getExp() {
        return exp;
    }

    public driver(int driverId, String name, int rating, int exp) {
        this.driverId = driverId;
        this.name = name;
        this.rating = rating;
        this.exp = exp;
    }
}
