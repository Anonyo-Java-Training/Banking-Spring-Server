package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lti.entity.Admin;
import com.lti.exception.AdminServiceException;
import com.lti.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;
	@Override
	public Admin login(long adminId, String password) {
		try {
			
            if(!adminRepo.isAdminPresent(adminId)) {
            	
            	throw new AdminServiceException("Customer not registered!");
            }
                
           long id = adminRepo.findByIdAndPassword(adminId, password);
           
            Admin admin = adminRepo.findById(id);
            return admin;
        }
        catch(EmptyResultDataAccessException e) {
            throw new AdminServiceException("Incorrect adminId/password");
        }
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub

	}


}
