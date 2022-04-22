package com.example.hrms.api.controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.JobSeeker;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return jobSeekerService.getAll();
		
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody JobSeeker jobSeeker) throws Exception{
		
		return this.jobSeekerService.add(jobSeeker);
	}
	
	
	
	
}
