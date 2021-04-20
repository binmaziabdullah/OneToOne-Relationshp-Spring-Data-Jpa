package com.entityrelationship.onetoonerelationshipInSpringdatajp.controller;

import com.entityrelationship.onetoonerelationshipInSpringdatajp.entity.Movies;
import com.entityrelationship.onetoonerelationshipInSpringdatajp.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    private final MoviesService moviesService;

    public MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("/getMovies")
    public List<Movies> getAllMovies(){
        return moviesService.getAllMovies();
    }

    @PostMapping("/addMovies")
    public String saveMovies(@RequestBody Movies movies){
        moviesService.addMovies(movies);
        return "Movies Added!";
    }

    @DeleteMapping("/deleteMovies/{movieId}")
    public String deleteMovies(@PathVariable Long movieId){
        moviesService.deleteMoviesById(movieId);
        return " Movies deleted successfully!";
    }

    @PutMapping("/updateMovies")
    public String updateMovies(@RequestBody Movies movies){
        moviesService.updateMovies(movies);
        return "Movies Updated!";
    }

}

