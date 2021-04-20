package com.entityrelationship.onetoonerelationshipInSpringdatajp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    private String movieName;
    private String releaseDate;
    private String movieRating;

    @ManyToMany(mappedBy = "movies",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Set<Heroes> heroes;


}
