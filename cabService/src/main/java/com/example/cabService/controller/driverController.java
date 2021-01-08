package com.example.cabService.controller;

import com.example.cabService.entity.driver;
import com.example.cabService.exception.DriverAlreadyAdded;
import com.example.cabService.services.driverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/drivers")
public class driverController {

    @Autowired
    private driverService ds;
    @GetMapping("/")
    String home(){
        return "Hi Driver Repo";
    }
    @GetMapping("/all")
    List<driver>getAllDrivers(){
        return ds.getAllDrivers();
    }
    @PostMapping("/add")
    driver addDriver(@RequestBody driver dr){
        return ds.addDriver(dr);
    }
    @PutMapping("/update")
    driver updateDriver(@RequestBody driver dr){
        return ds.updateDriver(dr);
    }
}
