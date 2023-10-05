package com.jsp.controller;

import com.jsp.service.AdminService;
import com.jsp.service.LibrarianService;

public class AproveLibrarian {

	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		
		adminService.updateStatusById(2, 4);
		
		
	}

}
