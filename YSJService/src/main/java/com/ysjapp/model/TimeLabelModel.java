package com.ysjapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ysjapp.model.proto.IProtoModel;
import com.ysjapp.model.proto.ProtoModels.User.TimeLabel;
import com.ysjapp.model.proto.ProtoModels.Week;

public class TimeLabelModel implements IProtoModel {
	private int dayOfWeek;
	private List<PeriodModel> periods;

	public static TimeLabelModel getRandomTimeLabel() {
		TimeLabelModel timeLabel = new TimeLabelModel();
		timeLabel.setDayOfWeek(new Random().nextInt(7));

		List<PeriodModel> periods = new ArrayList<PeriodModel>();
		for (int i = 0; i < new Random().nextInt(5); i++) {
			periods.add(PeriodModel.getRandomPeriod());
		}
		timeLabel.setPeriods(periods);

		return timeLabel;
	}

	@Override
	public TimeLabel generateMessage() {
		TimeLabel.Builder builder = TimeLabel.newBuilder();
		builder.setDayOfWeek(Week.valueOf(dayOfWeek));
		if (periods != null) {
			for (PeriodModel periodModel : periods) {
				builder.addPeriods(periodModel.generateMessage());
			}
		}
		return builder.build();
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public List<PeriodModel> getPeriods() {
		return periods;
	}

	public void setPeriods(List<PeriodModel> periods) {
		this.periods = periods;
	}
}
