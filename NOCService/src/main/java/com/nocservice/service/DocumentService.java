package com.nocservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nocservice.model.DocumentEntity;
import com.nocservice.repository.DocumentsRepository;

@Service
public class DocumentService {

	@Autowired
	DocumentsRepository documentsRepository;
	
	
	public DocumentEntity getDocument(Integer id) {
		return documentsRepository.findById(id).orElse(null);
	}
	
	public List<DocumentEntity> getAllDocuments() {
		return documentsRepository.findAll();
	}
}

