package com.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {
	
	public List<Claim> findByUserId(int userId);


}
