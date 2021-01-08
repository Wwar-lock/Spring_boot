package com.example.cabService.services;

import com.example.cabService.entity.cab;
import com.example.cabService.exception.EntityNotFoundException;

import java.util.*;



public interface cabService {
    public cab getCab(int cabId);

    public List<cab> getAllCabs();

    public cab addCar(cab cb) ;

    public cab updateCab(cab cb);

    public void deleteCab(int cabId);

    boolean checkCabId(int cabId);
}
