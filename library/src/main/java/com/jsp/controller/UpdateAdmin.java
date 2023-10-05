package com.jsp.controller;

import com.jsp.dto.AdminDto;
import com.jsp.service.AdminService;

public class UpdateAdmin {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		adminService.updateAdminName(1, "mayur");
	}

}
