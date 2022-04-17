package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employer")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
		private int id;
	@Column(name="companyname")
		private String companyName;
	@Column(name="email")
		private String eMail;
	@Column(name="tel")
		private String phoneNumber;
	@Column(name="password")
		private String password;
	@Column(name="checkpassword")
		private String checkPassword;
	
	
}
