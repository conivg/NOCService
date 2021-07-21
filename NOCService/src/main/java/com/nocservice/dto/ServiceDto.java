package com.nocservice.dto;

public class ServiceDto {
	
	private Integer code;

	private Integer serviceTId;

	private Integer UserId;

	private String idSucursal;

	private String name;

	private String description;

	private String address;

	private Integer postalCode;

	private Float price;

	private Integer CountryId;

	private Integer StateId;

	private Integer MunicipalityId;

	private Integer CityId;

	private Integer SuburbId;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getServiceTId() {
		return serviceTId;
	}

	public void setServiceTId(Integer serviceTId) {
		this.serviceTId = serviceTId;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(String idSucursal) {
		this.idSucursal = idSucursal;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getCountryId() {
		return CountryId;
	}

	public void setCountryId(Integer countryId) {
		CountryId = countryId;
	}

	public Integer getStateId() {
		return StateId;
	}

	public void setStateId(Integer stateId) {
		StateId = stateId;
	}

	public Integer getMunicipalityId() {
		return MunicipalityId;
	}

	public void setMunicipalityId(Integer municipalityId) {
		MunicipalityId = municipalityId;
	}

	public Integer getCityId() {
		return CityId;
	}

	public void setCityId(Integer cityId) {
		CityId = cityId;
	}

	public Integer getSuburbId() {
		return SuburbId;
	}

	public void setSuburbId(Integer suburbId) {
		SuburbId = suburbId;
	}
	
}
