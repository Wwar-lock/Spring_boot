package com.example.cabService.controller;

import com.example.cabService.entity.cab;
import com.example.cabService.exception.EntityNotFoundException;
import com.example.cabService.services.cabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController
@RequestMapping(value = "/cabs")
public class cabController {

    @Autowired
    private cabService cbs;

    @GetMapping("/")
    String home(){
        return "Hi there!!!";
    }
    @PostMapping("/add")
    cab addCab(@RequestBody cab cb){
        return cbs.addCar(cb);
    }
    @GetMapping("/all")
    List<cab> getAllCabs(){
        return cbs.getAllCabs();
    }
}
