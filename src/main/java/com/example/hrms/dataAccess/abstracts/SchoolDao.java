package com.example.hrms.dataAccess.abstracts;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer> {
	
List<School> findAllByResume_IdOrderByEndTime(int resumeId);
	
List<School> findAllByResume_IdOrderByEndTimeDesc(int resumeId);
}
