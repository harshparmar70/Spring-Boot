package com.harsh.DependencyDemoSetter;

public class Course {
    private String  courseName;
    public void  setCourseName(String courseName){
        this.courseName =courseName;
    }
    @Override
    public  String toString(){
        return courseName;
    }
}
