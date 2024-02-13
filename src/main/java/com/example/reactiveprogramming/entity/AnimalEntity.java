package com.example.reactiveprogramming.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "animals", schema = "reactive_db")
@Data
public class AnimalEntity {

    @Id
    private Long id;
    private String type;
    private Integer age;

}
