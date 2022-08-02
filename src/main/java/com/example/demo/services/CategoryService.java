package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Actor addActor(Actor actor){
        categoryRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return categoryRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  categoryRepository.findById(id);
    }
    void delete(Integer id){
        categoryRepository.deleteById(id);
    }
}