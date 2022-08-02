package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.FilmActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmActorService {
    @Autowired
    FilmActorRepository filmActorRepository;

    public Actor addActor(Actor actor){
       filmActorRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return filmActorRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  filmActorRepository.findById(id);
    }
    void delete(Integer id){
        filmActorRepository.deleteById(id);
    }
}
