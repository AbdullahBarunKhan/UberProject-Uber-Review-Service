package com.example.uberReview.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uberReview.Models.Review;


@Repository
public interface UberRepository extends JpaRepository<Review,Long>{
	
	
	
}
