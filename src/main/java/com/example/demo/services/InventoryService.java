package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    public Actor addActor(Actor actor){
        inventoryRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return inventoryRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  inventoryRepository.findById(id);
    }
    void delete(Integer id){
        inventoryRepository.deleteById(id);
    }
}
