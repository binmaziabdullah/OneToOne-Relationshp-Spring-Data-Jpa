package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private String brandName;
    private String modelName;
    private Integer modelYear;

    @OneToMany(mappedBy = "cars", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Features> features;

}
