package com.example.uberReview.Models;

import java.util.ArrayList;
import java.util.List;

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
@Data
@Entity
public class Passenger extends BaseModel {

    private String name;
	
    @OneToMany(mappedBy = "passenger")
	private List<Booking> booking = new ArrayList<>();
}
