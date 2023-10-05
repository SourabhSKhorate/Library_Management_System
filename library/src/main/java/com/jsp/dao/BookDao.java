package com.jsp.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.BookDto;



public class BookDao {


	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void savebook(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.persist(bookDto);
		entityTransaction.commit();
		
	}
	
	public void deletebookById(int id) {
	BookDto bookDto =	entityManager.find(BookDto.class, id);
	entityTransaction.begin();
	entityManager.remove(bookDto);
	entityTransaction.commit();
	}
	
	
	public void updatebookById(int id ,String author) {
	BookDto bookDto =	entityManager.find(BookDto.class, id);
	bookDto.setAuthor(author);
	entityTransaction.begin();
	entityManager.merge(bookDto);
	entityTransaction.commit();
	
	}
	
	public BookDto updateStetusById(int id ,String stetus) {
	BookDto bookDto =	entityManager.find(BookDto.class, id);
	bookDto.setStatus(stetus);
	entityTransaction.begin();
	entityManager.merge(bookDto);
	entityTransaction.commit();
	return bookDto;
	                                                       
	}
	
	
	public List<BookDto> getAllbook(BookDto bookDto) {
		String sql = "SELECT s FROM BookDto s ";
	Query query =	entityManager.createQuery(sql);
	List<BookDto> bookDtos =	query.getResultList();
	
	for(BookDto bk :bookDtos) {
	System.out.println(bk.getBook_id());
	System.out.println(bk.getBook_name());
	System.out.println(bk.getAuthor());
	
	}
	return bookDtos;
	}
	
	
	public BookDto getOnebook(int id) {
	BookDto bookDto =	entityManager.find(BookDto.class, id);
	System.out.println(bookDto.getBook_id());
	System.out.println(bookDto.getBook_name());
	System.out.println(bookDto.getAuthor());
	return bookDto;
	
	}
	
	//to not show all information with while issuing book 
	public BookDto getOnebook2(int id) {
		BookDto bookDto =	entityManager.find(BookDto.class, id);
		return bookDto;
		}
		
	//this method is used for request book
	public BookDto getOneBook2(int id) {
		BookDto bookDto =	entityManager.find(BookDto.class, id);
		return bookDto;
		
		}
	
	
	public boolean issueBook(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.merge(bookDto);
		entityTransaction.commit();
		return true;
	
	}
	
	public boolean requestBook(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.merge(bookDto);
		entityTransaction.commit();
		return true;
	
	}
	
	public boolean returnBookById(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.merge(bookDto);
		entityTransaction.commit();
		return true;
	}
	
}
