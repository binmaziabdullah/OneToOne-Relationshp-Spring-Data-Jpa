package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    private String carName;
    private String carModel;
    private Integer modelYear;

    @OneToMany(mappedBy = "cars", fetch = FetchType.LAZY)
    private List<Features> features;

}
