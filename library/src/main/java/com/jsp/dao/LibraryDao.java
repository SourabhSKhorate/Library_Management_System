package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.AdminDto;
import com.jsp.dto.BookDto;
import com.jsp.dto.LibrarianDto;

public class LibraryDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void insertLibrarian(LibrarianDto librarianDto ) {
		librarianDto.getId();
		librarianDto.getName();
		librarianDto.getStatus();
		
		entityTransaction.begin();
		entityManager.persist(librarianDto);
		entityTransaction.commit();
		
	}
	
	
	public void updateLibrarian(int id ,String name) {
	LibrarianDto  librarianDto =	entityManager.find(LibrarianDto.class ,id);
	librarianDto.setName(name);

		entityTransaction.begin();
		entityManager.merge(librarianDto);
		entityTransaction.commit();
		
	
	}
	
	public void deleteLibrarianById(int id) {
		LibrarianDto librarianDto =	entityManager.find(LibrarianDto.class ,id);
			entityTransaction.begin();
			entityManager.remove(librarianDto);
			entityTransaction.commit();
			
		}
		
		public List<LibrarianDto> getAllLibrarian() {
			String sql ="SELECT l FROM LibrarianDto l";
			Query query = entityManager.createQuery(sql);
			List<LibrarianDto> l=  query.getResultList();
			
			for(LibrarianDto librarian :l) {
				System.out.println(librarian.getName());
				System.out.println(librarian.getId());
				System.out.println(librarian.getStatus());
				System.out.println(librarian.getAdminDto());
				System.out.println("================");
			}
			return l;
	
			
		}
		
		public List<LibrarianDto> getAllUnapprovedLibrarian() {
			String sql ="SELECT l FROM LibrarianDto l";
			Query query = entityManager.createQuery(sql);
			List<LibrarianDto> l=  query.getResultList();
			return l;
			
			
		}
		
		
		public LibrarianDto  getLibrarian(int id){
		return 	entityManager.find(LibrarianDto.class, id);
		
		}
		
		public void getLibrarianById(int id) {
		LibrarianDto librarianDto=	entityManager.find(LibrarianDto.class, id);
		System.out.println(librarianDto.getId());
		System.out.println(librarianDto.getName());
		System.out.println(librarianDto.getStatus());
		System.out.println(librarianDto.getStatus());
		
		}
		
		
		public LibrarianDto approve(LibrarianDto librarianDto) {
			entityTransaction.begin();
			entityManager.merge(librarianDto);
			entityTransaction.commit();
			return librarianDto;
			
		}		
		
		
}

