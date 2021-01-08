package com.example.cabService.dao;

import com.example.cabService.entity.ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ridedao extends JpaRepository<ride,Integer> {
}
