package com.example.Demo.demo.common;

import com.example.Demo.demo.entity.TypeQuestion;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TypeQuestionTypeNameConverter implements
        AttributeConverter<TypeName,String> {
    @Override
    public String convertToDatabaseColumn(TypeName typeName){
        return typeName.getTypeName();
    }

    @Override
    public TypeName convertToEntityAttribute(String sqlTypeName){
        return TypeName.toEnum(sqlTypeName);
    }
}
