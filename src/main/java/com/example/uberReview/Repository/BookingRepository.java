package com.example.uberReview.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uberReview.Models.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
