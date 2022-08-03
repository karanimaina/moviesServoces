package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Data
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
public class City {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  @ManyToOne(fetch = FetchType.LAZY)
  private Country country;
    private String city;
    private Timestamp lastUpdate;
}