package com.entityrelationship.onetoonerelationshipinspringdatajpa.services;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Department;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    /*read departments*/
    public List<Department> getAllDepartment(){
       return departmentRepository.findAll();
    }

    /*Save Department*/
    public void addDepartment(Department department){
        departmentRepository.save(department);
    }

    /*Delete Department*/
    public void deleteDepartmentById(Long id){
       departmentRepository.deleteById(id);
    }

    /*update Department*/
    public  void updateDepartment(Department department){
        departmentRepository.save(department);
    }
}
