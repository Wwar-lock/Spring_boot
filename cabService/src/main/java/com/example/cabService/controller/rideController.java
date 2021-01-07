package com.example.cabService.controller;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.cabService.entity.ride;
import com.example.cabService.services.rideStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/ride")
public class rideController {
    @Autowired
    private rideStatus rds;

    @GetMapping("/")
    public String welcome(){
        return "Hi! Ride";
    }

    @GetMapping("/all")
    public List<ride>getAllRides(){
        return rds.getgAllRides();
    }

    @PostMapping("/add")
    public ride addRride(@RequestBody ride rd){
        if(rds.checkRideId(rd.getRideId())){
            return null;
        }
        return rds.addRide(rd);
    }

    @PutMapping("/update")
    public ride updateRide(@RequestBody ride rd){
        return rds.updateStatus(rd);
    }

    @DeleteMapping("delete/{rideId}")
    public String deleteRide(@PathVariable Integer rideId){
        if(rds.checkRideId(rideId)){
            return rds.deleteRide(rideId);
        }
        return "ID doesn't exsits!!";
    }
}
