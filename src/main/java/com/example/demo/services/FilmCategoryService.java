package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.AddressRepository;
import com.example.demo.repostory.FilmCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmCategoryService {
    @Autowired
    FilmCategoryRepository filmCategoryRepository;

    public Actor addActor(Actor actor){
        filmCategoryRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return filmCategoryRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  filmCategoryRepository.findById(id);
    }
    void delete(Integer id){
        filmCategoryRepository.deleteById(id);
    }
}
