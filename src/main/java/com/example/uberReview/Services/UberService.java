package com.example.uberReview.Services;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.uberReview.Models.Booking;
import com.example.uberReview.Models.BookingStatus;
import com.example.uberReview.Models.Review;
import com.example.uberReview.Repository.BookingRepository;
import com.example.uberReview.Repository.UberRepository;

@Service
public class UberService implements CommandLineRunner{
	
	private UberRepository reviewrepository;
	
	private BookingRepository bookingRepository;
	
	public UberService(UberRepository reviewRepository, BookingRepository bookingRepository) {
		this.reviewrepository = reviewRepository;
		this.bookingRepository = bookingRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("****");
		
		Review r = Review.builder().content("Amazing ride!!").rating(5.0).build();
				
		Booking b = Booking.builder().endTime(new Date()).review(r).bookingstatus(BookingStatus.ASSIGNING_DRIVER).build();
		
		bookingRepository.save(b);
		reviewrepository.save(r);
		
//		System.out.println(r);
		
		List<Review> reviews = reviewrepository.findAll();
		
//		reviewrepository.deleteById(2L);
		
		bookingRepository.deleteById(102L);
		
		for(Review rev : reviews) {
			System.out.println(rev.getContent());
		}
		
	}

}
