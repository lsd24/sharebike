package com.example.demo.service;

import com.example.demo.pojo.User;

public interface UserService {

	boolean sendMsg(String countryCode, String phoneNum);

	boolean verify(String phoneNum, String verifyCode);

	void register(User user);

	void update(User user);

}
