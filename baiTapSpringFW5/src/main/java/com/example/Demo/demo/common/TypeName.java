package com.example.Demo.demo.common;

public enum TypeName {
    Essay("E"), MultipleChoice("M");

    private String typeName;

    private TypeName(String typeName){
        this.typeName = typeName;
    }
    public String getTypeName() {
        return typeName;
    }

    public static TypeName toEnum(String sqlTypeName){
        for (TypeName item : TypeName.values()){
            if(item.getTypeName().equals(sqlTypeName))
                return item;
        }
        return null;
    }

}
