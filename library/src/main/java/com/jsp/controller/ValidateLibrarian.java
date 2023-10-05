package com.jsp.controller;

import com.jsp.dao.LibraryDao;
import com.jsp.dto.LibrarianDto;
import com.jsp.service.LibrarianService;

public class ValidateLibrarian {

	public static void main(String[] args) {
	
		LibrarianService librarianService = new LibrarianService();
		 boolean b= librarianService.validateLibrarian(1, "Mayur", "Unothorised");
		System.out.println(b);
		
	}

}
