package com.movie.library.movie.library.model.movies;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.movie.library.movie.library.model.movies.rating.Rating;
import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies")
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

    @Column(name = "date")
    private ZonedDateTime date;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "rating_id")
    private Rating rating;


}