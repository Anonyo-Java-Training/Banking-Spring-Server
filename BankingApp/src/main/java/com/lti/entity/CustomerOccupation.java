package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//branch 'master' of https://github.com/Anonyo-Java-Training/Bankning-project.git
@Entity
@Table(name="tbl_customer_occupation")
public class CustomerOccupation{

	@Id
	@SequenceGenerator(name="occuSeq", initialValue=1000001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="occuSeq")
	long customerOccupationId;
	
	@OneToOne
	@JoinColumn(name="customer_id")
	Customer customer;

	
	@Column(name="occupation_type")
	String occupationType;
	
	@Column(name="source_of_income")
	String sourceOfIncome;
	
	
	@Column(name="gross_annual_income")
	double grossAnnualIncome;
	

	public String getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	public String getSourceOfIncome() {
		return sourceOfIncome;
	}

	public void setSourceOfIncome(String sourceOfIncome) {
		this.sourceOfIncome = sourceOfIncome;
	}

	public double getGrossAnnualIncome() {
		return grossAnnualIncome;
	}

	public void setGrossAnnualIncome(double grossAnnualIncome) {
		this.grossAnnualIncome = grossAnnualIncome;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
