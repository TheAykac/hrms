package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.City;

public interface CityDao {
	
	City finByCityId(int id);
	City findByCityName(String cityName);

}
