package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Permi_Permission")
public class PermissionEntity {

@Id
private Integer line;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name= "userId")
private UserEntity userId;

@Column
private String object;

@Column
private String relation;

public Integer getLine() {
	return line;
}

public void setLine(Integer line) {
	this.line = line;
}

public UserEntity getUserId() {
	return userId;
}

public void setUserId(UserEntity userId) {
	this.userId = userId;
}

public String getObject() {
	return object;
}

public void setObject(String object) {
	this.object = object;
}

public String getRelation() {
	return relation;
}

public void setRelation(String relation) {
	this.relation = relation;
}
}
