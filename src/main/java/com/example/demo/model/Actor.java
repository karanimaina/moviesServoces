package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
@Table
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String firstName;
    private  String lastName;
    private Timestamp lastUpdate;
}
