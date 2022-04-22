package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="programing_language")
public class ProgramingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
@Column(name="id")
	private int id;
@Column(name="programing_language_name")	
	private String programingLanguageName;
	
@ManyToOne
private CurriculumVitae curriculumVitae;
}
