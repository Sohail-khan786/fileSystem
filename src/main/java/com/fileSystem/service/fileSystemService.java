package com.fileSystem.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fileSystem.models.directory;
import com.fileSystem.repository.fileSytemRepository;

@Service
public class fileSystemService {
	
	public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
	
	@Autowired
	private fileSytemRepository fileSytemRepo;

	public directory getDirectory() {
		
		List<directory> directoryArray = fileSytemRepo.findAll();
		
		for(directory firstDirectory : directoryArray) {
			return  firstDirectory;
		}
		return null;
		
	}

	public String updateDirectory(directory root) {
		
		fileSytemRepo.save(root);
		return "Directory Updated";
	}

}
