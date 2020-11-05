package com.lti.entity;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_customers")
public class Customer {
	@Id
	@SequenceGenerator(name="custSeq", initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="custSeq")
	@Column(name="customer_id")
	long customerId;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="middle_name")
	String middleName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="father_name")
	String fatherName;
	
	@Column(name="customer_email_id")
	String customerEmailId;
	
	@Column(name="mobile_number")
	String mobileNumber;
	
	@Column(name="date_of_birth")
	LocalDate dateOfBirth;
	
	@Column(name="aadhar_number")
	String aadharNumber;
	
	@Column(name="customer_password")
	String customerPassword;
	
	@Column(name="admin_approval_status")
	String status;

	@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	CustomerAddress address;
	
	@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	CustomerOccupation occupation;
	
	@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	Account account; 

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	public CustomerOccupation getOccupation() {
		return occupation;
	}

	public void setOccupation(CustomerOccupation occupation) {
		this.occupation = occupation;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

