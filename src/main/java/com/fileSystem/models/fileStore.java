package com.fileSystem.models;

import javax.websocket.Decoder.Binary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fileStore")
public class fileStore {
    @Id
    private String id;
     
    private String name;
         
    private org.bson.types.Binary data;
    

	public fileStore(String name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public org.bson.types.Binary getData() {
		return data;
	}

	public void setData(org.bson.types.Binary binary) {
		this.data = binary;
	}

	    
}
