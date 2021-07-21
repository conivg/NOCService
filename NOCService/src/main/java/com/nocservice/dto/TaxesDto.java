package com.nocservice.dto;

public class TaxesDto {

	private Integer code;

	private Integer taxesTId;

	private String name;

	private String description;

	private Float percent;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getTaxesTId() {
		return taxesTId;
	}

	public void setTaxesTId(Integer taxesTId) {
		this.taxesTId = taxesTId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPercent() {
		return percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}
}
