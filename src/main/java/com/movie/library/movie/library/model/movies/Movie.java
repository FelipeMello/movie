package com.movie.library.movie.library.model.movies;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies", schema="movies")
@Getter
@Setter
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR")
    private String name;

    @Column(name = "type", columnDefinition = "VARCHAR")
    private String type;

    @Column(name = "summary",columnDefinition = "VARCHAR")
    private String summary;

    @Column(name = "year", columnDefinition = "VARCHAR")
    private int year;
}