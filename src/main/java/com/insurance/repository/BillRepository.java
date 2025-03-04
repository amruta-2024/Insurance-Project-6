package com.insurance.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.entity.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer>{ // use Integer
	
}
