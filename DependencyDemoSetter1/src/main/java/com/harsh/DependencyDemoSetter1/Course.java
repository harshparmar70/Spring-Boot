package com.harsh.DependencyDemoSetter1;

import org.springframework.stereotype.Component;

@Component
public class Course {

    private String courseName = "Spring Framework";

    @Override
    public String toString() {
        return courseName;
    }
}