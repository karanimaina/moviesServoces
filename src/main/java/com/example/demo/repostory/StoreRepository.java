package com.example.demo.repostory;

import com.example.demo.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Actor, Integer>{
}
