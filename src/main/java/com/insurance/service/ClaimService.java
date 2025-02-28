package com.insurance.service;

import java.util.List;

import com.insurance.entity.Claim;

public interface ClaimService {
	
	public List<Claim> findByClaimsId(Integer id);

}
