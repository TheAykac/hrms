package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.KnowLanguageService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.KnowLanguage;

@RestController
@RequestMapping("/api/language")
public class KnowLanguagesController {

	private KnowLanguageService knowLanguageService;
@Autowired
	public KnowLanguagesController(KnowLanguageService knowLanguageService) {
		super();
		this.knowLanguageService = knowLanguageService;
	}

@GetMapping("/getall")
public DataResult<List<KnowLanguage>> getAll(){
	
	return this.knowLanguageService.getAll();
}

@PostMapping("/add")
public Result add (KnowLanguage knowLanguage) {
	return this.knowLanguageService.add(knowLanguage);
}
	
	
}
