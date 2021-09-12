package com.movie.library.movie.library.model.movies;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponse implements Serializable {

  public String name;
  public String type;
  private String summary;
  private int year;

}
