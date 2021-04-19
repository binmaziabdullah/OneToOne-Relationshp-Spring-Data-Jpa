package com.entityrelationship.onetoonerelationshipinspringdatajpa.services;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Car;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    /*read Cars*/
    public List<Car> getAllCars(){
       return carRepository.findAll();
    }

    /*Save Cars*/
    public void addCars(Car car){
        carRepository.save(car);
    }

    /*Delete Cars*/
    public void deleteCarsById(Long id){
       carRepository.deleteById(id);
    }

    /*update Cars*/
    public  void updateCars(Car car){
        carRepository.save(car);
    }
}
