package com.example.firstproject.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject.components.PaymentsRetrieveService;
import com.example.firstproject.domain.Payment;
import com.example.firstproject.domain.RequestParams;

@RestController
public class PaymentRetrieveRestController {

	@Autowired
	private PaymentsRetrieveService pymtRetrieveService;
	
	
	@GetMapping(path = "/payments", produces = "application/json")
	public List<Payment> retrievePayments(@Valid RequestParams rp) {
		

		return pymtRetrieveService.getSortedResult(rp.getSortBy(), rp.getSortOrder(), rp.getOffset(), rp.getRowcount());


	}

}
