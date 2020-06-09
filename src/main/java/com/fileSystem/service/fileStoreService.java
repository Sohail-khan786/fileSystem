package com.fileSystem.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fileSystem.models.directory;
import com.fileSystem.models.fileStore;
import com.fileSystem.repository.fileStoreRepository;

@Service
public class fileStoreService {
	

	@Autowired
    private fileStoreRepository storeRepo;
	
	public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
	
	public String addFile(String name, MultipartFile file) throws IOException { 
		
		
		fileStore singleFile = new fileStore(name); 
		singleFile.setData(new Binary(BsonBinarySubType.BINARY, file.getBytes())); 
		singleFile.setId(generateString());
		
		
		singleFile = storeRepo.insert(singleFile); 
		
		return "File Stored with ID : " + singleFile.getId(); 
    }
	
	public fileStore getFile(String id) { 
        return storeRepo.findById(id).get(); 
    }

	public List<fileStore> getAllFiles() {
		
		return storeRepo.findAll();
	}

	public String removeFile(String id) {
		
		storeRepo.deleteById(id);
		return "File Removed from file store";
	}

	
}
