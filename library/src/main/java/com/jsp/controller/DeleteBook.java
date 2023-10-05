package com.jsp.controller;

import com.jsp.dto.BookDto;
import com.jsp.service.BookService;

public class DeleteBook {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		bookService.deletebookById(2);

	}

}
