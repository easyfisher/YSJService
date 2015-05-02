package com.ysjapp.model;

import java.util.List;

public class UserModel {
	private String name;
	private int gender;
	private List<TimeLabelModel> timeLabels;
	private List<TaskLabelModel> taskLabels;
	private int dateNum;
	private int likeNum;

	public static UserModel getRandomUser() {
		UserModel user = new UserModel();
		user.setName("阿三");
		user.setGender(1);
		return user;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public List<TimeLabelModel> getTimeLabels() {
		return timeLabels;
	}

	public void setTimeLabels(List<TimeLabelModel> timeLabels) {
		this.timeLabels = timeLabels;
	}

	public List<TaskLabelModel> getTaskLabels() {
		return taskLabels;
	}

	public void setTaskLabels(List<TaskLabelModel> taskLabels) {
		this.taskLabels = taskLabels;
	}

	public int getDateNum() {
		return dateNum;
	}

	public void setDateNum(int dateNum) {
		this.dateNum = dateNum;
	}

	public int getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(int likeNum) {
		this.likeNum = likeNum;
	}
}
