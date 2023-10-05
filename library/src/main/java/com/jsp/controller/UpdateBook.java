package com.jsp.controller;

import com.jsp.service.BookService;
import com.jsp.service.StudentService;

public class UpdateBook {

	public static void main(String[] args) {
	
	BookService bookService = new BookService();
	bookService.updatebookById(1, "Jeevan");

	}

}
