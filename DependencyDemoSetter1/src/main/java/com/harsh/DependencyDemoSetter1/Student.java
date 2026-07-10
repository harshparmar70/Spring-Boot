package com.harsh.DependencyDemoSetter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Course course;
    private String studentName;

    @Autowired
    public void setCourse(Course course) {
        this.course = course;
    }

    @Value("Harsh")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    @Override
    public String toString() {
        return "Student{course=" + course + "}";
    }

    public  void StudentDetail(){
        System.out.println("Student Detail : "+this.course +"\n Name : " + this.studentName);
    }
}