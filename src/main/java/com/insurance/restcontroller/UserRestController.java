package com.insurance.restcontroller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.Claim;
import com.insurance.entity.Nominee;
import com.insurance.entity.User;
import com.insurance.service.ClaimService;
import com.insurance.service.NomineeService;
import com.insurance.service.UserService;

@RestController
public class UserRestController {
	
	private final UserService userService;
	private final ClaimService claimService;
	private final NomineeService nomineeService;
	
	public UserRestController(UserService userService,ClaimService claimService,NomineeService nomineeService) {
		this.userService = userService;
		this.claimService = claimService;
		this.nomineeService = nomineeService;
		
	}
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private ClaimService claimService;
//	
//	@Autowired
//	private NomineeService nomineeService;
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable ("id") Integer id, @RequestParam(value="status", required = false, defaultValue = "") String status) {
		List<Claim> claims=claimService.findByClaimsId(id);
		List<Claim> userClaims=null;
		
		
		if(status.length()>0) {
			userClaims=claims.stream().filter(p-> p.getClaimStatus().equals(status.toUpperCase())).collect(Collectors.toList());
		} else {
			userClaims=claims;
		}
		
		List<Nominee> nominees = nomineeService.findByNomineeId(id);		
		User user=userService.getUserDetails(id);
		
		user.setClaimList(userClaims);
		user.setNomineeList(nominees);
		
		return ResponseEntity.ok(user);
	}

}
