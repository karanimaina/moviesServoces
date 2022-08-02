package com.example.demo.repostory;

import com.example.demo.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmCategoryRepository extends JpaRepository<Actor, Integer>{
}
