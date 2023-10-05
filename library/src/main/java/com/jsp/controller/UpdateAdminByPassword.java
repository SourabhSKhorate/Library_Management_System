package com.jsp.controller;

import com.jsp.service.AdminService;

public class UpdateAdminByPassword {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		adminService.updateAdminPassword(2, 0000);

	}

}
