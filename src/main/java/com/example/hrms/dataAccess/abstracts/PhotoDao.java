package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer>{
	

}
