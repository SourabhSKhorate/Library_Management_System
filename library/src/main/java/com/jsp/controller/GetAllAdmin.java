package com.jsp.controller;

import com.jsp.dao.AdminDao;
import com.jsp.dto.AdminDto;
import com.jsp.service.AdminService;

public class GetAllAdmin {

	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		AdminDto adminDto = new AdminDto();
		
		adminService.getAllAdmin(adminDto);
		
	}

}
