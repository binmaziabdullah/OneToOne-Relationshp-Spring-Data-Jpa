package com.entityrelationship.onetoonerelationshipInSpringdatajp.repository;

import com.entityrelationship.onetoonerelationshipInSpringdatajp.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {
}
