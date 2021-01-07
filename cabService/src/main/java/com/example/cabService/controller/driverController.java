package com.example.cabService.controller;

import com.example.cabService.entity.driver;
import com.example.cabService.exception.DriverAlreadyAdded;
import com.example.cabService.services.driverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/drivers")
public class driverController {
    @Autowired
    private driverService dService;

//    @Autowired
//    public driverController(driverService dService) {
//        this.dService = dService;
//    }

    @GetMapping("/")
    public String home(){
        return "Hi!! there";
    }

    @GetMapping("/all")
    public List<driver>getAllDrivers(){
        return dService.getAllDrivers();
    }

    @PostMapping("/add")
    public driver addDriver(@RequestBody driver dr) throws DriverAlreadyAdded {
        if(dService.checkDriverId(dr.getDriverId())){
            return null;
        }
        return dService.addDriver(dr);
    }

    @PutMapping("/update")
    public driver updateDriver(@RequestBody driver dr){
        return dService.updateDriver(dr);
    }
}
