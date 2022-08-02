package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public Actor addActor(Actor actor){
        addressRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return addressRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  addressRepository.findById(id);
    }
    void delete(Integer id){
        addressRepository.deleteById(id);
    }
}
