package com.entityrelationship.onetoonerelationshipinspringdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    private String movieName;
    private Integer releaseDate;
    private String movieRating;

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinTable(name = "heroesMovie",
            joinColumns = @JoinColumn(name = "movieId" ),
            inverseJoinColumns = @JoinColumn(name = "heroId"), uniqueConstraints = @UniqueConstraint(columnNames = {
            "movieId", "heroId" }))
    private Set<Heroes> heroes;


}
