package com.example.hrms.core.utilities.adapters.concretes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;



import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.ErrorDataResult;
import com.example.hrms.core.results.SuccesDataResult;
import com.example.hrms.core.utilities.adapters.abstracts.UploadService;

@Service
public class UploadManager implements UploadService {

	@Override
	public DataResult<Map<String, String>> uploadPhot(MultipartFile multipartFile) {
		// TODO Auto-generated method stub
		return null;
	}
	

}