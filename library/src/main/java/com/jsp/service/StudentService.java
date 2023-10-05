package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.StudentDto;

public class StudentService {

	StudentDao studentDao  = new StudentDao();
	
	public void saveStudent(StudentDto studentDto) {
		studentDao.saveStudent(studentDto);
	}
	
	public void updateStudentById(int id ,String email) {
		studentDao.updateStudentById(id, email);
	}
	
	public void deleteStudentById(int id) {
		studentDao.deleteStudentById(id);
	}
	
	public List<StudentDto> getAllStudent(StudentDto studentDto) {
		return studentDao.getAllStudent(studentDto);
	}
	
	public void getOneStudent(int id) {
		studentDao.getOneStudent(id);
	}
}
