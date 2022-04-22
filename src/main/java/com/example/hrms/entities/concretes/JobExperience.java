package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_experinces")
public class JobExperience {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
	private int id;
@Column(name="company_name")
	private String companyName;
@Column(name="job_positions")
	private String jobPosition;
@Column(name="begin_time")
	private String beginTime;
@Column(name="end_time")	
	private String endTime;
	
@ManyToOne
@JoinColumn(name="resume_id")
private Resume resume;

@ManyToOne
private CurriculumVitae curriculumVitae;
	
}
