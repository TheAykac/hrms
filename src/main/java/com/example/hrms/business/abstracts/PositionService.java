package com.example.hrms.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import com.example.hrms.core.Result;

import com.example.hrms.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
	Result add(Position position) throws RemoteException, Exception;

}
