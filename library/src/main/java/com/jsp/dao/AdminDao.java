package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.controller.UpdateAdmin;
import com.jsp.dto.AdminDto;
import com.jsp.dto.LibrarianDto;



public class AdminDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public AdminDto saveAdminData(AdminDto adminDto) {
		
		adminDto.getId();
		adminDto.getName();
		adminDto.getPassword();
		
		entityTransaction.begin();
		entityManager.persist(adminDto);
		entityTransaction.commit();
		
		return adminDto;
	}
	
	public AdminDto getAdmin(int id) {
		return entityManager.find(AdminDto.class, id);
	}
	
	public void  updateAdminName(int id ,String name) {
		
	AdminDto adminDto=	entityManager.find(AdminDto.class, id);
	adminDto.setName(name);
		entityTransaction.begin();
		entityManager.merge(adminDto);
		entityTransaction.commit();
		
	}
	
	public void  updateAdminPassword(int id ,int password) {
		
		AdminDto adminDto=	entityManager.find(AdminDto.class, id);
		adminDto.setPassword(password);
			entityTransaction.begin();
			entityManager.merge(adminDto);
			entityTransaction.commit();
			
		}
	
	public void deleteAdminById(int id) {
	AdminDto adminDto =	entityManager.find(AdminDto.class ,id);
		entityTransaction.begin();
		entityManager.remove(adminDto);
		entityTransaction.commit();
		
	}
	
	public void getAllAdmin(AdminDto adminDto) {
		String sql ="SELECT a FROM AdminDto a";
		Query query = entityManager.createQuery(sql);
		List<AdminDto> a=  query.getResultList();
		
		for(AdminDto admin :a) {
			System.out.println(admin.getName());
			System.out.println(admin.getId());
			System.out.println("================");
		}
	}
	
	
	//Method for set status
	LibraryDao libraryDao = new LibraryDao();
	public LibrarianDto getLibrarian(LibrarianDto librarianDto) {
		return libraryDao.getLibrarian(1);
		
	}
	

	
	
	}


