package com.lti.repository;

import java.util.List;

import com.lti.entity.Admin;


public interface AdminRepository {
	long save(Admin admin);
	List<Admin> findAll();
	long findByIdAndPassword(long adminId,String password);
	boolean isAdminPresent(long adminId);
	Admin findById(long id);

}
