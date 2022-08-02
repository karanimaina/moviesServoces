package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "rental_generator")
    private  int id;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "staff_id")
  private Staff staff;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name ="inventory_id")
    private Inventory inventory;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name ="customer_id")
    private Customer customer;
    private Timestamp rentalDate;
    private Timestamp returnDate;
    private Timestamp lastUpdate;
}
