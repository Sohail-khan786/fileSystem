package com.fileSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.fileSystem.models.directory;
import com.fileSystem.service.fileSystemService;


@RestController
public class fileSystemController {
	
	@Autowired
	private fileSystemService fsService;
	
	@GetMapping(value="/getDirectory")
	public directory getDirectory() {
		return fsService.getDirectory();
	}
	
	@PostMapping("/updateDirectory")
	public String updateDirectory(@RequestBody directory root) {
		return fsService.updateDirectory(root);
		
	}

}
