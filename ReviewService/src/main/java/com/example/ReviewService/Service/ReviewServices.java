package com.example.ReviewService.Service;

import com.example.ReviewService.Entity.Review;
import com.example.ReviewService.Repo.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ReviewServices {
    
    private final ReviewRepository reviewRepository;
    
    @Autowired
    private final RestTemplate restTemplate;

    public ReviewServices(ReviewRepository reviewRepository,  RestTemplate restTemplate) {
        this.reviewRepository = reviewRepository;
        this.restTemplate = restTemplate;
    }

    public Review addReview(Review review) {
        // Validate if Movie Exists
        String movieServiceUrl = "http://localhost:8082/movies/" + review.getMovieId();
        Boolean movieExists = restTemplate.getForObject(movieServiceUrl, Boolean.class);

        if (Boolean.TRUE.equals(movieExists)) {
            return reviewRepository.save(review);
        } else {
            throw new RuntimeException("Movie not found!");
        }
    }

    public List<Review> getReviewsByMovie(Long movieId) {
        return reviewRepository.findByMovieId(movieId);
    }

    public List<Review> getReviewsByUser(Long userId) {
        return reviewRepository.findByUserId(userId);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
