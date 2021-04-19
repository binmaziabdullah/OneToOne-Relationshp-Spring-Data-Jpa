package com.entityrelationship.onetoonerelationshipinspringdatajpa.controller;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Car;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getCars")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping("/addCars")
    public String saveCars(@RequestBody Car car){
        carService.addCars(car);
        return "Car Added!";
    }

    @DeleteMapping("/deleteCars/{id}")
    public String deleteCars(@PathVariable Long id){
        carService.deleteCarsById(id);
        return " Car deleted successfully!";
    }

    @PutMapping("/updateCars")
    public String updateCars(@RequestBody Car car){
        carService.updateCars(car);
        return "car Updated!";
    }

}

