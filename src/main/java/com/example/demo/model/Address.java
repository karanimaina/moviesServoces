package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table
@Data
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "address_generator")
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn (name = "city_id")
    private City city;
    private String address;
    private String address2;
    private int district;
    private int postalCode;
    private int phone;
    private Timestamp lastUpdate;
}
