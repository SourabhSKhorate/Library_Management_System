package com.jsp.controller;

import com.jsp.dto.LibrarianDto;
import com.jsp.service.LibrarianService;

public class deleteILIbrarian {

	public static void main(String[] args) {
		
		LibrarianService librarianService =  new LibrarianService();
		librarianService.deleteLibrarianById(1);
		
	}

}
