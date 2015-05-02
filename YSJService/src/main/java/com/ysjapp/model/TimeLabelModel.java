package com.ysjapp.model;

import java.util.List;

public class TimeLabelModel {
	private int dayOfWeek;
	private List<PeriodModel> periods;

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
