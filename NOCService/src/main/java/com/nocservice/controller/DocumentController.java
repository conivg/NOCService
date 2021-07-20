package com.nocservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nocservice.model.DocumentEntity;
import com.nocservice.service.DocumentService;

@RestController
@RequestMapping("${api.version}")
public class DocumentController {

	@Autowired
	private DocumentService documentService;

	@GetMapping(value = "/documents", produces = "application/json")
	public List<DocumentEntity> getAllDocuments() throws Exception {
		return documentService.getAllDocuments();
	}

	@GetMapping(value = "/document", produces = "application/json")
	public DocumentEntity getAllDocuments(@RequestParam(value = "id", required = true) Integer id) throws Exception {
		return documentService.getDocument(id);
	}

}