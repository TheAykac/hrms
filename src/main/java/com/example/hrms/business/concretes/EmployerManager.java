package com.example.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.DataResult;
import com.example.hrms.core.ErrorDataResult;
import com.example.hrms.core.ErrorResult;
import com.example.hrms.core.Result;
import com.example.hrms.core.SuccesDataResult;
import com.example.hrms.core.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;

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
	


}