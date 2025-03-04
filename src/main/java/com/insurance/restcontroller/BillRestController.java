package com.insurance.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.Bill;
import com.insurance.service.BillService;

@RestController
public class BillRestController {
	
	@Autowired
	private BillService billService;
	
	@PostMapping("/saveBill")
	public ResponseEntity<Bill> saveBill(@RequestBody Bill bill) {
		Bill bill2 = billService.saveBill(bill);
		return new ResponseEntity<>(bill2, HttpStatus.CREATED);
	}

	@PutMapping("/updateBill")
	public ResponseEntity<Bill> updateBill(@RequestBody Bill bill) {
		Bill bill2 = billService.updateBill(bill);	
		if(bill2 != null) {
			return new ResponseEntity<>(bill2, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deleteBill/{id}")
	public ResponseEntity<Void> deleteBill(@PathVariable("id") Integer id) {
		billService.deleteBill(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
	
	@GetMapping("/getBill/{id}")
    public ResponseEntity<Bill> getBill(@PathVariable Integer id) {
        Optional<Bill> bill = billService.getBill(id);
        return bill.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
