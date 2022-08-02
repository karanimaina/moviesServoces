package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class FilmCategory {
    @Id
    private int filmId;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "film_id")
    private Film film;
    private Timestamp last_update;
}
