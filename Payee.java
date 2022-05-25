package com.sbi.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="payee")

public class Payee {
	
    @Id
    @Column(name="payee_id")  
	int payeeId;
    
    @Column(name="payee_account_number")   
	int payeeAcctNo;
    
    @Column(name="payee_name")   
	String payeeName;
	
    @Column(name="payee_nick_name")   
    String PayeeNickName;
    
    @Column(name="payee_limit")   
	int payeeLimit;
    
    @ManyToOne
	@JoinColumn(name="account_number")
	Account account;

	public int getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(int payeeId) {
		this.payeeId = payeeId;
	}

	public int getPayeeAcctNo() {
		return payeeAcctNo;
	}

	public void setPayeeAcctNo(int payeeAcctNo) {
		this.payeeAcctNo = payeeAcctNo;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeNickName() {
		return PayeeNickName;
	}

	public void setPayeeNickName(String payeeNickName) {
		PayeeNickName = payeeNickName;
	}

	public int getPayeeLimit() {
		return payeeLimit;
	}

	public void setPayeeLimit(int payeeLimit) {
		this.payeeLimit = payeeLimit;
	}

	@JsonIgnore//IMPORTANT******
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
    
    
	
}
