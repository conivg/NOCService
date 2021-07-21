package com.nocservice.dto;

public class DocumentDto {

	private Integer code;

	private Integer docTId;

	private Integer userId;

	private Integer date;

	private Integer hour;

	private Integer statusId;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getDocTId() {
		return docTId;
	}

	public void setDocTId(Integer docTId) {
		this.docTId = docTId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Override
	public String toString() {
		return "DocumentDto [code=" + code + ", docTId=" + docTId + ", userId=" + userId + ", date=" + date + ", hour="
				+ hour + ", statusId=" + statusId + "]";
	}

}
