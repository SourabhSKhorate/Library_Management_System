package com.jsp.controller;

import com.jsp.dto.LibrarianDto;
import com.jsp.service.LibrarianService;

public class InsertLibrarian {

	public static void main(String[] args) {
		
		LibrarianDto librarianDto = new LibrarianDto();
		librarianDto.setName("L5");
		librarianDto.setStatus("Unathorised");
		
		LibrarianService librarianService = new LibrarianService();
		librarianService.insertLibrarian(librarianDto);
		
	}

}
