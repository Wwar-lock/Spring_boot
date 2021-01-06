package com.example.cabService.services;

import com.example.cabService.dao.driverdao;
import com.example.cabService.entity.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class driverImpl implements driverService{
    ArrayList<driver>Drivers;

    @Autowired
    private driverdao drvdao;

    public driverImpl() {
//        Drivers = new ArrayList<>();
//        Drivers.add(new driver(1,"Ramesh",10,5));
//        Drivers.add(new driver(2,"Mohan",5,15));
//        Drivers.add(new driver(3,"Suresh",8,8));
    }

    @Override
    public driver updateDriver(driver dr) {
//        for(int i=0;i<Drivers.size();i++){
//            if(Drivers.get(i).getDriverId()==dr.getDriverId()){
//                Drivers.get(i).setExp(dr.getExp());
//                Drivers.get(i).setName(dr.getName());
//                Drivers.get(i).setRating(dr.getRating());
//                break;
//            }
//        }
        drvdao.save(dr);
        return dr;
    }

    @Override
    public List<driver> getAllDrivers() {
//        return Drivers;
        return drvdao.findAll();
    }

    @Override
    public driver addDriver(driver dr) {
//        Drivers.add(dr);
        drvdao.save((dr));
        return dr;

    }
}
