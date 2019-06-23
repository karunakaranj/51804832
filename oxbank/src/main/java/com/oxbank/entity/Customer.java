package com.oxbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_Details")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int customerId;
	public String name;
	public long mobile;
	public int age;
	public String gender;
	public String maritalStatus;
	public int creditScore;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, long mobile, int age, String gender, String maritalStatus, int creditScore) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.creditScore = creditScore;
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int loanId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + ", age=" + age + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", creditScore=" + creditScore + " customerId=" +customerId +"]";
	}
	
	

}
