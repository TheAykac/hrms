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

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resume")
public class Resume {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
	private int id;
@Column(name="resume")
	private String resume;
	
@ManyToOne
private CurriculumVitae curriculumVitae;
}
