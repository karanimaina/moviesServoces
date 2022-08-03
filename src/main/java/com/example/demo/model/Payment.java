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
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Rental rental;
    private  int customerId;
    private int staffId;
    private int amount;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Customer customer;
    private Timestamp paymentDate;
}
