package com.nocservice.model;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MovementEntity {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "documentId")
	private DocumentEntity documentId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "StatusId")
	private StatusEntity statusId;
}
