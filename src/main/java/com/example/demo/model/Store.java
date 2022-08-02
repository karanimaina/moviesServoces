package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table
//@Getter
//@Setter
//Data annotation contains ToString, Getter, Setter, EqualsAndHashCode and RequiredArgsConstructor.
@Data
@NoArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator ="store_generator")
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private  Address address;
    private Timestamp lastUpdate;
}
