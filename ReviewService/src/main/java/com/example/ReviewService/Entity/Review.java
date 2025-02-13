package com.example.ReviewService.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // Links to User Service
    private Long movieId; // Links to Movie Service
    private int rating;
    private String comment;
}
