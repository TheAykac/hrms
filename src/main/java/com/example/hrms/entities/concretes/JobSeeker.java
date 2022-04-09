package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_seekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="nationalid")
	private String nationalId;
	@Column(name="dateofbirth")
	private String dateOfBirth;
	@Column(name="email")
	private String eMail;
	@Column(name="password")
	private String password;
	@Column(name="againpassword")
	private String checkPassword;

}
