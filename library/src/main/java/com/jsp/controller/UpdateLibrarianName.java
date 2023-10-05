package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class UpdateLibrarianName {

	public static void main(String[] args) {
		
		UpdateLibrarianName updateLibrarianName = new UpdateLibrarianName();
		LibrarianService librarianService = new LibrarianService();
		librarianService.updateLibrarian(1, "mayur");

	}

}
