package com.movie.library.movie.library.controller;

import com.movie.library.movie.library.model.movies.rating.Rating;
import com.movie.library.movie.library.service.RatingService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/v1/rating")
@AllArgsConstructor
public class RatingController {

  RatingService ratingService;

  //TODO POST
  //TODO GET
  //TODO UPDATE
  //TODO DELETE
  //TODO thumbsUP +1

  @PostMapping()
  public ResponseEntity<List<Rating>> createRatings(@RequestBody List<Rating> ratings) {
    List<Rating> result = ratingService.createRatings(ratings);
    return new ResponseEntity(result, HttpStatus.CREATED);
  }

  @PutMapping()
  public ResponseEntity<List<Rating>> updateRatings(@RequestBody List<Rating> ratingData) {
    List<Rating> movies = ratingService.updateRatings(ratingData);
    return new ResponseEntity(movies, HttpStatus.ACCEPTED);
  }

  @DeleteMapping
  public ResponseEntity<?> deleteRating(@RequestParam Long id) {
    ratingService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
  }

  //TODO thumbsDown +1


}
