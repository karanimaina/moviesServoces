package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Entity
@Data
@NoArgsConstructor
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO,generator = "customer_generator")
private int id;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "address_id")
private  Address address;
private int addressColumn;
private String firstName;
private String lastName;
private String email;
private Timestamp createDate;
private Timestamp lastUpdate;
}
