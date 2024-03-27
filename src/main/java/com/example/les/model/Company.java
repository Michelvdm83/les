package com.example.les.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;
    @Setter
    private long amountEmployees;
    @OneToMany(mappedBy = "company")
    @JsonBackReference
    private Set<Employee> employees;

    Company(String name, long amountEmployees){
        this.name = name;
        this.amountEmployees = amountEmployees;
    }
}