package com.movie.library.movie.library.controller;

import com.movie.library.movie.library.model.movies.Movie;
import com.movie.library.movie.library.service.MovieService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    public List<Movie> getAllMovies() {
        return movieService.getAll();
    }

    @PostMapping()
    public ResponseEntity<?> createMovies(@RequestBody List<Movie> movieData) {
        movieService.createMovie(movieData);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @PutMapping()
    public ResponseEntity<List<Movie>> updateMovies(@RequestBody List<Movie> movieData){
        List<Movie> movies = movieService.updateMovies(movieData);
        return new ResponseEntity(movies, HttpStatus.ACCEPTED);
    }



    @DeleteMapping
    public ResponseEntity<?> deleteMovie(@RequestParam Long id){
        movieService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //TODO create controller for thumbs up and thumbs down.
}
