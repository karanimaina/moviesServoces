package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter @Setter
@RequiredArgsConstructor
@Table
public class FilmCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Film film;
    @CreationTimestamp
    private Timestamp lastUpdate;
}
