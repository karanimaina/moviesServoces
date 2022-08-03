package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table
@Getter @Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
  @ManyToOne(fetch = FetchType.LAZY)
  private Staff staff;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)

    private Inventory inventory;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Customer customer;
    private Timestamp rentalDate;
    private Timestamp returnDate;
    private Timestamp lastUpdate;
}
