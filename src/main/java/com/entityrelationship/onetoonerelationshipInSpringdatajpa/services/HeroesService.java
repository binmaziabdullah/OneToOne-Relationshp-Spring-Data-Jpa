package com.entityrelationship.onetoonerelationshipInSpringdatajp.services;

import com.entityrelationship.onetoonerelationshipInSpringdatajp.entity.Heroes;
import com.entityrelationship.onetoonerelationshipInSpringdatajp.repository.HeroesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HeroesService {

    @Autowired
    private final HeroesRepository heroesRepository;

    public HeroesService(HeroesRepository heroesRepository) {
        this.heroesRepository = heroesRepository;
    }

    /*read Heroes*/
    public List<Heroes> findALlHeroes() {
        return heroesRepository.findAll();
    }

    /*Save Heroes*/
    public void addHeroes(Heroes heroes) {
        heroesRepository.save(heroes);
    }

    /*delete Heroes*/
    public int deleteHeroesById(Long heroId) {
        return heroesRepository.deleteHeroesByHeroesId(heroId);
    }

    /*update Heroes*/
    public void updateHeroes(Heroes heroes) {
        heroesRepository.save(heroes);
    }
}
