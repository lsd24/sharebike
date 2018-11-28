package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring的入口程序，在Spring程序启动时，会进行扫描，扫描带有特殊注解的类
@SpringBootApplication
public class SharebikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharebikeApplication.class, args);
	}
}
