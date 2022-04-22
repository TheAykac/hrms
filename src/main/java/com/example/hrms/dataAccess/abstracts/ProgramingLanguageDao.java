package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageDao extends JpaRepository<ProgramingLanguage, Integer>{

}
