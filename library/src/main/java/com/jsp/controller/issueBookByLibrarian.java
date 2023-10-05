package com.jsp.controller;

import com.jsp.dto.BookDto;
import com.jsp.service.LibrarianService;


public class issueBookByLibrarian {

	public static void main(String[] args) {
	
		LibrarianService  librarianService = new  LibrarianService();
//		int bid ,int sid ,int lid   <-sequence
		boolean a=	librarianService.issueBook(2, 1, 1);
		
		System.out.println(a);
	}

}

