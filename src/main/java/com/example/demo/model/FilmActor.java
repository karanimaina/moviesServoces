package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Table
@Getter
@Setter
@Entity
@RequiredArgsConstructor
public class FilmActor {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private int film_id;
   @ManyToOne(fetch = FetchType.LAZY,optional = false)
   private Actor actor;
   @CreationTimestamp
   private Timestamp lastUpdate;
}
