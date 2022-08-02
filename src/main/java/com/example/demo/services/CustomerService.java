package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Actor addActor(Actor actor){
        customerRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return customerRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  customerRepository.findById(id);
    }
    void delete(Integer id){
        customerRepository.deleteById(id);
    }
}
