package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Heroes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long heroId;
    private String heroName;
    private Integer heroSalary;

    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.EAGER)
    @JoinTable(name = "heroesMovie",
            joinColumns = @JoinColumn(name = "heroId"),
            inverseJoinColumns = @JoinColumn(name = "movieId"))
    private Set<Movies> movies;

}
