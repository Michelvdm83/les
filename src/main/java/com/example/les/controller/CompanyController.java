package com.example.les.controller;

import com.example.les.model.Company;
import com.example.les.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/findall")
    public Iterable<Company> findAll(){
        return companyRepository.findAll();
    }

    @PostMapping("/create")
    public Company create(@RequestBody Company company){
        return companyRepository.save(company);
    }
}
