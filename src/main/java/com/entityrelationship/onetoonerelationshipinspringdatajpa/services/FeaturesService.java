package com.entityrelationship.onetoonerelationshipinspringdatajpa.services;

import com.entityrelationship.onetoonerelationshipinspringdatajpa.entity.Features;
import com.entityrelationship.onetoonerelationshipinspringdatajpa.repository.FeaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FeaturesService {

    @Autowired
    private final FeaturesRepository featuresRepository;

    public FeaturesService(FeaturesRepository featuresRepository) {
        this.featuresRepository = featuresRepository;
    }

    /*read Features*/
    public List<Features> findALlFeatures() {
        return featuresRepository.findAll();
    }

    /*Save Features*/
    public void addFeatures(Features features) {
        featuresRepository.save(features);
    }

    /*delete Features*/
    public int deleteFeaturesById(Long id) {
        return featuresRepository.deleteFeaturesById(id);
    }

    /*update Features*/
    public void updateFeatures(Features features) {
        featuresRepository.save(features);
    }
}
