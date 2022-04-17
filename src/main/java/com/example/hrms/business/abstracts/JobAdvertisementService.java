package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.DataResult;
import com.example.hrms.core.Result;
import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	
	DataResult<List<JobAdvertisement>> findByJobPosition(String jobPosition);	
	Result add(JobAdvertisement jobAdvertisement);		
	DataResult<List<JobAdvertisement>> findAllByIsActiveTrue();
	DataResult<List<JobAdvertisement>> findAllByIsActiveTrueOrderByAllByApplicationDeadline();


}
