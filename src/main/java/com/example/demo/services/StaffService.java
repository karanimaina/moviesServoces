package com.example.demo.services;

import com.example.demo.model.Actor;
import com.example.demo.repostory.ActorRepository;
import com.example.demo.repostory.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;

    public Actor addActor(Actor actor){
        staffRepository.save(actor);
        return actor;
    }
    public List<Actor>findAllActors(){
      return staffRepository.findAll();
    }
    public Optional<Actor> findById(Integer id){
     return  staffRepository.findById(id);
    }
    void delete(Integer id){
        staffRepository.deleteById(id);
    }
}
