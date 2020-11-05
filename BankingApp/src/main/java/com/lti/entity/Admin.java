package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_admins")
public class Admin {
	
	@Id
	@SequenceGenerator(name="adminSeq", initialValue=50000, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="adminSeq")
	@Column(name="admin_id")
	long adminId;
	
	@Column(name="admin_name")
	String adminName;
	
	@Column(name="admin_password")
	String adminPassword;

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
