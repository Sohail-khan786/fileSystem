package com.fileSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fileSystem.models.directory;


@Repository
public interface fileSytemRepository extends MongoRepository<directory, String> {

}
