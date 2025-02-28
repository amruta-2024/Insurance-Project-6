package com.insurance.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Clients")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userCity;
	private int userAge;
	
	@OneToMany(mappedBy = "userId")  // one to many mapping
	private List<Claim> claimList;  // list of claims from Claims

	
	@OneToMany(mappedBy = "userId")  // one to many mapping
	private List<Nominee> nomineeList;


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserFirstName() {
		return userFirstName;
	}


	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}


	public String getUserLastName() {
		return userLastName;
	}


	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserCity() {
		return userCity;
	}


	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	public List<Claim> getClaimList() {
		return claimList;
	}


	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}


	public List<Nominee> getNomineeList() {
		return nomineeList;
	}


	public void setNomineeList(List<Nominee> nomineeList) {
		this.nomineeList = nomineeList;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userCity=" + userCity + ", userAge=" + userAge + ", claimList="
				+ claimList + ", nomineeList=" + nomineeList + "]";
	}
	
	
}
