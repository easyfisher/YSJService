package com.ysjapp.model;

public class PeriodModel {
	private TimeModel start;
	private TimeModel end;

	public static PeriodModel getRandomPeriod() {
		PeriodModel period = new PeriodModel();
		period.setStart(TimeModel.getRandomTime());
		period.setEnd(TimeModel.getRandomTime());
		return period;
	}
	
	public TimeModel getStart() {
		return start;
	}

	public void setStart(TimeModel start) {
		this.start = start;
	}

	public TimeModel getEnd() {
		return end;
	}

	public void setEnd(TimeModel end) {
		this.end = end;
	}
}
