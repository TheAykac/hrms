package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.School;

public interface SchoolService {
	
	DataResult<List<School>> getAll();
	
	Result add(School school);
	 
	
	DataResult<List<School>> findAllByResume_IdOrderByEndTime(int resumeId);
	
	DataResult<List<School>> findAllByResume_IdOrderByEndTimeDesc(int resumeId);
	

}
