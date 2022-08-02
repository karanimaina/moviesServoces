package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public Actor addActor(Actor actor){
       countryRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return countryRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  countryRepository.findById(id);
    }
    void delete(Integer id){
        countryRepository.deleteById(id);
    }
}
