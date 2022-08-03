package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Entity
@Getter @Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Timestamp last_update;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Film film;
}
