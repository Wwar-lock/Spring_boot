package com.example.cabService.controller;

import com.example.cabService.entity.cab;
import com.example.cabService.exception.EntityNotFoundException;
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
    public cab getCar(@PathVariable int cabId) throws EntityNotFoundException {
        if(cbService.checkCabId(cabId)){
            return cbService.getCab(cabId);
        }
        return null;
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
    public cab createNewCab(@RequestBody cab cb) throws EntityNotFoundException {
        if(cbService.checkCabId(cb.getCabId())){
            return null;
        }
        return cbService.addCar(cb);
    }

    @PutMapping("/update")
    public cab updateCab(@RequestBody cab cb){
        return cbService.updateCab(cb);
    }

    @DeleteMapping("delete/{cabId}")
    public String deleteCab(@PathVariable int cabId){
        if(cbService.checkCabId(cabId)){
            cbService.deleteCab(cabId);
            return "Deleted";
        }
        return "ID doesn't Exists!!!";
    }

}
