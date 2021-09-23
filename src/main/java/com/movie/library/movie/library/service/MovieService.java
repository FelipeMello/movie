package com.movie.library.movie.library.service;

import com.movie.library.movie.library.model.movies.movie.Movie;
import com.movie.library.movie.library.model.movies.movie.MovieDto;
import com.movie.library.movie.library.repository.MovieRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieService {

  MovieRepository movieRepository;

  public List<Movie> getAll() {
    return movieRepository.findAll();
  }

  public Movie updateMovie(MovieDto movieDto) {

    Movie movie = movieRepository.getById(movieDto.getId());

    movie = updateMovieField(movie, movieDto);

    return movieRepository.save(movie);
  }

  /**
   * TODO find a better way to do this using mapper or something else.
   *
   * @param movie
   * @param movieDto
   * @return
   */
  public Movie updateMovieField(Movie movie, MovieDto movieDto) {

    if (null != movieDto.getName() || !movieDto.getName().isEmpty()) {
      movie.setName(movieDto.getName());
    }
    if (null != movieDto.getSummary() || !movieDto.getSummary().isEmpty()) {
      movie.setSummary(movieDto.getSummary());
    }
    if (null != movieDto.getType() || !movieDto.getType().isEmpty()) {
      movie.setType(movieDto.getType());
    }
    if (null != movieDto.getDate()) {
      movie.setDate(movieDto.getDate());
    }
    return movie;
  }


  public void createMovie(List<Movie> movies) {
    movieRepository.saveAll(movies);
  }

  public boolean validateMovies(List<Movie> movies) {
    return true;
  }


  public void deleteById(Long id) {
    movieRepository.deleteById(id);
  }

}
