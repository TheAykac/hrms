package com.example.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="jobadvertisement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	@Id
	@GeneratedValue
	
	@Column(name="id")
		private int id;
	@Column(name="jobposition")
		private String jobPosition;
	@Column(name="jobdescription")
		private String jobDescription;
	@Column(name="cityinfo")
		private String cityInfo;
	@Column(name="openpositioncount")
		private int openpositionCount;
	@Column(name="minsalary")
		private int minSalary;
	@Column(name="maxsalary")
		private int maxSalary;
	@JsonFormat(pattern="dd-mm-yyyy")
	@Column(name="applicationdeadline")
		private Date applicationDeadline;
	@Column(name="isactive")
	private boolean isActive;
	
	//@ManyToOne
	//@JoinColumn(name="id",referencedColumnName = "id")
	//private Employer employer;
}
