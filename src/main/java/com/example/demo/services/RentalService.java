package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentalService {
    @Autowired
    RentalRepository rentalRepository;

    public Actor addActor(Actor actor){
rentalRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return rentalRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return rentalRepository.findById(id);
    }
    void delete(Integer id){
        rentalRepository.deleteById(id);
    }
}
