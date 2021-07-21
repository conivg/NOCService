package com.nocservice.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nocservice.dto.DocumentDto;
import com.nocservice.model.DocumentEntity;
import com.nocservice.repository.DocumentsRepository;

@Service
public class DocumentService {

	@Autowired
	DocumentsRepository documentsRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public DocumentEntity getDocument(Integer id) {
		return documentsRepository.findById(id).orElse(null);
	}
	
	public List<DocumentEntity> getAllDocuments() {
		return documentsRepository.findAll();
	}
	
	public ResponseEntity<Object> createDocument(DocumentDto documentDto){
		System.out.println(documentDto);
		DocumentEntity documentEntity = getDocument(documentDto.getCode());
		
		// check if already exists
		if (documentEntity == null) {
			documentEntity = modelMapper.map(documentDto, DocumentEntity.class);
			documentsRepository.save(documentEntity);
			return new ResponseEntity<>(documentEntity, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Document already exists", HttpStatus.CONFLICT);
		}
	}
}

