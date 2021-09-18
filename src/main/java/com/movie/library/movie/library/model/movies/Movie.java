package com.movie.library.movie.library.model.movies;

import static com.movie.library.movie.library.utils.Constants.ZONED_DATE_TIME_FORMAT;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import com.movie.library.movie.library.model.movies.rating.Rating;
import com.movie.library.movie.library.utils.ZonedDateTimeDeserializer;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies", schema = "movies")
@Getter
@Setter
//@JsonFormat(pattern = ZONED_DATE_TIME_FORMAT)
//Specify the format you want: "yyyy-MM-dd'T'HH:mm:ss.SSS"
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
//    @JsonSerialize(using = ZonedDateTimeSerializer.class)
//    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    private ZonedDateTime date;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "rating_id")
    private Rating rating;


}