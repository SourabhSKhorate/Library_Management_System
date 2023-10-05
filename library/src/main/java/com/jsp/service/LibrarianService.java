package com.jsp.service;

import java.util.List;

import com.google.protobuf.UnsafeByteOperations;
import com.jsp.dao.BookDao;
import com.jsp.dao.LibraryDao;
import com.jsp.dao.StudentDao;
import com.jsp.dto.AdminDto;
import com.jsp.dto.BookDto;
import com.jsp.dto.LibrarianDto;
import com.jsp.dto.StudentDto;

public class LibrarianService {

	LibraryDao libraryDao = new LibraryDao();
	
	public void insertLibrarian(LibrarianDto librarianDto ) {
		librarianDto.setStatus("Unothorised");
		libraryDao.insertLibrarian(librarianDto);
	}
	
	public void updateLibrarian(int id ,String name) {
		libraryDao.updateLibrarian(id, name);
	}
	
	public void deleteLibrarianById(int id) {
		libraryDao.deleteLibrarianById(id);
	}
	
	public List<LibrarianDto> getAllLibrarian() {
		List<LibrarianDto>l= libraryDao.getAllLibrarian();
		return l;
	}
	
	public List<LibrarianDto> getAllUnapprovedLibrarian() {
		List<LibrarianDto>l =libraryDao.getAllUnapprovedLibrarian();
		return l;
	}
	
	
	
	public void getLibrarianById(int id) {
		libraryDao.getLibrarianById(id);
	}
	
	public boolean validateLibrarian(int id, String username ,String status) {
		LibrarianDto a=  libraryDao.getLibrarian(id);
		if(a!=null &&  a.getName().equals(username) && a.getStatus().equals(status)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//not in use!
	public void addBook(BookDto bookDto) {
		BookDao bookDao = new BookDao();
		bookDao.savebook(bookDto);
	}
	
	//not in use!
	public void removeBookById(int id) {
		BookDao bookDao = new BookDao();
		bookDao.deletebookById(id);
	}
	
	//not in use!
	BookDao bookDao = new BookDao();
	StudentDao studentDao = new StudentDao();
	
	
	//issue book
	
	public boolean issueBook(int bid ,int sid ,int lid ) {		
	BookDto bookDto =bookDao.getOnebook2(bid);
	StudentDto studentDto=	studentDao.getOneStudent2(sid);
	LibrarianDto librarianDto=	libraryDao.getLibrarian(lid);
                                              
	if(librarianDto!=null && bookDto !=null && studentDto != null ) {
		if(bookDto.getStatus().equalsIgnoreCase("Available")) {
			if(librarianDto.getStatus().equalsIgnoreCase("Othorised")) {
		bookDto.setStatus("Issued");
		bookDto.setStudentDto(studentDto);
		bookDto.setLibrarianDto(librarianDto);
		return bookDao.issueBook(bookDto);
		}else {
			System.out.println("Librarian is not authorised" );
		}
			
		}else {
			System.out.println("The book is isuued by student");
		}
	
	}	
	return false;
	}
	
	//Requst book
	public boolean requstBookByLibrarian(int bid ,int sid ) {		
		BookDto bookDto =bookDao.getOneBook2(bid);
	StudentDto studentDto=	studentDao.getOneStudent2(sid);
	
	if( bookDto !=null && studentDto != null) {
		if(bookDto.getStatus().equalsIgnoreCase("Available")) {
			
		bookDto.setStatus("Request");
		bookDto.setStudentDto(studentDto);
		return bookDao.requestBook(bookDto);
			
		}
	else {
		System.out.println("Book is requested by student");
	}
	}
	return false;
	}
	
	//Return book
	
	public boolean returnBookById(int bid) {
	BookDto bookDto = bookDao.getOneBook2(bid);
	if(bookDto!=null && bookDto.getStatus().equalsIgnoreCase("Issued") || bookDto.getStatus().equalsIgnoreCase("Request")) {
		StudentDto studentDto = bookDto.getStudentDto();
	LibrarianDto librarianDto =	bookDto.getLibrarianDto();
	
	if(studentDto!= null && librarianDto!=null) {
		bookDto.setStatus("Available");
		bookDto.setLibrarianDto(null);
		bookDto.setStudentDto(null);
		return bookDao.returnBookById(bookDto);
	}
	}
	return false;
	}


	
	

}
