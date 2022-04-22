package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobExperienceService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.JobExperience;
@RestController
@RequestMapping("/api/jobexperience")
public class JobExperiencesController {

	private JobExperienceService jobExperienceService;
@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
@GetMapping("/getall")
public DataResult<List<JobExperience>> getAll(){
	return this.jobExperienceService.getAll();
}

@PostMapping("/add")
public Result add(JobExperience jobExperience) {
	
	return this.jobExperienceService.add(jobExperience);
}
@GetMapping("/findAllByResume_IdOrderByEndTime")
public DataResult<List<JobExperience>> findAllByResume_IdOrderByEndTime(int resumeId){
	return this.jobExperienceService.findAllByResume_IdOrderByEndTime(resumeId);
}
@GetMapping("/findAllByResume_IdOrderByEndTimeDesc")
public DataResult<List<JobExperience>> findAllByResume_IdOrderByEndTimeDesc(int resumeId){
	return this.jobExperienceService.findAllByResume_IdOrderByEndTimeDesc(resumeId);
}


}
