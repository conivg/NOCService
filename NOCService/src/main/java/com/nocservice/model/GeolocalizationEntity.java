package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Geolo_Geolocalization")
public class GeolocalizationEntity {

	@Id
	private Integer code;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "GeoTId")
	private GeolocalizationTypeEntity GeoTId;
	
	@Column
	private String name;
	
	@Column
	private String description;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public GeolocalizationTypeEntity getGeoTId() {
		return GeoTId;
	}

	public void setGeoTId(GeolocalizationTypeEntity geoTId) {
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
