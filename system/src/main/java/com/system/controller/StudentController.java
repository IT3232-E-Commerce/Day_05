package com.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController extends CRUDController<String, Student> {
	Student Bob = new Student("1", "Bob Marley", 23, "IT", 3.2);
	Student James = new Student("2", "James Bond", 24, "IT", 2.2);
	Student Donald = new Student("3", "Donald Trump", 25, "IT", 1.2);

	public StudentController() {
		getObjects().put(Bob.getRegNo(), Bob);
		getObjects().put(James.getRegNo(), James);
		getObjects().put(Donald.getRegNo(), Donald);
	}
}
