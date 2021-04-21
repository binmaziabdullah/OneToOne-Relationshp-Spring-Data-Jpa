package com.entityrelationship.onetoonerelationshipinspringdatajpa.controller;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Heroes;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.services.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeroesController {

    @Autowired
    private final HeroesService heroesService;

    public HeroesController(HeroesService heroesService) {
        this.heroesService = heroesService;
    }
    @GetMapping("/getHeroes")
    public List<Heroes> findAllEmployee(){
      return heroesService.findALlHeroes();
    }


    @PostMapping("/addHeroes")
    public String addEmployee(@RequestBody Heroes heroes){
        heroesService.addHeroes(heroes);
        return "Heroes Added!";
    }

    @DeleteMapping("/deleteHeroes/{heroId}")
    public String deleteEmployeeById(@PathVariable Long heroId){
         int i = heroesService.deleteHeroesById(heroId);
        return i+" "+"Heroes Deleted";
    }

    @PutMapping("/updateHeroes")
    public String updateEmployee(@RequestBody Heroes heroes){
        heroesService.updateHeroes(heroes);
        return "Heroes Updated!";
    }

}
