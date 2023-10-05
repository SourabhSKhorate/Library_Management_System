package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class ReturnBookToLibrarian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibrarianService librarianService = new LibrarianService();
		boolean b=	librarianService.returnBookById(2);
		System.out.println(b);
	}

}
