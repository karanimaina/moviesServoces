package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Table
@Setter
@Getter
@Entity
@RequiredArgsConstructor
public class City {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
    private String city;
    @CreationTimestamp
    private Timestamp lastUpdate;
}