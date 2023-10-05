package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class GetOneLibrarianById {

	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		librarianService.getLibrarianById(1);

	}

}
