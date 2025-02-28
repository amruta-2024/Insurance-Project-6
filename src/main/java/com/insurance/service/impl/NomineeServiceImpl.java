package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.Nominee;
import com.insurance.repository.NomineeRepository;
import com.insurance.service.NomineeService;

@Service
public class NomineeServiceImpl implements NomineeService {

	@Autowired
	private NomineeRepository nomineeRepository;
	
	@Override
	public List<Nominee> findByNomineeId(Integer id) {
		List<Nominee> nominees=nomineeRepository.findByUserId(id);
		return nominees;
	}
	
	

}
