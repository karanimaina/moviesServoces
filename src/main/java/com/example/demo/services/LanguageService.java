package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {
    @Autowired
    LanguageRepository languageRepository;

    public Actor addActor(Actor actor){
        languageRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return languageRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  languageRepository.findById(id);
    }
    void delete(Integer id){
        languageRepository.deleteById(id);
    }
}
