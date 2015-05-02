package com.ysjapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserModel {
	private String name;
	private int gender;
	private List<TimeLabelModel> timeLabels;
	private List<TaskLabelModel> taskLabels;
	private int dateNum;
	private int likeNum;

	public static UserModel getRandomUser() {
		Random random = new Random();
		
		UserModel user = new UserModel();
		user.setName(String.valueOf(random.nextInt(100000)));
		user.setGender(random.nextInt(2));
		user.setDateNum(random.nextInt(100));
		user.setLikeNum(random.nextInt(100));
		
		List<TimeLabelModel> timeLabels = new ArrayList<TimeLabelModel>();
		for (int i = 0; i < random.nextInt(8); i++) {
			timeLabels.add(TimeLabelModel.getRandomTimeLabel());
		}
		user.setTimeLabels(timeLabels);
		
		List<TaskLabelModel> taskLabels = new ArrayList<TaskLabelModel>();
		for (int i = 0; i < random.nextInt(5); i++) {
			taskLabels.add(TaskLabelModel.getRandomTaskLabel());
		}
		user.setTaskLabels(taskLabels);
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
