package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Table
@Entity
@Getter @Setter
@RequiredArgsConstructor
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@ManyToOne(fetch = FetchType.LAZY)
private  Address address;
private int addressColumn;
private String firstName;
private String lastName;
private String email;
private LocalDate createDate;
@CreationTimestamp
private Timestamp lastUpdate;
}
