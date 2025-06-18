package com.example.uberReview.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.uberReview.Models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
