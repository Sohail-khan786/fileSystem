package com.fileSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fileSystem.models.fileStore;

@Repository
public interface fileStoreRepository extends MongoRepository<fileStore, String> {

}
