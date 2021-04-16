package com.entityrelationship.onetoonerelationshipinspringdatajpa.services;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Employee;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findALlEmployee(){
        return employeeRepository.findAll();
    }

    /*Save Employee*/
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    /*delete Employee*/
    public int deleteStudentById(Long id){
        return employeeRepository.deleteEmployeeById(id);
    }

}
