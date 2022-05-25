package com.sbi.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="account_info")
public class Account {

	@Id
	@Column(name="account_number")
	int acctNo;
	
	@Column(name="account_holder_name")
	String acctName;
	
	@Column(name="mailid")
	String mailId;
	
	@Column(name="account_balance")
	int accBal;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
													//IMPORTANT*****
	@OneToMany(mappedBy="account", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	 List<Payee> payeeList;

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getAccBal() {
		return accBal;
	}

	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Payee> getPayeeList() {
		return payeeList;
	}

	public void setPayeeList(List<Payee> payeeList) {
		this.payeeList = payeeList;
	}
	
	
	
	
	
	
}
