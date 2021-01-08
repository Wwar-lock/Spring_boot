package com.example.cabService.services;

import com.example.cabService.dao.driverdao;
import com.example.cabService.dao.ridedao;
import com.example.cabService.entity.driver;
import com.example.cabService.entity.ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rideServiceImpl implements rideService{
    @Autowired
    private ridedao rdd;

    @Override
    public ride addRide(ride rd) {
        rdd.save(rd);
        return rd;
    }

    @Override
    public ride updateStatus(ride rd) {
        rdd.save(rd);
        return rd;
    }

    @Override
    public String deleteRide(Integer rideId) {
        rdd.deleteById(rideId);
        return "Deleted";
    }

    @Override
    public List<ride> getgAllRides() {
        return rdd.findAll();
    }

    @Override
    public boolean checkRideId(int rideId) {
        return false;
    }
}
