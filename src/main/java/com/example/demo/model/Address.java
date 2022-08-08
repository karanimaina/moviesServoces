package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
@RequiredArgsConstructor
@Setter
@Getter

public class Address {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private City city;
    private String address;
    private String address2;
    private int district;
    private int postalCode;
    private int phone;
    @CreationTimestamp
    private Timestamp lastUpdate;
}
