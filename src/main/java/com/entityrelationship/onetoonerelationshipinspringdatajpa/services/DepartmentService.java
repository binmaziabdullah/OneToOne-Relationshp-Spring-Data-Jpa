package com.entityrelationship.onetoonerelationshipinspringdatajpa.services;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Department;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    /*Save Department*/
    public void addDepartment(Department department){
        departmentRepository.save(department);
    }
}
