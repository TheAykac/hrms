package com.example.hrms.api.controllers;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.PositionService;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Position;

@RestController
@RequestMapping("/api/positions")

public class PositionsController {
	private PositionService positionService;
	@Autowired
	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}

	@GetMapping("/getall")
	public List<Position> getAll(){
		return positionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Position position) throws RemoteException, Exception {
		return positionService.add(position);
	}

}
