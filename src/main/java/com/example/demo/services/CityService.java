package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public Actor addActor(Actor actor){
       cityRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return cityRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  cityRepository.findById(id);
    }
    void delete(Integer id){
        cityRepository.deleteById(id);
    }
}
