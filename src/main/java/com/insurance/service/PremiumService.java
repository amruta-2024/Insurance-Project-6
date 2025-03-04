package com.insurance.service;

import java.util.List;

import com.insurance.entity.PremiumDetails;

public interface PremiumService {

	public void deletePremiumDetails(Long id);

	//Task-843-Design-Api-to-get-all-the-premium-details-from-database
	List<PremiumDetails> getAllPremiumDetails();

}
