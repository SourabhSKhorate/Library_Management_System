package com.jsp.controller;

import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;

public class GetAllStudent {

	public static void main(String[] args) {
		StudentDto studentDto = new StudentDto();
		StudentService studentService  = new StudentService();
		studentService.getAllStudent(studentDto);

	}

}
