package com.example.uberReview.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Driver extends BaseModel{
	

	private String name;
	
	@Column(nullable = false)
	private String LicenseNumber;
	
	@OneToMany(mappedBy = "driver")
	private List<Booking> booking = new ArrayList<>();
	
	
		
		
}
