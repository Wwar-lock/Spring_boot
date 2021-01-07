package com.example.cabService.services;

import com.example.cabService.dao.driverdao;
import com.example.cabService.dao.rideDao;
import com.example.cabService.entity.driver;
import com.example.cabService.entity.ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class rideStatusImpl implements rideStatus {

    @Autowired
    private rideDao rdD;
    @Autowired
    private driverdao drvd;

    @Override
    public ride addRide(ride rd) {
        rdD.save(rd);
        driver tmp_dr = drvd.getOne(rd.getCabId());
        tmp_dr.setCurrentRideStatus(!tmp_dr.getCurrentRideStatus());
        drvd.save(tmp_dr);
        return rd;
    }

    @Override
    public ride updateStatus(ride rd) {
//        used toggle option either
//        rdD.save(rd);
        ride tmp_ride = rdD.getOne(rd.getRideId());
        tmp_ride.setCurrentRideStatus(!tmp_ride.getCurrentRideStatus());
        rdD.save(tmp_ride);
        return rd;

    }

    @Override
    public String deleteRide(Integer rideId) {
        rdD.delete(rdD.getOne(rideId));
        return "Deleted";
    }

    @Override
    public List<ride> getgAllRides() {
        return rdD.findAll();
    }
}
