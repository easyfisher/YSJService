package com.ysjapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysjapp.model.UserModel;

@RestController
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/user")
	public List<UserModel> getUsers(@RequestParam(value = "count", defaultValue = "1") int count) {
		List<UserModel> users = new ArrayList<UserModel>();
		for (int i = 0; i < count; i++) {
			users.add(UserModel.getRandomUser());
		}
		return users;
	}
}
