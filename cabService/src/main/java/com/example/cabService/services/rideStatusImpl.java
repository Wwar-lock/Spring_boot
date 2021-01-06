package com.example.cabService.services;

import com.example.cabService.dao.rideDao;
import com.example.cabService.entity.ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rideStatusImpl implements rideStatus {

    @Autowired
    private rideDao rdD;

    @Override
    public ride addRide(ride rd) {
        rdD.save(rd);
        return rd;
    }

    @Override
    public ride updateStatus(ride rd) {
//        used toggle option either
        rdD.save(rd);
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
