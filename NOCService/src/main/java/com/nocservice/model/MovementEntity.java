package com.nocservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MovementEntity {

	@Id
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)	
	@JoinColumn(name= "documentId")
	private DocumentEntity documentId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "StatusId")
	private StatusEntity statusId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DocumentEntity getDocumentId() {
		return documentId;
	}

	public void setDocumentId(DocumentEntity documentId) {
		this.documentId = documentId;
	}

	public StatusEntity getStatusId() {
		return statusId;
	}

	public void setStatusId(StatusEntity statusId) {
		this.statusId = statusId;
	}
}
