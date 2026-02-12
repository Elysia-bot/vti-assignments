package com.example.Demo.demo.controller;

import com.example.Demo.demo.entity.TypeQuestion;
import com.example.Demo.demo.service.TypeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/type-question")
public class TypeQuestionController {
    @Autowired
    private TypeQuestionService typeQuestionService;

    @GetMapping
    public List<TypeQuestion> getAll(){
        return typeQuestionService.getAll();
    }
}
