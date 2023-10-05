package com.jsp.controller;

import com.jsp.dao.AdminDao;
import com.jsp.service.AdminService;

public class ValidateAdmin {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		boolean b =adminService.validateAdmin(1, "A1" , 1111);
		System.out.println(b);
	}

}
