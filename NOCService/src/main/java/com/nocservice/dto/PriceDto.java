package com.nocservice.dto;

public class PriceDto {
	
	private Integer ServiceId;
	
	private Integer line;
	
	private Float percent;
	
	private Integer start_date;
	
	private Integer end_date;
	
	private Float min_quantity;
	
	private Float max_quantity;
	
	private Integer creation_date;

	public Integer getServiceId() {
		return ServiceId;
	}

	public void setServiceId(Integer serviceId) {
		ServiceId = serviceId;
	}

	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public Float getPercent() {
		return percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}

	public Integer getStart_date() {
		return start_date;
	}

	public void setStart_date(Integer start_date) {
		this.start_date = start_date;
	}

	public Integer getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Integer end_date) {
		this.end_date = end_date;
	}

	public Float getMin_quantity() {
		return min_quantity;
	}

	public void setMin_quantity(Float min_quantity) {
		this.min_quantity = min_quantity;
	}

	public Float getMax_quantity() {
		return max_quantity;
	}

	public void setMax_quantity(Float max_quantity) {
		this.max_quantity = max_quantity;
	}

	public Integer getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Integer creation_date) {
		this.creation_date = creation_date;
	}
}
