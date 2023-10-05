package com.jsp.controller;

import com.jsp.dao.AdminDao;
import com.jsp.dto.AdminDto;
import com.jsp.service.AdminService;

public class InsertAdmin {

	public static void main(String[] args) {
	
		AdminDto adminDto = new AdminDto();
		adminDto.setName("A5");
		adminDto.setPassword(5555);
//		adminDto.setLibrarianDtos(null);
		AdminService adminService =  new AdminService();
				
       adminService.saveAdminData(adminDto);
		
       
	}

}
