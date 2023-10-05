package com.jsp.controller;

import com.jsp.dto.BookDto;
import com.jsp.service.BookService;
import com.jsp.service.StudentService;

public class saveBook {

	public static void main(String[] args) {
		
	BookDto bookDto = new BookDto();
	bookDto.setBook_name("B5");
	bookDto.setAuthor("Au5");
	bookDto.setStatus("Available");
	
	BookService bookService = new BookService();
	bookService.savebook(bookDto);
	
	}

}
