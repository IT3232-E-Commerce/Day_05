package com.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.model.Course;

@RestController
@RequestMapping("/course")
public class CourseController extends CRUDController<String, Course> {
	Course CS101 = new Course("CS101", "Introduction to Programming", 3);
	Course MATH201 = new Course("MATH201", "Calculus II", 4);
	Course ENG150 = new Course("ENG150", "Technical Writing", 2);

	public CourseController() {
		getObjects().put(CS101.getCid(), CS101);
		getObjects().put(MATH201.getCid(), MATH201);
		getObjects().put(ENG150.getCid(), ENG150);
	}
}
