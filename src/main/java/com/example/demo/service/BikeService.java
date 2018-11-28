package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Bike;

public interface BikeService {

	public void save(Bike bike);

	public List<Bike> findNear(double longitude, double latitude);
	

}
