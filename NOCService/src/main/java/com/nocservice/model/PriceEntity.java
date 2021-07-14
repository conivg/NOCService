package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Price_Price")
public class PriceEntity {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "ServiceId")
	private ServiceEntity ServiceId;
	
	@Id
	private Integer line;
	
	@Column
	private Float percent;
	
	@Column
	private Integer start_date;
	
	@Column
	private Integer end_date;
	
	@Column
	private Float min_quantity;
	
	@Column
	private Float max_quantity;
	
	@Column
	private Integer creation_date;
	
	public ServiceEntity getServiceId() {
		return ServiceId;
	}

	public void setServiceId(ServiceEntity serviceId) {
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

	public Integer getActualization_date() {
		return actualization_date;
	}

	public void setActualization_date(Integer actualization_date) {
		this.actualization_date = actualization_date;
	}

	@Column
	private Integer actualization_date;
}
