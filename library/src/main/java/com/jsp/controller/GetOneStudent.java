package com.jsp.controller;

import com.jsp.service.StudentService;

public class GetOneStudent {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		studentService.getOneStudent(1);
	}

}
