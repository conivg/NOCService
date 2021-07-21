package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Taxes_Taxes")
public class TaxesEntity {
	
	@Id
	private Integer code;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "TaxesTId")
	private TaxesTypeEntity TaxesTId;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private Float percent;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public TaxesTypeEntity getTaxesTId() {
		return TaxesTId;
	}

	public void setTaxesTId(TaxesTypeEntity taxesTId) {
		TaxesTId = taxesTId;
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
