package com.harsh.StudentManagementSystem.controller;

import com.harsh.StudentManagementSystem.entity.StudentEntities;
import com.harsh.StudentManagementSystem.service.StudentServices;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/student_detail")
public class StudentConroller {

    @Autowired
    private StudentServices studentServices;


    @GetMapping //http://localhost:8080/student_detail
    public List<StudentEntities> getall(){
        return studentServices.getAll();
    }

    @PostMapping  //http://localhost:8080/student_detail
    public StudentEntities  createStudent(@RequestBody StudentEntities studentEntities ){
        studentEntities.setDate(LocalDateTime.now());
        studentServices.saveStudentEntry(studentEntities);
        return studentEntities;
    }

    @GetMapping("{stdId}") //http://localhost:8080/student_detail
    public StudentEntities getbyId(@PathVariable ObjectId stdId){
        return studentServices.findByid(stdId);
    }


    @DeleteMapping("{stdId}")
    public boolean deleteStudent(@PathVariable ObjectId stdId){
         studentServices.deleteById(stdId);
         return true;
    }


    @PutMapping("{stdId}")
    public StudentEntities updateStudent(@PathVariable ObjectId stdId , @RequestBody StudentEntities newEntities){
        StudentEntities old =  studentServices.findByid(stdId);
        if(old != null){
            old.setFirstName(newEntities.getFirstName() !=null && ! newEntities.getFirstName().equals("") ? newEntities.getFirstName() : old.getFirstName() );
            old.setLastName(newEntities.getLastName() !=null && ! newEntities.getLastName().equals("") ? newEntities.getFirstName() : old.getFirstName() );
        }
        studentServices.saveStudentEntry(old);



        return old;
    }
}
