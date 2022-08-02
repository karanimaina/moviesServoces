package com.example.demo.repostory;

import com.example.demo.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Actor, Integer>{
}
