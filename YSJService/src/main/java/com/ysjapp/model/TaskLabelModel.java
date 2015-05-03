package com.ysjapp.model;

import java.util.Random;

import com.ysjapp.model.proto.IProtoModel;
import com.ysjapp.model.proto.ProtoModels.Task;
import com.ysjapp.model.proto.ProtoModels.User.TaskLabel;

public class TaskLabelModel implements IProtoModel {
	private int task;
	private String description;

	public static TaskLabelModel getRandomTaskLabel() {
		TaskLabelModel taskLabel = new TaskLabelModel();
		taskLabel.setTask(new Random().nextInt(7) + 1);
		taskLabel.setDescription(String.valueOf(new Random().nextInt(100000)));
		return taskLabel;
	}

	@Override
	public TaskLabel generateMessage() {
		return TaskLabel.newBuilder().setTask(Task.valueOf(task))
				.setDescription(description).build();
	}

	public int getTask() {
		return task;
	}

	public void setTask(int task) {
		this.task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
