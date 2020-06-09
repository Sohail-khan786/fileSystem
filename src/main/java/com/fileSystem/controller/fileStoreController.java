package com.fileSystem.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fileSystem.models.directory;
import com.fileSystem.models.fileStore;
import com.fileSystem.models.fileToSend;
import com.fileSystem.service.fileStoreService;

@RestController
public class fileStoreController {
	
	@Autowired
	private fileStoreService fileStoreDataService;
	
	@GetMapping(value="/getAllFiles")
	public List<fileStore> getAllFiles() {
		return fileStoreDataService.getAllFiles();
	}
	
	@PostMapping("/addFile")
	public String addFile(@RequestParam("name") String name, 
			  @RequestParam("data") MultipartFile fileData) throws IOException {
		return fileStoreDataService.addFile(name, fileData);
		
	}
	
	@GetMapping("/getFile/{id}")
	public fileToSend getFile(@PathVariable String id , Model model) {
		
		fileStore singleFile = fileStoreDataService.getFile(id);
	    
	    fileToSend outputFile = new fileToSend();
	    outputFile.setName(singleFile.getName());
	    outputFile.setDataString(Base64.getEncoder().encodeToString(singleFile.getData().getData()));
	    
	  
	   
	    return outputFile;
	}
	
	@PostMapping("/removeFile/{id}")
	public String removeFile(@PathVariable String id)  {
		return fileStoreDataService.removeFile(id);
		
	}

}
