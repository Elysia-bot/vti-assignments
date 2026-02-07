package com.example.Demo.demo.service;

import com.example.Demo.demo.entity.Position;
import com.example.Demo.demo.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    @Autowired
    private IPositionRepository positionRepository;

    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }

    public void deletePosition(Integer id) {
        positionRepository.deleteById(id);
    }
}
