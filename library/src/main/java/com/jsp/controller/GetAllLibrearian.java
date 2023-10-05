package com.jsp.controller;

import com.jsp.dto.LibrarianDto;
import com.jsp.service.LibrarianService;

public class GetAllLibrearian {

	public static void main(String[] args) {
		LibrarianDto librarianDto = new LibrarianDto();
		
		LibrarianService librarianService = new LibrarianService();
		librarianService.getAllLibrarian();
		

	}

}
