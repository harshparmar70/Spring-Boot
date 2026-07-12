//package com.harsh.StudentManagementSystem.controller;
//
//import com.harsh.StudentManagementSystem.entity.StudentEntities;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//@RestController
//@RequestMapping("/student_detail")
//public class StudentConrollerDemo {
//
//    HashMap<Integer,StudentEntities> studentEntitiesHashMap = new HashMap<>();
//
//
//    @GetMapping //http://localhost:8080/student_detail
//    public List<StudentEntities> getall(){
//        return new ArrayList<>(studentEntitiesHashMap.values());
//    }
//
//    @PostMapping  //http://localhost:8080/student_detail
//    public boolean  createStudent(@RequestBody StudentEntities studentEntities ){
//        studentEntitiesHashMap.put(studentEntities.getStudentId(),studentEntities);
//        return true;
//    }
//
//    @GetMapping("{stdId}") //http://localhost:8080/student_detail
//    public StudentEntities getbyId(@PathVariable int stdId){
//        return studentEntitiesHashMap.get(stdId);
//    }
//
//    @DeleteMapping("{stdId}")
//    public StudentEntities deleteStudent(@PathVariable int stdId){
//        return studentEntitiesHashMap.remove(stdId);
//    }
//
//    @PutMapping("{stdId}")
//    public StudentEntities updateStudent(@PathVariable int stdId , @RequestBody StudentEntities studentEntities){
//        return studentEntitiesHashMap.put(stdId,studentEntities);
//    }
//}
