package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StudentDto;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void saveStudent(StudentDto studentDto) {
		entityTransaction.begin();
		entityManager.persist(studentDto);
		entityTransaction.commit();
		
	}
	
	public void deleteStudentById(int id) {
	StudentDto studentDto =	entityManager.find(StudentDto.class, id);
	entityTransaction.begin();
	entityManager.remove(studentDto);
	entityTransaction.commit();
	}
	
	
	public void updateStudentById(int id ,String email) {
	StudentDto studentDto =	entityManager.find(StudentDto.class, id);
	studentDto.setEmail(email);
	entityTransaction.begin();
	entityManager.merge(studentDto);
	entityTransaction.commit();
	
	}
	
	public List<StudentDto> getAllStudent(StudentDto studentDto) {
		String sql = "SELECT s FROM StudentDto s ";
	Query query =	entityManager.createQuery(sql);
	List<StudentDto> studentDtos =	query.getResultList();
	
	for(StudentDto st :studentDtos) {
	System.out.println(st.getId());
	System.out.println(st.getName());
	System.out.println(st.getEmail());
	
	}
	return studentDtos;
	}
	
	public StudentDto getOneStudent(int id) {
	StudentDto studentDto =	entityManager.find(StudentDto.class, id);
	System.out.println(studentDto.getId());
	System.out.println(studentDto.getName());
	System.out.println(studentDto.getEmail());
	return studentDto;
	
	}
	
	//This method for requesting book 
	
	public StudentDto getOneStudent2(int id) {
		StudentDto studentDto =	entityManager.find(StudentDto.class, id);
		return studentDto;
		
		}
	
	
}
