package com.example.cabService.controller;

import com.example.cabService.entity.cab;
import com.example.cabService.services.cabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/cabs")
public class cabController {
    @Autowired
    private cabService cbService;

//    @Autowired
//    public cabController(cabService cbService) {
//        this.cbService = cbService;
//    }

    @GetMapping("/{cabId}")
    public cab getCar(@PathVariable int cabId){
        return cbService.getCab(cabId);
    }

    @GetMapping("/all")
    public List<cab>getAllCabs(){
        return cbService.getAllCabs();
    }

    @GetMapping("/")
    public String home(){
        return "Hi!! there";
    }

    @PostMapping("/add")
    public cab createNewCab(@RequestBody cab cb){
        return cbService.addCar(cb);
    }

    @PutMapping("/update")
    public cab updateCab(@RequestBody cab cb){
        return cbService.updateCab(cb);
    }

    @DeleteMapping("delete/{cabId}")
    public String deleteCab(@PathVariable int cabId){
        cbService.deleteCab(cabId);
        return "Deleted";
    }

}
