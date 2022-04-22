package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {
	
	DataResult<List<SocialMedia>> getAll();
	Result add (SocialMedia socialMedia);
}
