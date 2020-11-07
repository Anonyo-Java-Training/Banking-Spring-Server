package com.lti.service;

import com.lti.entity.Admin;

public interface AdminService {
	
Admin login(long adminId,String password);
void update(Admin admin);


}
