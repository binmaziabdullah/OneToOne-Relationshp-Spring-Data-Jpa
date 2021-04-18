package com.entityrelationship.onetoonerelationshipinspringdatajpa.controller;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Employee;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/getEmployee")
    public List<Employee> findAllEmployee(){
      return employeeService.findALlEmployee();
    }


    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Employee Added!";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
         int i = employeeService.deleteStudentById(id);
        return i+" "+"Employee Deleted";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return "Employee Updated!";
    }

}
