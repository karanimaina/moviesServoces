package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Data
@NoArgsConstructor
@Entity
public class City {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "city_generator")
    private int id;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "country_id")
  private Country country;
    private String city;
    private Timestamp lastUpdate;
}