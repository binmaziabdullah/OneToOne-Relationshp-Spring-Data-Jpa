package com.entityrelationship.onetoonerelationshipinspringdatajpa.controller;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Department;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/getDepartment")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @PostMapping("/addDepartment")
    public String saveDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
        return "Department Added!";
    }

    @DeleteMapping("/deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartmentById(id);
        return " Department deleted successfully!";
    }

    @PutMapping("/updateDepartment")
    public String updateDepartment(@RequestBody Department department){
        departmentService.updateDepartment(department);
        return "Department Updated!";
    }

}

