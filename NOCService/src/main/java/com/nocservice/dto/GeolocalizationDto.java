package com.nocservice.dto;


public class GeolocalizationDto {

	private Integer code;

	private Integer GeoTId;

	private String name;

	private String description;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getGeoTId() {
		return GeoTId;
	}

	public void setGeoTId(Integer geoTId) {
		GeoTId = geoTId;
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
}
