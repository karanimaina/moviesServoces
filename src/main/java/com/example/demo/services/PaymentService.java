package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Actor addActor(Actor actor){
       paymentRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return paymentRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  paymentRepository.findById(id);
    }
    void delete(Integer id){
        paymentRepository.deleteById(id);
    }
}
