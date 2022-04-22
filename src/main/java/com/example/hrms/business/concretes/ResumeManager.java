package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.ResumeService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.ResumeDao;
import com.example.hrms.entities.concretes.Resume;
@Service
public class ResumeManager implements ResumeService{
	private ResumeDao resumeDao;
	
@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}


	@Override
	public DataResult<Resume> findById(int id) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<Resume>(resumeDao.findById(id),"Başarılı bir şekilde listelendi");
	}


	@Override
	public DataResult<Resume> findByResume(String resume) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<Resume>(resumeDao.findByResume(resume),"Başarılı bir şekilde listelendi");
	}


	@Override
	public DataResult<List<Resume>> getAll() {		
		return new SuccesDataResult<List<Resume>>(resumeDao.findAll(),"Başarılı bir şekilde listelendi");
	}


	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("Başarılı bir şekilde Listelendi");
	}
	

	

}
