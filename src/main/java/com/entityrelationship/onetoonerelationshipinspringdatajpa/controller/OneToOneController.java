package com.entityrelationship.onetoonerelationshipinspringdatajpa.controller;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Department;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Employee;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.services.DepartmentService;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OneToOneController {

    @Autowired
    private final EmployeeService employeeService;

    @Autowired
    private final DepartmentService departmentService;

    public OneToOneController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }
    @GetMapping("/getEmployee")
    public List<Employee> findAllEmployee(){
      return employeeService.findALlEmployee();
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Employee Added";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        int i = employeeService.deleteStudentById(id);
        return i+" "+"Employee Deleted";
    }

    /*------------------------Department-------------------------*/

}
