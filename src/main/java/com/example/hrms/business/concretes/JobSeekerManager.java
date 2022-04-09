package com.example.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.DataResult;
import com.example.hrms.core.ErrorResult;
import com.example.hrms.core.Result;
import com.example.hrms.core.SuccesDataResult;
import com.example.hrms.core.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;	
	
@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}



	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccesDataResult<List<JobSeeker>>(jobSeekerDao.findAll(),"Ürün Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) throws RemoteException, Exception {
		if(!jobSeekerDao.findByeMail(jobSeeker.getEMail())&& !jobSeekerDao.findByNationalId(jobSeeker.getNationalId())) {
			jobSeekerDao.save(jobSeeker);
			return new SuccessResult("bilgiler kaydedildi");
		}
		
		
		
		else {
			return new ErrorResult("Bilgiler kaydedilemedi");
		}
	}
	
	

}
