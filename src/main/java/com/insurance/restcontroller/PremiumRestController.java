package com.insurance.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.PremiumDetails;
import com.insurance.service.PremiumService;

@RestController
public class PremiumRestController {

	@Autowired
	private PremiumService premiumService;

	@DeleteMapping("/deletePremiumDetailsById/{id}")
	public ResponseEntity<?> deletePremiumDetailsById(@PathVariable("id") Long id) {
		try {
			premiumService.deletePremiumDetails(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			// Proper logging instead of stack trace
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while deleting the premium details.");
		}
	}

	//Task-843-Design-Api-to-get-all-the-premium-details-from-database
	@GetMapping("/getAllPremiumDetails")
	public ResponseEntity<List<PremiumDetails>> getAllPremiumDetails() {
		List<PremiumDetails> allPremiumDetails = premiumService.getAllPremiumDetails();
		if (allPremiumDetails.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<PremiumDetails>>(allPremiumDetails, HttpStatus.OK);
		}
	}

}
