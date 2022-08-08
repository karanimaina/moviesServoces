package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter @Setter @Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String firstName;
    private  String lastName;
    @CreationTimestamp
    private Timestamp lastUpdate;
}
