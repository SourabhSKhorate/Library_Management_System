package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dto.BookDto;


public class BookService {

	
		
		BookDao bookDao  = new BookDao();
		
		
		public void savebook(BookDto bookDto){
			bookDao.savebook(bookDto);
		}
		
		public void updatebookById(int id ,String author) {
			bookDao.updatebookById(id, author);
		}
		
		public void deletebookById(int id) {
			bookDao.deletebookById(id);
		}
		
		public List<BookDto> getAllBook(BookDto bookDto) {
			return bookDao.getAllbook(bookDto);
		}
		
		public void getOneBook(int id) {
			bookDao.getOnebook(id);
		}
		
		public void updateStetusById(int id ,String stetus) {
			bookDao.updateStetusById(id, stetus);
		}
	
}
