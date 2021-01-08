package com.example.cabService.services;

import com.example.cabService.entity.ride;

import java.util.List;

public interface rideService {

    public ride addRide(ride rd);

    public ride updateStatus(ride rd);

    public String deleteRide(Integer rideId);

    public List<ride> getgAllRides();

    public boolean checkRideId(int rideId);

}
