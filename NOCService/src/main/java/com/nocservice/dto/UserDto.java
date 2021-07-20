package com.nocservice.dto;

public class UserDto {
	
	Integer code;
	
	Integer idTStatus;
	
	String name;
	
	String email;
	
	String password;
	
	Integer birthday;
	
	Integer userTId;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public Integer getBirthday() {
		return birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public Integer getUserType() {
		return userTId;
	}

	public void setUserType(Integer userTId) {
		this.userTId = userTId;
	}
	@Override
	public String toString() {
		return "UserDto [code=" + code + ", userType=" + userTId + ", idTStatus=" + idTStatus + ", name=" + name
				+ ", email=" + email + ", password=" + password + ", birthday=" + birthday + "]";
	}

	
}
