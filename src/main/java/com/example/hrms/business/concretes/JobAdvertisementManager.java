package com.example.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobAdvertisementDao;

import com.example.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByJobPosition(String jobPosition) {
		
		return new SuccesDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByJobPosition(jobPosition));
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		
		return new SuccessResult("Ürün başarılı bir şekilde eklendi.");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAllByIsActiveTrue() {
		return new SuccesDataResult<>(jobAdvertisementDao.findAllByIsActiveTrue());
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAllByIsActiveTrueOrderByAllByApplicationDeadline() {
		
		return new SuccesDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByIsActiveTrueOrderByAllByApplicationDeadline());
	}

	

}
