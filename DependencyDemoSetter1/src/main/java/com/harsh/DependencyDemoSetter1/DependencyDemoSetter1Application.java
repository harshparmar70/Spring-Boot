package com.harsh.DependencyDemoSetter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyDemoSetter1Application {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(DependencyDemoSetter1Application.class, args);

		Student student = context.getBean(Student.class);
		System.out.println(student);
		student.StudentDetail();
	}

}
