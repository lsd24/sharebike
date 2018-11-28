package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Bike;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public void save(Bike bike) {
		// 调用具体的业务
		//mongoTemplate.insert(bike,"bikes");			
		mongoTemplate.insert(bike); //但是在Bike的类中，添加了注解，注解中保存了映射关系
	}

	@Override
	public List<Bike> findNear(double longitude, double latitude) {
		// 查找所有单车
		return mongoTemplate.findAll(Bike.class);
		
	}

}
