package com.example.Demo.demo.repository;

import com.example.Demo.demo.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository
        extends JpaRepository<Position, Integer> {
}
