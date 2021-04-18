package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
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
    @JsonManagedReference
    private Employee employee;
}
