package com.example.cabService.services;

import com.example.cabService.dao.cabDao;
import com.example.cabService.entity.cab;
import com.example.cabService.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class cabServiceImpl implements cabService{
    List<cab>Cabs;

    @Autowired
    private cabDao cbD;

    public cabServiceImpl() {
//        Cabs = new ArrayList<cab>();
//        Cabs.add(new cab(1,10,4,"good"));
//        Cabs.add(new cab(2,8,8,"okok"));
//        Cabs.add(new cab(3,4,6,"bad"));
//        System.out.println(Cabs.size());
    }

    @Override
    public cab getCab(int cabId){
//        cab ansCab = null;
//        for(int i=0;i<Cabs.size();i++){
//            if(Cabs.get(i).getCabId() == cabId){
//                ansCab = Cabs.get(i);
//                break;
//            }
//        }
//        return ansCab;
        return cbD.getOne(cabId);
    }

    @Override
    public List<cab> getAllCabs() {
//        return Cabs;
        return cbD.findAll();
    }

    @Override
    public cab addCar(cab cb) {
//        Cabs.add(cb);
        cbD.save(cb);
        return cb;

    }

    @Override
    public cab updateCab(cab cb) {
//        for(int i=0;i<Cabs.size();i++){
//            if(Cabs.get(i).getCabId() == cb.getCabId()){
//                Cabs.get(i).setCabRating(cb.getCabRating());
//                Cabs.get(i).setCabCondition(cb.getCabCondition());
//                Cabs.get(i).setCabSeatCount(cb.getCabSeatCount());
//                break;
//            }
//        }
        cbD.save(cb);
        return cb;
    }

    @Override
    public void deleteCab(int cabId) {
//        for(int i=0;i<Cabs.size();i++){
//            if(Cabs.get(i).getCabId()==cabId){
//                Cabs.remove(Cabs.get(i));
//                break;
//            }
//        }
        cab c = cbD.getOne(cabId);
        cbD.delete(c);
    }
}
