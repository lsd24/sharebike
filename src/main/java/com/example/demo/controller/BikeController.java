package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.Bike;
import com.example.demo.service.BikeService;

/**
 * 标记这个类是一个用于接收请求和响应用户的一个控制器
 * 加上@Controller注解后，Spring容器就会对它实例化
 * @author Administrator
 *
 */
@Controller
public class BikeController {
	
	//到Spring容器中，查找BikeService类型的实例，然后注入到BikeController实例中
	@Autowired
	private BikeService bikeService;
	
	@RequestMapping("/bike/add")
	@ResponseBody
	public String add(@RequestBody Bike bike) {
		//调用service层，将数据保存到MongoDB中
		bikeService.save(bike);				
		return "success";
	}
	
	@RequestMapping("/bike/findNear")
	@ResponseBody
	public List<Bike> findNear(double longitude,double latitude) {
		//
		List<Bike> bikes=bikeService.findNear(longitude,latitude);	
		return bikes;
	}

}
