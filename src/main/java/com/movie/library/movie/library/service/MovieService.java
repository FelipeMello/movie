package com.movie.library.movie.library.service;

import com.movie.library.movie.library.model.movies.movie.Movie;
import com.movie.library.movie.library.repository.MovieRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieService {

  MovieRepository movieRepository;

  public List<Movie> getAll(){
    return movieRepository.findAll();
  }

  public List<Movie> updateMovies(List<Movie> movies){
    //TODO BUGFIX it's replacing instead of updating.
    return movieRepository.saveAll(movies);
  }

  public void createMovie(List<Movie> movies){
    movieRepository.saveAll(movies);
  }

  public boolean validateMovies(List<Movie> movies){



    return true;
  };

//  public boolean validateMovie(Movie movie){
//    if(movie.getId().is)
//
//    return true;
//  }


  public void deleteById(Long id) {
    movieRepository.deleteById(id);
  }

}
