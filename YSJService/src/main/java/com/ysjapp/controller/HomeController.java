package com.ysjapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysjapp.model.UserModel;
import com.ysjapp.model.proto.ProtoModels.UserList;
import com.ysjapp.constant.Constant;

@RestController
@RequestMapping(Constant.URL_HOME)
public class HomeController {
	
	@RequestMapping(Constant.URL_SUB_USERS)
	public UserList getUsers(@RequestParam(value = "count", defaultValue = "1") int count) {
		
		UserList.Builder builder = UserList.newBuilder();
		for (int i = 0; i < count; i++) {
			builder.addUsers(UserModel.getRandomUser().generateMessage());
		}
		return builder.build();
	}
	
	@RequestMapping("/users.json")
	public List<UserModel> getUsersJson(@RequestParam(value = "count", defaultValue = "1") int count) {
		List<UserModel> users = new ArrayList<UserModel>();
		for (int i = 0; i < count; i++) {
			users.add(UserModel.getRandomUser());
		}
		
		return users;
	}
}
