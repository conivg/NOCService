package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Docum_Document")
public class DocumentEntity {

@Id
private Integer code;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name= "DocTId")
private DocumentTypeEntity DocTId;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name= "UserId")
private UserEntity UserId;

@Column
private Integer date;

@Column 
private Integer hour;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name= "StatusId")
private StatusEntity statusId;

public Integer getCode() {
	return code;
}

public void setCode(Integer code) {
	this.code = code;
}

public DocumentTypeEntity getDocTId() {
	return DocTId;
}

public void setDocTId(DocumentTypeEntity docTId) {
	DocTId = docTId;
}

public UserEntity getUserId() {
	return UserId;
}

public void setUserId(UserEntity userId) {
	UserId = userId;
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
}
