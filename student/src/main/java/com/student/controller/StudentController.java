package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.IBookService;
import com.student.service.IBookServiceFeign;

@RestController

@RequestMapping
public class StudentController {
	@Autowired
	IBookService bookService;
	@Autowired
	IBookServiceFeign bookServiceFeign;
	@GetMapping
	String getStudents(){
		return bookService.getBook();// "test";
	}
	@GetMapping("/feign")
	String getStudentsFeign(){
		return bookServiceFeign.getBook();// "test";
	}
	
}
