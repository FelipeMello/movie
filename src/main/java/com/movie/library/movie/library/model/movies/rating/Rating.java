package com.movie.library.movie.library.model.movies.rating;

import com.movie.library.movie.library.model.movies.Movie;
import java.io.Serializable;
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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "rating")
public class Rating implements Serializable {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JoinColumn(name="movie_id")
  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy ="rating" )
  private Movie movie_id;

  @Column(name="thumbs_up")
  private Long thumbsUp;

  @Column(name="thumbs_down")
  private Long thumbsDown;

}
