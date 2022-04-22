package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.SocialMediaService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.SocialMedia;
@RestController
@RequestMapping("/api/socialmedia")
public class SocialMediasController {

	private SocialMediaService socialMediaService;
@Autowired
	public SocialMediasController(SocialMediaService socialMediaService) {
		super();
		this.socialMediaService = socialMediaService;
	}
@GetMapping("/getall")
public DataResult<List<SocialMedia>> getAll(){
	return this.socialMediaService.getAll();
}

@PostMapping("/add")
public Result add(SocialMedia socialMedia) {
	return this.socialMediaService.add(socialMedia);
}
	
	
}
