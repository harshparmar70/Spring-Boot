package com.harsh.restapi2.repository;

import com.harsh.restapi2.entity.JornalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JornalEntryRepository extends MongoRepository<JornalEntry, ObjectId>{



}
