package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobExperienceService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobExperienceDao;
import com.example.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}
@Override
public DataResult<List<JobExperience>> getAll() {	
	return new SuccesDataResult<List<JobExperience>>(jobExperienceDao.findAll(),"Başarılı bir şekilde Listelendir");
}

@Override
public Result add(JobExperience jobExperience) {
	this.jobExperienceDao.save(jobExperience);
	return new SuccessResult("Başarılı bir şekilde eklendi");
}

@Override
public DataResult<List<JobExperience>> findAllByResume_IdOrderByEndTime(int resumeId) {
	
	return new SuccesDataResult<List<JobExperience>>(jobExperienceDao.findAllByResume_IdOrderByEndTime(resumeId));
}

@Override
public DataResult<List<JobExperience>> findAllByResume_IdOrderByEndTimeDesc(int resumeId) {
	
	return new SuccesDataResult<List<JobExperience>>(jobExperienceDao.findAllByResume_IdOrderByEndTimeDesc(resumeId));
}

}
