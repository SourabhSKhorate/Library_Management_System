package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dao.LibraryDao;
import com.jsp.dto.AdminDto;
import com.jsp.dto.LibrarianDto;

public class AdminService {

	AdminDao adminDao = new AdminDao();
 
	public AdminDto saveAdminData(AdminDto adminDto) {
		return adminDao.saveAdminData(adminDto);
	}
	
	public boolean validateAdmin(int id, String username ,int password) {
		AdminDto a = adminDao.getAdmin(id);
			if(a!= null && a.getName().equals(username) && a.getPassword() == password) {
				return true ;
				
		}else {
			return false;
		}
	}
	
	public void  updateAdminName(int id ,String name) {
		adminDao.updateAdminName(id, name);
	}
	
	public void  updateAdminPassword(int id ,int  password) {
		adminDao.updateAdminPassword(id, password);
	}
	
	public void deleteAdminById(int id) {
		
		adminDao.deleteAdminById(id);
	}
	
	public void getAllAdmin(AdminDto adminDto) {
		adminDao.getAllAdmin(adminDto);
	}
	
	 LibraryDao libraryDao = new LibraryDao();
	 
	 public LibrarianDto updateStatusById(int libid ,int adminid) {
		LibrarianDto librarianDto = libraryDao.getLibrarian(libid);
		 AdminDto adminDto = adminDao.getAdmin(adminid);
		 
		 if(adminDto!=null && librarianDto !=null) {
			 if(librarianDto.getStatus().equalsIgnoreCase("Unothorised")) {
			 librarianDto.setStatus("Othorised");
			 librarianDto.setAdminDto(adminDto);
		 }
		 else {
			 System.out.println("It is allready othorised");
		 }
		 }
		return libraryDao.approve(librarianDto);
	 }
	 
	 
	//get unaproved librarian 	
		public void getAllUnothorisedLibrarian(){
			LibrarianService librarianService = new LibrarianService();
		List<LibrarianDto> dtos =	librarianService.getAllUnapprovedLibrarian();
		for(LibrarianDto dto: dtos) {
			if(dto.getStatus().equals("Unothorised")) {
			System.out.println(dto.getId());
			System.out.println(dto.getName());
			System.out.println(dto.getStatus());
			}
					
		}
		
		}
		
		
	
}