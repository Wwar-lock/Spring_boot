package com.example.cabService.services;

import com.example.cabService.entity.driver;
import com.example.cabService.exception.DriverAlreadyAdded;
import com.example.cabService.status.driverStatus;


import java.util.ArrayList;
import java.util.List;

public interface driverService {
    driver updateDriver(driver dr);
    List<driver> getAllDrivers();
    driver addDriver(driver dr) throws DriverAlreadyAdded;
    boolean checkDriverId(int driverId);
}
