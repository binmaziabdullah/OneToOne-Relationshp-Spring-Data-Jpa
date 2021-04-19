package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

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

    private String feature_One;
    private String feature_Two;
    private String feature_Three;
    private String feature_Four;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carId", referencedColumnName = "carId")
    private Car cars;



}
