package com.example.cabService.services;

import com.example.cabService.dao.cabdao;
import com.example.cabService.entity.cab;
import com.example.cabService.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class cabServiceImpl implements cabService{
    @Autowired
    private cabdao cbD;

    @Override
    public cab getCab(int cabId) {
        return cbD.getOne(cabId);
    }

    @Override
    public List<cab> getAllCabs() {
        return cbD.findAll();
    }

    @Override
    public cab addCar(cab cb) {
        return cbD.save(cb);
    }

    @Override
    public cab updateCab(cab cb) {
        cbD.save(cb);
        return cb;
    }

    @Override
    public void deleteCab(int cabId) {
        cbD.deleteById(cabId);
    }

    @Override
    public boolean checkCabId(int cabId) {
        return false;
    }
}

