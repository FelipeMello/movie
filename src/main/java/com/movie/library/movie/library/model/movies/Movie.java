package com.movie.library.movie.library.model.movies;

import com.movie.library.movie.library.model.movies.rating.Rating;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies", schema = "movies")
@Getter
@Setter
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "name is mandatory")
    @Column(name = "name", columnDefinition = "VARCHAR")
    private String name;

    @NotBlank(message = "type is mandatory")
    @Column(name = "type", columnDefinition = "VARCHAR")
    private String type;

    @Column(name = "summary", columnDefinition = "VARCHAR")
    private String summary;

    @Column(name = "year", columnDefinition = "INT")
    private int year;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "rating_id")
    private Rating rating;


}