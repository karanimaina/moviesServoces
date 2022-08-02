package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.FilmCategoryRepository;
import com.example.demo.repostory.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;

    public Actor addActor(Actor actor){
       filmRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return filmRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return filmRepository.findById(id);
    }
    void delete(Integer id){
        filmRepository.deleteById(id);
    }
}
