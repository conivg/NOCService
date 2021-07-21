package com.nocservice.dto;

public class StatusDto {

	private Integer line;

	private Integer StatustId;

	private Integer date;

	private Integer hour;

	private String obsv;

	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public Integer getStatustId() {
		return StatustId;
	}

	public void setStatustId(Integer statustId) {
		StatustId = statustId;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public String getObsv() {
		return obsv;
	}

	public void setObsv(String obsv) {
		this.obsv = obsv;
	}
}
