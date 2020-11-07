package com.lti.BankingApp;

import org.junit.jupiter.api.Test;

import com.lti.entity.Admin;
import com.lti.repository.AdminRepository;
import com.lti.repository.AdminRepositoryImpl;

class AdminTest {
	AdminRepository repo=new AdminRepositoryImpl();

	@Test
	void test() {
		Admin admin=new Admin();
		admin.setAdminName("admin3");;
		admin.setAdminPassword("admin3");
		repo.save(admin);
		
	}

}
