package com.example.uberReview.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends Review{
	
	private String passengerReview;
	
	@Column
	private double passengerRating;

}
