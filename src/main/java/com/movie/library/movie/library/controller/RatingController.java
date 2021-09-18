package com.movie.library.movie.library.controller;

import com.movie.library.movie.library.model.movies.rating.Rating;
import com.movie.library.movie.library.service.RatingService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
  //TODO thumbsDown +1
}
