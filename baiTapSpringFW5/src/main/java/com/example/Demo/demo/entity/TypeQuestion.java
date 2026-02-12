package com.example.Demo.demo.entity;

import com.example.Demo.demo.common.TypeName;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TypeQuestion")
public class TypeQuestion implements Serializable {
    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type_name")
    @Enumerated(EnumType.ORDINAL)
    private TypeName typeName;

    public TypeQuestion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }
}
