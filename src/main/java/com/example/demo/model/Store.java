package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table
//@Getter
//@Setter
//Data annotation contains ToString, Getter, Setter, EqualsAndHashCode and RequiredArgsConstructor.
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    private  Address address;
    private Timestamp lastUpdate;
}
