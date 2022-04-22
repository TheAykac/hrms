package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer>{
	
	Resume findById(int id);
	Resume findByResume(String resume);

}
