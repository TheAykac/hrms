package com.example.hrms.business.abstracts;
import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.KnowLanguage;

public interface KnowLanguageService {
	
	DataResult<List<KnowLanguage>> getAll();
	Result add (KnowLanguage knowLanguage);	
	
	
}
