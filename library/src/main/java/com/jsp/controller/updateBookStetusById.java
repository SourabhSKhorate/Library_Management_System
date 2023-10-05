package com.jsp.controller;

import com.jsp.service.BookService;

public class updateBookStetusById {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		bookService.updateStetusById(1, "Issued");

	}

}
