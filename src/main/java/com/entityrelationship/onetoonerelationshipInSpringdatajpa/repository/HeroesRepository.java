package com.entityrelationship.onetoonerelationshipInSpringdatajp.repository;

import com.entityrelationship.onetoonerelationshipInSpringdatajp.entity.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface HeroesRepository extends JpaRepository<Heroes, Long> {

    @Modifying
    @Query("delete from Heroes h where h.heroId = :heroId")
    int deleteHeroesByHeroesId(@Param("heroId") Long heroId);

}
