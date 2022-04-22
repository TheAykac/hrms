package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Resume;

public interface ResumeService {
	
	DataResult<List<Resume>> getAll();
	
	Result add(Resume resume);

	DataResult<Resume> findById(int id);
	
	DataResult<Resume> findByResume(String resume);
	
}
