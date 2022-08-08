package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
@Getter @Setter
@RequiredArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Rental rental;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Staff staff;
    private int amount;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Customer customer;
    @CreationTimestamp
    private Timestamp lastUpdate;
}
