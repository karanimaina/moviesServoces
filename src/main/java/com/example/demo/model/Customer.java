package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Entity
@Getter @Setter
@RequiredArgsConstructor
@NoArgsConstructor
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
private Timestamp createDate;
private Timestamp lastUpdate;
}
