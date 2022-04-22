package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CurriculumVitaeService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.CurriculumVitae;

@RestController
@RequestMapping("/api/curriculumvitaes")
public class CurriculumVitaesController {
	private CurriculumVitaeService curriculumVitaeService;
@Autowired
	public CurriculumVitaesController(CurriculumVitaeService curriculumVitaeService) {
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}

@GetMapping("/getall")
public DataResult<List<CurriculumVitae>> getAll(){
	return this.curriculumVitaeService.getAll();
}
@PostMapping("/add")
public Result add(CurriculumVitae curriculumVitae) {
	return this.add(curriculumVitae);
}
	

}
