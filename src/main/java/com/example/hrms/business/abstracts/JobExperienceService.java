package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.JobExperience;

public interface JobExperienceService  {
	
	DataResult<List<JobExperience>> getAll();
	
	Result add(JobExperience jobExperience);	
	
	DataResult<List<JobExperience>> findAllByResume_IdOrderByEndTime(int resumeId);	
	
	DataResult<List<JobExperience>> findAllByResume_IdOrderByEndTimeDesc(int resumeId);
	
	
	
}
