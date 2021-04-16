package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empName;
    private Integer empSalary;
    private String empDegree;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dep_id", referencedColumnName = "id", nullable = false)

    private Department department;

}