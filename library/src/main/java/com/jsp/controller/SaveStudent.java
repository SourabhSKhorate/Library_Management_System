package com.jsp.controller;

import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;

public class SaveStudent {

	public static void main(String[] args) {
		
		StudentDto studentDto = new StudentDto();
		studentDto.setName("S4");
		studentDto.setEmail("s4@mail.com");
		
		StudentService studentService = new StudentService();
		studentService.saveStudent(studentDto);
		

	}

}
