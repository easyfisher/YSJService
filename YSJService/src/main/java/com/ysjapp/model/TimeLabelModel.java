package com.ysjapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TimeLabelModel {
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
