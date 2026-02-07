package com.example.Demo.demo.controller;

import com.example.Demo.demo.entity.Position;
import com.example.Demo.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping
    public List<Position> getAllPositions() {
        return positionService.getAllPositions();
    }

    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable Integer id) {
        positionService.deletePosition(id);
    }
}

