package com.example.DependencyDemoConstructor;

public class Student {
    private String studentName;
    private int studentAge;

    public  Student(String studentName,int studentAge){
        this.studentAge=studentAge;
        this.studentName=studentName;
    }

    @Override
    public String toString(){
        return "student{studentName = "+this.studentName+" ,studentAge = "+this.studentAge+"}";
    }
}
