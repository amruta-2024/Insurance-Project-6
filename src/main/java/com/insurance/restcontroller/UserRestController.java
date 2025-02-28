package com.insurance.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.Claim;
import com.insurance.entity.Nominee;
import com.insurance.entity.User;
import com.insurance.service.ClaimService;
import com.insurance.service.NomineeService;
import com.insurance.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ClaimService claimService;
	
	@Autowired
	private NomineeService nomineeService;
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable ("id") Integer id) {
		List<Claim> claims=claimService.findByClaimsId(id);
		List<Nominee> nominees = nomineeService.findByNomineeId(id);		
		User user=userService.getUserDetails(id);
		user.setClaimList(claims);
		user.setNomineeList(nominees);
		
		return user;
	}

}
