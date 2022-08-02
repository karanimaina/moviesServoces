package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Getter
@Setter
@NoArgsConstructor
@Entity
public class FilmActor {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private int film_id;
   @ManyToOne(fetch = FetchType.LAZY,optional = false)
   private Actor actor;
    private Timestamp last_update;
}
