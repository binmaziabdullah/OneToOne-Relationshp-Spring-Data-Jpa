package com.entityrelationship.onetoonerelationshipinspringdatajpa.services;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Movies;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    private final MoviesRepository moviesRepository;

    public MoviesService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    /*read Movies*/
    public List<Movies> getAllMovies(){
       return moviesRepository.findAll();
    }

    /*Save Movies*/
    public void addMovies(Movies movies){
        moviesRepository.save(movies);
    }

    /*Delete Movies*/
    public void deleteMoviesById(Long movieId){
       moviesRepository.deleteById(movieId);
    }

    /*update Movies*/
    public  void updateMovies(Movies movies){
        moviesRepository.save(movies);
    }
}
