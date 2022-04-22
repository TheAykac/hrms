package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.CurriculumVitaeService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import com.example.hrms.entities.concretes.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {
	
private CurriculumVitaeDao curriculumVitaeDao;

@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
	super();
	this.curriculumVitaeDao = curriculumVitaeDao;
}
	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		
		return new SuccesDataResult<List<CurriculumVitae>>(curriculumVitaeDao.findAll(),"Başarılı bir şekilde listelendi");
	}
	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult("Başarılı bir şekilde eklendi");
	}
	
	
	
	

}
