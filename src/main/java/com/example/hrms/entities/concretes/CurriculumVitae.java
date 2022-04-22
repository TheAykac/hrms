package com.example.hrms.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="curriculumvitae")
public class CurriculumVitae {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
@Column(name="id")
	private int id;
@Column(name="gender")
	private String gender;
@Column(name="nationality")
	private String nationality;
@Column(name="driverLicense")
	private String driverLicense;
@Column(name="description")
	private String description;
@Column(name="profilImage")
	private String profilImage;

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
@OneToMany(mappedBy = "curriculumVitae")
private List<KnowLanguage> knownLanguages;

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
@OneToMany(mappedBy = "curriculumVitae")
private List<JobExperience> jobExperiences;

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
@OneToMany(mappedBy = "curriculumVitae")
private List<ProgramingLanguage> programingLanguages;

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
@OneToMany(mappedBy = "curriculumVitae")
private List<Resume> resumes;

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
@OneToMany(mappedBy = "curriculumVitae")
private List<School> schools;

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
@OneToMany(mappedBy = "curriculumVitae")
private List<SocialMedia> socialMedias;

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
@OneToMany(mappedBy = "curriculumVitae")
private List<Photo> photo;




}
