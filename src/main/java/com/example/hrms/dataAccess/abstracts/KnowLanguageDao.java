package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.KnowLanguage;

public interface KnowLanguageDao extends JpaRepository<KnowLanguage, Integer>{

	KnowLanguage findById(int id);
	KnowLanguage findByLanguage(String Language);
	KnowLanguage findByLevel(int level);
	
}
