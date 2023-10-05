package com.jsp.controller;

import com.jsp.service.AdminService;

public class GetAllUnapprovedLibrarian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminService adminService = new AdminService();
		adminService.getAllUnothorisedLibrarian();
		
	}

}
