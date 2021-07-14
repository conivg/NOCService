package com.nocservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Favor_Favorite")
public class FavoriteEntity {

	@Id
	private Integer line;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "UserId")
	private UserEntity UserId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "ServiceId")
	private ServiceEntity ServiceId;
}
