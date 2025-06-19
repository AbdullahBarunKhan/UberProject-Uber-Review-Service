package com.example.uberReview.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.uberReview.Models.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

	Optional<Driver> findDriverByLicenseNumberAndId(String LicenseNumber,Long Id);
	
	Optional<Driver> findDriverById(Long Id);
	
	@Query(nativeQuery = true, value = "Select * from driver where id= :id and license_number = :licenseNumber")
	Optional<Driver> rawfindByIdAndLicenseNumber(@Param("id") Long id,@Param("licenseNumber") String licenseNumber);	
	
	@Query("SELECT d FROM Driver d WHERE d.id = :Id AND d.licenseNumber = :LicenseNumber")
	Optional<Driver> rawHibfindByIdAndLicenseNumber(@Param("Id") Long Id, @Param("LicenseNumber") String LicenseNumber);
	
	
}
