package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.entities.concretes.Employer;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")	
	public DataResult<List<Employer>> getAll(){
		return new SuccesDataResult<List<Employer>>("İşverenler Listelendi");
	}
	
	public Result register(@RequestBody Employer employer) throws Exception
	{
		return this.employerService.register(employer); 
	}
}
