package com.fileSystem.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "directory")
public class directory {
	
	@Id
	private String id;
	private folder root;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public folder getRoot() {
		return root;
	}
	public void setRoot(folder root) {
		this.root = root;
	}
	
	

}
