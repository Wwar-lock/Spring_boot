package com.example.cabService.controller;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.cabService.entity.ride;
import com.example.cabService.services.rideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/rides")
public class rideController {
    @Autowired
    private rideService rds;

    @GetMapping("/")
    String home(){
        return "Hi !! Rides here!";
    }

    @PostMapping("/add")
    ride addRide(@RequestBody ride rd){
        return rds.addRide(rd);
    }

    @GetMapping("/all")
    List<ride>getAllRides(){
        return rds.getgAllRides();
    }

    @PutMapping("/update")
    ride updateRide(@RequestBody ride rd){
        return rds.updateStatus(rd);
    }

}

