package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.PremiumDetails;
import com.insurance.repository.PremiumRepository;
import com.insurance.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public void deletePremiumDetails(Long id) {

		System.out.println("From the service class..");
		premiumRepository.deleteById(id);

	}

}
