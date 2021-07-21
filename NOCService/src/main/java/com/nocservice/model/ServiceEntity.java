package com.nocservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Servi_Service")
public class ServiceEntity {

	@Id
	private Integer code;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ServiceTId")
	private ServiceTypeEntity ServiceTId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "UserId")
	private UserEntity UserId;

	@Column
	private String idSucursal;

	@Column
	private String name;

	@Column
	private String description;

	@Column
	private String address;

	@Column
	private Integer postalCode;

	@Column
	private Float price;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CountryId")
	private GeolocalizationEntity CountryId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "StateId")
	private GeolocalizationEntity StateId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MunicipalityId")
	private GeolocalizationEntity MunicipalityId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CityId")
	private GeolocalizationEntity CityId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SuburbId")
	private GeolocalizationEntity SuburbId;

//lista de caracteristicas

}
