package com.fileSystem.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class folder {

	private String name;
	private List<folder> folderList;
	private List<file> filesList;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<folder> getFolderList() {
		return folderList;
	}

	public void setFolderList(List<folder> folderList) {
		this.folderList = folderList;
	}

	public List<file> getFilesList() {
		return filesList;
	}

	public void setFilesList(List<file> filesList) {
		this.filesList = filesList;
	}

}
