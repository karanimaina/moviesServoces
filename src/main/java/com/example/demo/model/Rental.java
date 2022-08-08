package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Getter @Setter
@RequiredArgsConstructor
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
    @CreationTimestamp
    private LocalDate rentalDate;
    @CreationTimestamp
    private LocalDate returnDate;
    @CreationTimestamp
    private LocalDate lastUpdate;
}
