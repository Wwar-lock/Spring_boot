package com.example.cabService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class ride {
    @Id
    private Integer rideId;
    private Integer usrId;
    private Integer cabId;
    private Boolean currentRideStatus;


    public void setRideId(Integer rideId) {
        this.rideId = rideId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public void setCurrentRideStatus(Boolean currentRideStatus) {
        this.currentRideStatus = currentRideStatus;
    }

    public Integer getRideId() {
        return rideId;
    }

    public Integer getUsrId() {
        return usrId;
    }

    public Integer getCabId() {
        return cabId;
    }

    public Boolean getCurrentRideStatus() {
        return currentRideStatus;
    }
}
