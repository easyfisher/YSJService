package com.ysjapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysjapp.model.UserModel;

@RestController
public class HomeController {

	@RequestMapping("/user")
	public UserModel getUser() {
		UserModel user = UserModel.getRandomUser();
		return user;
	}
}
