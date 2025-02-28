package com.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.entity.Nominee;


public interface NomineeRepository extends JpaRepository<Nominee, Integer> {
	
	public List<Nominee> findByUserId(int userId);


}

