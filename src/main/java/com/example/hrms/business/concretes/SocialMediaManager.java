package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.SocialMediaService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.SocialMediaDao;
import com.example.hrms.entities.concretes.SocialMedia;
@Service
public class SocialMediaManager implements SocialMediaService{

	private SocialMediaDao socialMediaDao;
@Autowired	
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public DataResult<List<SocialMedia>> getAll() {
		
		return new SuccesDataResult<List<SocialMedia>>(socialMediaDao.findAll(),"Başarılı bir şekilde listelendir");
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult("Başarılı bir şekilde eklendi");
	}

}
