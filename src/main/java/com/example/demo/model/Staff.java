package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Staff {
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "staff-generator")
    @Id
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "address_id")
    private Address address;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "store_id")
    private Store store;
    private String firstName;
    private String lastName;
    private String email;
    private String active;
    private String userName;
    private String password;
    private Timestamp lastUpdate;
    private String pictureUrl;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "payment_id")
    private Payment payment;

}
