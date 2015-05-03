package com.ysjapp.model;

import com.ysjapp.model.proto.IProtoModel;
import com.ysjapp.model.proto.ProtoModels.User.TimeLabel.Period;

public class PeriodModel implements IProtoModel {
	private TimeModel start;
	private TimeModel end;

	public static PeriodModel getRandomPeriod() {
		PeriodModel period = new PeriodModel();
		period.setStart(TimeModel.getRandomTime());
		period.setEnd(TimeModel.getRandomTime());
		return period;
	}

	@Override
	public Period generateMessage() {
		return Period.newBuilder().setStart(start.generateMessage())
				.setEnd(end.generateMessage()).build();
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
