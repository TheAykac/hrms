package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.DataResult;
import com.example.hrms.core.Result;
import com.example.hrms.entities.concretes.JobAdvertisement;
import com.example.hrms.entities.concretes.JobSeeker;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping("/jobadvertisement")
@RestController
public class JobAdvertisementsController {
	

	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
@GetMapping("/findByJobPosition")
	public DataResult<List<JobAdvertisement>> findByJobPosition(String jobPosition){
		return jobAdvertisementService.findByJobPosition(jobPosition);
	}

@PostMapping("/add")
public Result add(@RequestBody JobAdvertisement jobAdvertisement ) throws Exception{
	
	return this.jobAdvertisementService.add(jobAdvertisement);
}

@GetMapping("/findallbyisactivetrue")
public DataResult<List<JobAdvertisement>> findAllByIsActiveTrue(){
	return this.jobAdvertisementService.findAllByIsActiveTrue();
}
@GetMapping("findAllByIsActiveTrueOrderByAllByApplicationDeadline")
public DataResult<List<JobAdvertisement>> findAllByIsActiveTrueOrderByAllByApplicationDeadline(){
	return this.jobAdvertisementService.findAllByIsActiveTrueOrderByAllByApplicationDeadline();
}
}
