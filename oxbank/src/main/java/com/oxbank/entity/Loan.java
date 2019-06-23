package com.oxbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_Details")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int loanId;
	public long loanAccountNumber;
	public String securityAddress;
	public String loanStatus;
	public long loanAmount;
	public int approvingManagerId;
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(long loanAccountNumber, String securityAddress, String loanStatus, long loanAmount,
			int approvingManagerId) {
		super();
		this.loanAccountNumber = loanAccountNumber;
		this.securityAddress = securityAddress;
		this.loanStatus = loanStatus;
		this.loanAmount = loanAmount;
		this.approvingManagerId = approvingManagerId;
		this.loanId = loanId;
		
	}
	
	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	public String getSecurityAddress() {
		return securityAddress;
	}
	public void setSecurityAddress(String securityAddress) {
		this.securityAddress = securityAddress;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getApprovingManagerId() {
		return approvingManagerId;
	}
	public void setApprovingManagerId(int approvingManagerId) {
		this.approvingManagerId = approvingManagerId;
	}
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	@Override
	public String toString() {
		return "Loan [loanAccountNumber=" + loanAccountNumber + ", securityAddress=" + securityAddress + ", loanStatus="
				+ loanStatus + ", loanAmount=" + loanAmount + ", approvingManagerId=" + approvingManagerId + ", ]";
	}
	
	
	
	
	

}
