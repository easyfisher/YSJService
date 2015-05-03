package com.ysjapp.model;

import java.util.Random;

import com.ysjapp.model.proto.IProtoModel;
import com.ysjapp.model.proto.ProtoModels.Time;

public class TimeModel implements IProtoModel {
	private int hour;
	private int minute;

	// private int second;

	public static TimeModel getRandomTime() {
		Random random = new Random();

		TimeModel time = new TimeModel();
		time.setHour(random.nextInt(24));
		time.setMinute(random.nextInt(60));
		// time.setSecond(random.nextInt(60));

		return time;
	}

	@Override
	public Time generateMessage() {
		return Time.newBuilder().setHour(hour).setMinute(minute).build();
	}

	// public int getSecond() {
	// return second;
	// }
	//
	// public void setSecond(int second) {
	// this.second = second;
	// }

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
}
