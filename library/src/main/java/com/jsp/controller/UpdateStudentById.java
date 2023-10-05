package com.jsp.controller;

import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;

public class UpdateStudentById {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		studentService.updateStudentById(2, "ABC@mail.com");
		

	}

}
