package com.jsp.controller;

import com.jsp.dao.AdminDao;
import com.jsp.dto.AdminDto;
import com.jsp.service.AdminService;

public class DeleteAdmin {

	public static void main(String[] args) {
	
		AdminService adminService = new AdminService();
		adminService.deleteAdminById(1);
		
	}

}
