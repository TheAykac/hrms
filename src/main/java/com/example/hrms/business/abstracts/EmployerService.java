package com.example.hrms.business.abstracts;

import java.rmi.RemoteException;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobAdvertisement;

public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result register(Employer employer) throws RemoteException, Exception;
	Result addJobAdvetisement(JobAdvertisement jobAdvertisement);
}
