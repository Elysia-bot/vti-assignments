package com.example.Demo.demo.service;

import com.example.Demo.demo.common.TypeName;
import com.example.Demo.demo.entity.TypeQuestion;
import com.example.Demo.demo.repository.TypeQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TypeQuestionService {

    @Autowired
    private TypeQuestionRepository typeQuestionRepository;

    public List<TypeQuestion> getAll(){
        return typeQuestionRepository.findAll();
    }


}
