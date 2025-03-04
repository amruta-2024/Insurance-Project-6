package com.insurance.service;

import java.util.Optional;

import com.insurance.entity.Bill;

public interface BillService {

	public Bill saveBill(Bill bill);
	
	public Bill updateBill(Bill bill);
	
	public Optional<Bill> getBill(Integer id);
	
	public void deleteBill(Integer id);
}
