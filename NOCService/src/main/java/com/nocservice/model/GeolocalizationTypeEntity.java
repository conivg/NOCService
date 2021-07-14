package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Geoty_Geolocalizationtype")
public class GeolocalizationTypeEntity {


@Id
private Integer code;

@Column
private String name;

@Column
private String Description;

public Integer getCode() {
	return code;
}

public void setCode(Integer code) {
	this.code = code;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}
}
