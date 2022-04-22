package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.SchoolService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.SchoolDao;
import com.example.hrms.entities.concretes.School;
@Service
public class SchoolManager implements SchoolService{
	
	private SchoolDao schoolDao;
	
@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> findAllByResume_IdOrderByEndTime(int resumeId) {
		
		return new SuccesDataResult<List<School>> (schoolDao.findAllByResume_IdOrderByEndTime(resumeId),"Başarılı bir şekilde  Listelendir");	
	}

	@Override
	public DataResult<List<School>> findAllByResume_IdOrderByEndTimeDesc(int resumeId) {
		
		return new SuccesDataResult<List<School>>(schoolDao.findAllByResume_IdOrderByEndTimeDesc(resumeId),"Başarılı bir şekilde listelendi");
	}

	@Override
	public DataResult<List<School>> getAll() {
		
		return new SuccesDataResult<List<School>>(schoolDao.findAll(),"Başarılı bir şekilde listelendi");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul Kaydedildi");
	}
	

}
