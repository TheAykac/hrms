package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.SchoolService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
	private SchoolService schoolService;
@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
@GetMapping("/finall")
public DataResult<List<School>> getAll(){
	return this.schoolService.getAll();
}

@PostMapping("/add")
public Result add(School school) {
	return this.schoolService.add(school);
}

	

}
