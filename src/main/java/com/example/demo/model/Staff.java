package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Getter @Setter
@RequiredArgsConstructor
@Entity
public class Staff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Address address;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Store store;
    private String firstName;
    private String lastName;
    private String email;
    private String active;
    private String userName;
    private String password;
    @CreationTimestamp
    private Timestamp lastUpdate;
    private String pictureUrl;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Payment payment;

}
