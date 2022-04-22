package com.example.hrms.core.utilities.adapters.abstracts;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.example.hrms.core.results.DataResult;

public interface UploadService {

	DataResult<Map<String, String>> uploadPhot (MultipartFile multipartFile);
}
