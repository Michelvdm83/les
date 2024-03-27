package com.example.les.repository;

import com.example.les.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Iterable<Employee> findByNameIgnoringCase(String name);
}
