package com.example.les.controller;

import com.example.les.model.Company;
import com.example.les.model.Employee;
import com.example.les.repository.CompanyRepository;
import com.example.les.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/findall")
    public Iterable<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/findbyname/{name}")
    public Iterable<Employee> findByName(@PathVariable(name = "name") String name){
        return employeeRepository.findByNameIgnoringCase(name);
    }

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PatchMapping("/addcompany/{com}/{em}")
    public Employee addCompany(@PathVariable("com") Long com, @PathVariable("em") Long em){
        Company company = companyRepository.findById(com).get();
        Employee employee = employeeRepository.findById(em).get();
        employee.setCompany(company);
        return employeeRepository.save(employee);
    }
}