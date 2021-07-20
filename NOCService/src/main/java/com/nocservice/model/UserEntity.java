package com.nocservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.nocservice.dto.UserDto;

import javax.persistence.Column;

@Entity
@Table(name="User_User")
public class UserEntity {

@Id
private Integer code;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name= "userTId")
private UserTypeEntity userTId;

@Column
private Integer idTStatus;
@Column
private String name;
@Column
private String email;
@Column
private String password;
@Column
private Integer birthday;

public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
public UserTypeEntity getUserTId() {
	return userTId;
}
public void setUserTId(UserTypeEntity userTId) {
	this.userTId = userTId;
}
public Integer getIdTStatus() {
	return idTStatus;
}
public void setIdTStatus(Integer idTStatus) {
	this.idTStatus = idTStatus;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getBirthday() {
	return birthday;
}
public void setBirthday(Integer birthday) {
	this.birthday = birthday;
}

}
