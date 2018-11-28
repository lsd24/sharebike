package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/genCode")
	@ResponseBody
	public boolean genVerifyCode(String countryCode,String phoneNum) {
		boolean flag=userService.sendMsg(countryCode,phoneNum);		
		return flag;		
	}
	
	@RequestMapping("/user/verify")
	@ResponseBody
	public boolean verify(String phoneNum,String verifyCode) {
		//调用Service层，进行校验
		return userService.verify(phoneNum,verifyCode);			
	}
	
	@RequestMapping("/user/register")
	@ResponseBody
	//在接收参数的前面加一个@RequestBody,接收josn类型的参数，然后set到对应的实体类中的属性
	public boolean reg(@RequestBody User user) {	
		boolean flag=true;
		//调用service，将用户的数据保存起来
		try {
			userService.register(user);
		} catch (Exception e) {			
			e.printStackTrace();
			flag=false;
		}			
		return flag;
	}
	
	@RequestMapping("/user/deposit")
	@ResponseBody
	public boolean deposit(@RequestBody User user) {
		boolean flag = true;
		try {
			userService.update(user);
		} catch (Exception e) {
			// 
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}
	
	@RequestMapping("/user/identify")
	@ResponseBody
	public boolean identify(@RequestBody User user) {
		boolean flag = true;
		try {
			userService.update(user);
		} catch (Exception e) {
			// 
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}
}
