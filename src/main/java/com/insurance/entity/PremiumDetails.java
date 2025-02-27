package com.insurance.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//844 Design API to delete premium details into database

@Entity
@Table(name="Premium_details")
public class PremiumDetails {

	@Id
	@GeneratedValue
	private Long premiumId;
	private Double premiumAmount;
	private String username;
	private LocalDate premiumStartDate;
	private LocalDate premiumEndDate;
	private String premiumType;
	private Double price;
	
	
	

	public PremiumDetails() {
		
	}

	public PremiumDetails(Long premiumId, Double premiumAmount, String username, LocalDate premiumStartDate,
			LocalDate premiumEndDate, String premiumType, Double price) {

		this.premiumId = premiumId;
		this.premiumAmount = premiumAmount;
		this.username = username;
		this.premiumStartDate = premiumStartDate;
		this.premiumEndDate = premiumEndDate;
		this.premiumType = premiumType;
		this.price = price;
	}

	public Long getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(Long premiumId) {
		this.premiumId = premiumId;
	}

	public Double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getPremiumStartDate() {
		return premiumStartDate;
	}

	public void setPremiumStartDate(LocalDate premiumStartDate) {
		this.premiumStartDate = premiumStartDate;
	}

	public LocalDate getPremiumEndDate() {
		return premiumEndDate;
	}

	public void setPremiumEndDate(LocalDate premiumEndDate) {
		this.premiumEndDate = premiumEndDate;
	}

	public String getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PremiumDetails [premiumId=" + premiumId + ", premiumAmount=" + premiumAmount + ", username=" + username
				+ ", premiumStartDate=" + premiumStartDate + ", premiumEndDate=" + premiumEndDate + ", premiumType="
				+ premiumType + ", price=" + price + "]";
	}

}
