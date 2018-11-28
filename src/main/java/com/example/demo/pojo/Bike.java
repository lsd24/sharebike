package com.example.demo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

//Bike这个类以后跟MongoDB中的Bikes collections关联上了
@Document(collection="bikes")
public class Bike {
	
	//主键(唯一、建立索引)，id 对应的是Mongodb中的_id
	@Id
	private String id;
	
	private double longitude;
	
	private double latitude;
	
	//建立索引
	@Indexed
	private Long bikeno;
	
	private int status;
	
	public String getId() {
		return id;
	}

	public Long getBikeno() {
		return bikeno;
	}

	public void setBikeno(Long bikeno) {
		this.bikeno = bikeno;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
