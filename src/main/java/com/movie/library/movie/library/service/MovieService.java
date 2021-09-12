package com.movie.library.movie.library.service;

import com.movie.library.movie.library.model.movies.Movie;
import com.movie.library.movie.library.model.movies.MovieData;
import com.movie.library.movie.library.model.movies.MovieType;
import com.movie.library.movie.library.repository.MovieRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  MovieRepository movieRepository;

  public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }
//
//  public List<Movie> getMovieByType(String type){
//    return movieRepository.findB
//  }

  public List<Movie> getAll(){
    return movieRepository.findAll();
  }

  public List<Movie> updateMovies(List<Movie> movies){
    //BUGFIX it's replacing instead of updating.
    return movieRepository.saveAll(movies);
  }

  public void createMovie(List<Movie> movie){
    movieRepository.saveAll(movie);
  }


}
