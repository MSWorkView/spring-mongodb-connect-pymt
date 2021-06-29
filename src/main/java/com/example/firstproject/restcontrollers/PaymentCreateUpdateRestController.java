package com.example.firstproject.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject.domain.Payment;
import com.example.firstproject.domain.PymtRequest;
import com.example.firstproject.repository.PaymentsRepo;

@RestController
public class PaymentCreateUpdateRestController {

	@Autowired
	private PaymentsRepo repository;

	
	@PostMapping(path = "/payments", consumes = "application/json", produces = "application/json")
	public List<Payment> createPayment(@RequestBody PymtRequest pymtRequest) {
		
		repository.deleteAll();
		List<Payment> pymts= pymtRequest.getPymts();
		if(null!=pymts) {
			List<Payment> pymtsResult= repository.saveAll(pymts);
			System.out.println(pymtsResult.size());
		}
		

		
		return pymts;
	}

}
