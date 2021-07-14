package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Featu_Feature")
public class FeatureEntity {

@Id
private Integer line;

@Column
private String value;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name= "FeatureTId")
private FeatureTypeEntity FeatureTId;

public Integer getLine() {
	return line;
}

public void setLine(Integer line) {
	this.line = line;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

public FeatureTypeEntity getFeatureTId() {
	return FeatureTId;
}

public void setFeatureTId(FeatureTypeEntity featureTId) {
	FeatureTId = featureTId;
}

//id servicio pero lo dudo segun yo va la caracteristica en el servicio
}
