package com.example.uberReview.Models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Booking extends BaseModel {

	@Temporal(TemporalType.TIMESTAMP)
	private String startTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;
	
	@Enumerated(EnumType.STRING)
	private BookingStatus bookingstatus;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Review review;
	
	private Long totalDist;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Driver driver;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Passenger passenger;
	
	

}
