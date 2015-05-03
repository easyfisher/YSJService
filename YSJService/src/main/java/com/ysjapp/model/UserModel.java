package com.ysjapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ysjapp.model.proto.IProtoModel;
import com.ysjapp.model.proto.ProtoModels.Gender;
import com.ysjapp.model.proto.ProtoModels.User;

public class UserModel implements IProtoModel {
	private int id;
	private String name;
	private int gender;
	private List<TimeLabelModel> timeLabels;
	private List<TaskLabelModel> taskLabels;
	private int dateNum;
	private int likeNum;

	public static UserModel getRandomUser() {
		Random random = new Random();

		UserModel user = new UserModel();
		user.setId(random.nextInt(1000));
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

	@Override
	public User generateMessage() {
		User.Builder builder = User.newBuilder();
		builder.setId(id).setName(name).setGender(Gender.valueOf(gender))
				.setDateNum(dateNum).setLikeNum(likeNum);
		if (timeLabels != null) {
			for (TimeLabelModel timeLabelModel : timeLabels) {
				builder.addTimeLabels(timeLabelModel.generateMessage());
			}
		}
		if (taskLabels != null) {
			for (TaskLabelModel taskLabelModel : taskLabels) {
				builder.addTaskLabels(taskLabelModel.generateMessage());
			}
		}
		return builder.build();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
