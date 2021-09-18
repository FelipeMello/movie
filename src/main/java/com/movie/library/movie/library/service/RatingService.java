package com.movie.library.movie.library.service;

import com.movie.library.movie.library.model.movies.rating.Rating;
import com.movie.library.movie.library.repository.RatingRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RatingService {

  RatingRepository ratingRepository;

  public List<Rating> createRatings(List<Rating> ratings) {
    return ratingRepository.saveAll(ratings);
  }

}
