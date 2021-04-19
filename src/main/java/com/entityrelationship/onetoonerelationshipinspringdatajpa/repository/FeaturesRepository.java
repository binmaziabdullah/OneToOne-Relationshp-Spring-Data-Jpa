package com.entityrelationship.onetoonerelationshipinspringdatajpa.repository;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Features;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface FeaturesRepository extends JpaRepository<Features, Long> {

    @Modifying
    @Query("delete from Employee e where e.id = :id")
    int deleteEmployeeById(@Param("id") Long id);

}
