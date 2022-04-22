package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.CurriculumVitae;



public interface CurriculumVitaeService {

	DataResult<List<CurriculumVitae>> getAll();
	
	Result add(CurriculumVitae curriculumVitae);
}
