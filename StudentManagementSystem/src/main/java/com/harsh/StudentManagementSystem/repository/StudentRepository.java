package com.harsh.StudentManagementSystem.repository;

import com.harsh.StudentManagementSystem.entity.StudentEntities;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentEntities, ObjectId> {

}
