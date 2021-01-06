package com.example.cabService.entity;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class cab {
    @Id
    private int cabId;
    private int cabRating;
    private int cabSeatCount;
    private String cabCondition;

//    public cab(int cabId, int cabRating, int cabSeatCount, String cabCondition) {
//        this.cabId = cabId;
//        this.cabRating = cabRating;
//        this.cabSeatCount = cabSeatCount;
//        this.cabCondition = cabCondition;
//    }


    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public void setCabRating(int cabRating) {
        this.cabRating = cabRating;
    }

    public void setCabSeatCount(int cabSeatCount) {
        this.cabSeatCount = cabSeatCount;
    }

    public void setCabCondition(String cabCondition) {
        this.cabCondition = cabCondition;
    }

    public int getCabId() {
        return cabId;
    }

    public int getCabRating() {
        return cabRating;
    }

    public int getCabSeatCount() {
        return cabSeatCount;
    }

    public String getCabCondition() {
        return cabCondition;
    }
}
