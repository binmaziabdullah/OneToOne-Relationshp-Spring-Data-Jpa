package com.entityrelationship.onetoonerelationshipinspringdatajpa.repository;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
