package com.ysjapp.model;

import java.util.Random;

public class TaskLabelModel {
	private String description;

	public static TaskLabelModel getRandomTaskLabel() {
		TaskLabelModel taskLabel = new TaskLabelModel();
		taskLabel.setDescription(String.valueOf(new Random().nextInt(100000)));
		return taskLabel;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
