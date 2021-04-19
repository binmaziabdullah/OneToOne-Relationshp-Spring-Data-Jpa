package com.entityrelationship.onetoonerelationshipinspringdatajpa.controller;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Features;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.services.FeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeaturesController {

    @Autowired
    private final FeaturesService featuresService;

    public FeaturesController(FeaturesService featuresService) {
        this.featuresService = featuresService;
    }
    @GetMapping("/getFeatures")
    public List<Features> findAllFeatures(){
      return featuresService.findALlFeatures();
    }


    @PostMapping("/addFeatures")
    public String addEmployee(@RequestBody Features features){
        featuresService.addFeatures(features);
        return "Features Added!";
    }

    @DeleteMapping("/deleteFeatures/{id}")
    public String deleteFeaturesById(@PathVariable Long id){
         int i = featuresService.deleteFeaturesById(id);
        return i+" "+"Features Deleted";
    }

    @PutMapping("/updateFeatures")
    public String updateFeatures(@RequestBody Features features){
        featuresService.updateFeatures(features);
        return "Features Updated!";
    }

}
