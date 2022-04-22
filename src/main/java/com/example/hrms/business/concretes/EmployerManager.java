package com.example.hrms.business.concretes;

import java.rmi.RemoteException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.ErrorDataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobAdvertisement;

@Service
public class EmployerManager implements EmployerService{
	
	
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccesDataResult<List<Employer>>("İş verenler listelendi");
	}

	@Override
	public Result register(Employer employer) throws RemoteException, Exception {
		if(!employerDao.findByeMail(employer.getEMail())) {
			employerDao.save(employer);
			return new SuccesDataResult<List<Employer>>("Kayıt oluşturuldu.");
		}
		
		else {
			return new ErrorDataResult<Employer>("kayıt oluşturulamadı");
		}
		
	}

	@Override
	public Result addJobAdvetisement(JobAdvertisement jobAdvertisement) {
		
		return new SuccesDataResult<JobAdvertisement>("İş ilanı sisteme yüklendi.");
	}
	


}
