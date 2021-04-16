package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dep_Name;

    @OneToOne(mappedBy = "department", fetch = FetchType.LAZY)
    private Employee employee;
}
