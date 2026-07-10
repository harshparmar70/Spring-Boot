package com.example.DependencyDemoConstructor1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
    private String studentName;
    private String studentCourse;


    public Student(
            @Value("John") String studentName,
            @Value("Spring Framework") String studentCourse) {

        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "Student{studentName=" + studentName +
                ", studentCourse=" + studentCourse + "}";
    }
}
