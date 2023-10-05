package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BookDto {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int book_id;
	private String book_name;
	private String author;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@OneToOne
	private StudentDto studentDto;
	@OneToOne
	private LibrarianDto librarianDto;
	
	
	public LibrarianDto getLibrarianDto() {
		return librarianDto;
	}
	public void setLibrarianDto(LibrarianDto librarianDto) {
		this.librarianDto = librarianDto;
	}
	
	
	public StudentDto getStudentDto() {
		return studentDto;
	}
	public void setStudentDto(StudentDto studentDto) {
		this.studentDto = studentDto;
	}
	
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}

