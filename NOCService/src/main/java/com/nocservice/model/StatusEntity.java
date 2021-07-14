package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Statu_Status")
public class StatusEntity {

@Id
private Integer line;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name= "StatustId")
private StatusTypeEntity StatustId;

@Column
private Integer date;

@Column
private Integer hour;

@Column
private String obsv;

public Integer getLine() {
	return line;
}

public void setLine(Integer line) {
	this.line = line;
}

public StatusTypeEntity getStatustId() {
	return StatustId;
}

public void setStatustId(StatusTypeEntity statustId) {
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
