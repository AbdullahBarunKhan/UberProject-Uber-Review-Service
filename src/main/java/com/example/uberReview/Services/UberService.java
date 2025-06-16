package com.example.uberReview.Services;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.uberReview.Models.Review;
import com.example.uberReview.Repository.UberRepository;

@Service
public class UberService implements CommandLineRunner{
	
	private UberRepository reviewrepository;
	
	public UberService(UberRepository reviewRepository) {
		this.reviewrepository = reviewRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("****");
		
		Review r = Review.builder().content("Amazing ride!!").rating(5.0).build();
				
		reviewrepository.save(r);
		
//		System.out.println(r);
		
		List<Review> reviews = reviewrepository.findAll();
		
		reviewrepository.deleteById(2L);
		
		for(Review rev : reviews) {
			System.out.println(rev.getContent());
		}
		
	}

}
