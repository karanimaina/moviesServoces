package com.example.demo.repostory;

import com.example.demo.model.Actor;
import com.example.demo.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer>{
}
