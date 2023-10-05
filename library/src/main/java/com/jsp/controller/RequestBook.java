package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class RequestBook {

	public static void main(String[] args) {
		
		
		LibrarianService librarianService = new LibrarianService();
//		int bid ,int sid   <-sequence
	boolean b=	librarianService.requstBookByLibrarian(3, 3);
System.out.println(b);
	}

}
