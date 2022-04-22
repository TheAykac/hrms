package com.example.hrms.business.concretes;

import java.rmi.RemoteException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.PositionService;
import com.example.hrms.core.results.ErrorResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.PositionDao;
import com.example.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	
private PositionDao positionDao;
@Autowired
public PositionManager(PositionDao positionDao) {
	super();
	this.positionDao = positionDao;
}

@Override
public List<Position> getAll() {
	// TODO Auto-generated method stub
	return this.positionDao.findAll();
}

@Override
public Result add(Position position) throws RemoteException, Exception {
	if(!positionDao.findByTitle(position.getTitle())){
		return new  SuccessResult("bilgiler kayıtedildi");
	}
	else {
		return new ErrorResult("bilgiler kayıt edilemedi");
	}
	
}



	
		
}

	
		
