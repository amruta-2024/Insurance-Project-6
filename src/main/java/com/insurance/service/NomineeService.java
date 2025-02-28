package com.insurance.service;

import java.util.List;

import com.insurance.entity.Nominee;

public interface NomineeService {

	public List<Nominee> findByNomineeId(Integer id);

}
