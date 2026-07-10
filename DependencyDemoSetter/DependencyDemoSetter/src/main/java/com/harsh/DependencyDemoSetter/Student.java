package com.harsh.DependencyDemoSetter;

public class Student {

    private String studentName;
    private Course course;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{studentName=" + studentName +
                ", course=" + course + "}";
    }
}