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
@Table(name="phot")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	@Column(name="photo_url")
	private String phtoUrl;
	
	@ManyToOne
	private CurriculumVitae curriculumVitae;
}
