package com.insurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.Bill;
import com.insurance.repository.BillRepository;
import com.insurance.service.BillService;

@Service
public class BillServiceImpl implements BillService{

	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill saveBill(Bill bill) {  // use response entity
		Bill bill2 = billRepository.save(bill);
		return bill2;
	}

	@Override
	public Bill updateBill(Bill bill) {
		Bill bill2 = billRepository.save(bill);
		return bill2;
	}


	@Override
	public void deleteBill(Integer id) {
		billRepository.deleteById(id);
	}
	
	@Override
    public Optional<Bill> getBill(Integer id) {
        return billRepository.findById(id);
    }

}
