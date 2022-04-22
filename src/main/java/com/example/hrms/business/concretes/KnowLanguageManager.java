package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.KnowLanguageService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.KnowLanguageDao;
import com.example.hrms.entities.concretes.KnowLanguage;
@Service
public class KnowLanguageManager implements KnowLanguageService {
	
	private KnowLanguageDao knowLanguageDao;
@Autowired
	public KnowLanguageManager(KnowLanguageDao knowLanguageDao) {
		super();
		this.knowLanguageDao = knowLanguageDao;
	}
@Override
public DataResult<List<KnowLanguage>> getAll() {
	
	return new SuccesDataResult<List<KnowLanguage>>(knowLanguageDao.findAll(),"Başarılı bir şekilde listelendi");
}
@Override
public Result add(KnowLanguage knowLanguage) {
	this.knowLanguageDao.save(knowLanguage);
	return new SuccessResult("Başarılı bir şekilde eklendi");
}


}
