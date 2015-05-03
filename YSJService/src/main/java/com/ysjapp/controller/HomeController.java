package com.ysjapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysjapp.model.UserModel;
import com.ysjapp.model.proto.ProtoModels.UserList;

@RestController
@RequestMapping("/home")
public class HomeController {

	public static void main(String[] args) {
		UserList  userList = new HomeController().getUsers(3);
		System.out.println(userList);
	}
	
	@RequestMapping("/user")
	public UserList getUsers(@RequestParam(value = "count", defaultValue = "1") int count) {
//		List<UserModel> users = new ArrayList<UserModel>();
//		for (int i = 0; i < count; i++) {
//			users.add(UserModel.getRandomUser());
//		}
		
//		return users;
		UserList.Builder builder = UserList.newBuilder();
		for (int i = 0; i < count; i++) {
			builder.addUsers(UserModel.getRandomUser().generateMessage());
		}
		return builder.build();
	}
}
