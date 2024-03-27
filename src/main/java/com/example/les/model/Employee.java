package com.example.les.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String name;
    @Setter
    private int age;

    @ManyToOne
    @Setter
    @JsonManagedReference
    private Company company;

    Employee(){}

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
}
