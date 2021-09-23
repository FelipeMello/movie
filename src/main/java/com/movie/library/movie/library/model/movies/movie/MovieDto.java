package com.movie.library.movie.library.model.movies.movie;

import java.io.Serializable;
import java.time.ZonedDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDto implements Serializable {
  private Long id;
  public String name;
  public String type;
  private String summary;
  private ZonedDateTime date;
}
