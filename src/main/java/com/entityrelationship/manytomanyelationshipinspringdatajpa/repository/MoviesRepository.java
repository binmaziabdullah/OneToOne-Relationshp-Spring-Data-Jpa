package com.entityrelationship.manytomanyelationshipinspringdatajpa.repository;

import com.entityrelationship.manytomanyelationshipinspringdatajpa.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {
}
