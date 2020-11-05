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

@Entity
@Table(name = "tbl_internet_banking")
@SequenceGenerator(name = "intBankSeq", initialValue = 12345, allocationSize = 1)
public class InternetBanking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custSeq")
	@Column(name = "internet_banking_id")
	private long id;

	@Column(name = "internet_banking_password")
	private String password;

	@OneToOne
	@JoinColumn(name = "account_number")
	Account account;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
