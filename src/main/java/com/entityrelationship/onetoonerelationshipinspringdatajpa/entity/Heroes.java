package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

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

    @ManyToMany(mappedBy = "heroes",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Set<Movies> movies;

}
