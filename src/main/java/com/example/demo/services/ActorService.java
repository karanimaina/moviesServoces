package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {
    @Autowired
    ActorRepository actorRepository;

    public Actor addActor(Actor actor){
        actorRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return actorRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  actorRepository.findById(id);
    }
    void delete(Integer id){
        actorRepository.deleteById(id);
    }
}
