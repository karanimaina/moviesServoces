package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    @Autowired
    StoreRepository storeRepository;

    public Actor addActor(Actor actor){
       storeRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return storeRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  storeRepository.findById(id);
    }
    void delete(Integer id){
        storeRepository.deleteById(id);
    }
}
