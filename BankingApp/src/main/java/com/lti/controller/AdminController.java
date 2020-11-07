package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.AdminLoginDto;
import com.lti.dto.AdminLoginStatus;
import com.lti.dto.Status.StatusType;
import com.lti.entity.Admin;
import com.lti.exception.AdminServiceException;
import com.lti.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping(path="/adminlogin")
	public AdminLoginStatus login(@RequestBody AdminLoginDto loginDto) {
		try {
			//System.out.println("inside admin login");
	
			Admin admin = adminService.login(loginDto.getAdminId(), loginDto.getPassword());
			AdminLoginStatus loginStatus = new AdminLoginStatus();
			loginStatus.setStatus(StatusType.SUCCESS);
			System.out.println(loginStatus.getStatus());
			System.out.println(loginDto.getAdminId()+" "+loginDto.getPassword());
			loginStatus.setMessage("Login Successful!");
			loginStatus.setAdminId(admin.getAdminId());
			loginStatus.setName(admin.getAdminName());
			return loginStatus;
		}
		catch(AdminServiceException e) {
			AdminLoginStatus loginStatus = new AdminLoginStatus();
			loginStatus.setStatus(StatusType.FAILURE);
			System.out.println(loginStatus.getStatus());
			System.out.println(loginDto.getAdminId()+" @@"+loginDto.getPassword());

			loginStatus.setMessage(e.getMessage());
			return loginStatus;
		}
	}
	

}
