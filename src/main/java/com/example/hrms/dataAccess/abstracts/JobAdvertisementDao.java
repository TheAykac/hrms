package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	
	
	List<JobAdvertisement> findByJobPosition(String jobPosition);
	
	List<JobAdvertisement> findAllByIsActiveTrue();
	@Query("From JobAdvertisement where isActive=true Order By applicationDeadline")
	List<JobAdvertisement> findAllByIsActiveTrueOrderByAllByApplicationDeadline();
	
	
	
}
