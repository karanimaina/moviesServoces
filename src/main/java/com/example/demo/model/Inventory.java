package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "inventory_generator")
    private int id;
    private Timestamp last_update;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "film_id")
    private Film film;
}
