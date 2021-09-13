package com.movie.library.movie.library.model.movies.rating;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "rating", schema = "movies")
public class Rating implements Serializable {

  @Id
  @Column(name = "id")
  private Long id;
  private Long movie_id;
  private Long thumbsUp;
  private Long thumbsDown;

}
