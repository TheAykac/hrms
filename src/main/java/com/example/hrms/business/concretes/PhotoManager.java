package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.example.hrms.business.abstracts.PhotoService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.PhotoDao;
import com.example.hrms.entities.concretes.Photo;
@Service
public class PhotoManager implements PhotoService {
	
	private PhotoDao photoDao;
@Autowired
	public PhotoManager(PhotoDao photoDao) {
		super();
		this.photoDao = photoDao;
	}
@Override
public DataResult<List<Photo>> getAll() {
	
	return new SuccesDataResult<List<Photo>>(photoDao.findAll(),"Başarılı bir şekilde listelendi");
}
@Override
public Result add(Photo photo, MultipartFile multipartFile) {
	
	
	
	this.photoDao.save(photo);
	return new SuccessResult("Başarılı bir şekilde eklendi");
}



	

}
