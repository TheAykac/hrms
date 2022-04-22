package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
	
	List<JobExperience> findAllByResume_IdOrderByEndTime(int resumeId);
	
	List<JobExperience> findAllByResume_IdOrderByEndTimeDesc(int resumeId);
	
	
}
