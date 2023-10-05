package com.jsp.controller;

import com.jsp.dto.BookDto;
import com.jsp.service.BookService;

public class GetOneBook {

	public static void main(String[] args) {
		
		BookDto bookDto = new BookDto();
		BookService bookService = new BookService();
		bookService.getOneBook(1);

	}

}
