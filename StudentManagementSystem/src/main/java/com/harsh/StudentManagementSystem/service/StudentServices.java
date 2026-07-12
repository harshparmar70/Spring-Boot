package com.harsh.StudentManagementSystem.service;

import com.harsh.StudentManagementSystem.entity.StudentEntities;
import com.harsh.StudentManagementSystem.repository.StudentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudentEntry(StudentEntities studentEntities){
        studentEntities.setDate(LocalDateTime.now());
        studentRepository.save(studentEntities);
    }

    public List<StudentEntities> getAll(){
        return studentRepository.findAll();
    }

    public StudentEntities findByid(ObjectId id){
        return studentRepository.findById(id).orElse(null);
    }
    public Void deleteById(ObjectId id){
        studentRepository.deleteById(id);
        return null;
    }

}
