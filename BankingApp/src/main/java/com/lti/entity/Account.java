package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_accounts")
@SequenceGenerator(name = "accSeq", initialValue = 589012367, allocationSize = 1)
public class Account {
	@Id
	@Column(name = "account_number")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accSeq")
	private long acccountNumber;

	@Column(name = "account_type")
	private AccountType accountType;
	@Column(name = "account_opening_date")
	private LocalDate accountOpeningDate;
	@Column(name = "account_balance")
	private long accountBalance;
	@Column(name = "account_ifsccode")
	private String ifscCode;
	@Column(name = "admin_approval_status")
	private String status;

	@OneToOne
	@JoinColumn(name = "customer_id")
	Customer customer;

	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
	InternetBanking internetBanking;

	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
	List<Beneficiary> beneficiaries;

	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
	List<Transaction> transactions;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getAcccountNumber() {
		return acccountNumber;
	}

	public void setAcccountNumber(long acccountNumber) {
		this.acccountNumber = acccountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public InternetBanking getInternetBanking() {
		return internetBanking;
	}

	public void setInternetBanking(InternetBanking internetBanking) {
		this.internetBanking = internetBanking;
	}

	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	

}

