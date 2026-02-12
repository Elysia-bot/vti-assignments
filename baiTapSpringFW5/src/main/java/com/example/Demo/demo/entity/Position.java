package com.example.Demo.demo.entity;

import com.example.Demo.demo.common.PositionName;
import jakarta.persistence.*;

@Entity
@Table(name = "Position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PositionID")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "PositionName", nullable = false, unique = true)
    private PositionName name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PositionName getName() {
        return name;
    }

    public void setName(PositionName name) {
        this.name = name;
    }
}
