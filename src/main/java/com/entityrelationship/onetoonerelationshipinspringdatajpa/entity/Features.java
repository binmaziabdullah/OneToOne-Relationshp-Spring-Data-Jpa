package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Features {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String featureOne;
    private String featureTwo;
    private String featureThree;
    private String featureFour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carId", referencedColumnName = "carId")
    @JsonBackReference
    private Car cars;



}
