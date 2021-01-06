package com.example.cabService.dao;

import com.example.cabService.entity.ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface rideDao extends JpaRepository<ride,Integer> {
}
