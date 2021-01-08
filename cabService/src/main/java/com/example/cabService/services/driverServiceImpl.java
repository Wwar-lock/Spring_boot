package com.example.cabService.services;

import com.example.cabService.dao.driverdao;
import com.example.cabService.entity.driver;
import com.example.cabService.exception.DriverAlreadyAdded;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class driverServiceImpl implements driverService{

    @Autowired
    private driverdao driverRepo;

    @Override
    public driver updateDriver(driver dr) {
        driverRepo.save(dr);
        return dr;
    }

    @Override
    public List<driver> getAllDrivers() {
        return driverRepo.findAll();
    }

    @Override
    public driver addDriver(driver dr) {
        driverRepo.save(dr);
        return dr;
    }

    @Override
    public boolean checkDriverId(int driverId) {
        return false;
    }
}
