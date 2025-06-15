package com.example.uberReview.Services;

import java.util.Date;

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
		
		Review r = Review.builder().content("Great ride!!").rating(5.0).build();
				
		reviewrepository.save(r);
		
		System.out.println(r);
	}

}
