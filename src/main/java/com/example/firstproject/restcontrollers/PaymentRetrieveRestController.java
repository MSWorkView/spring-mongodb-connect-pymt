package com.example.firstproject.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject.domain.Payment;
import com.example.firstproject.repository.PaymentsRepo;

@RestController
public class PaymentRetrieveRestController {

	@Autowired
	private PaymentsRepo repository;

	@GetMapping(path = "/payments", produces = "application/json")
	public List<Payment> createPayment(@RequestParam("sortBy") String sortBy,
			@RequestParam("sortOrder") String sortOrder) {
		
		if (StringUtils.isNotBlank(sortBy) && StringUtils.isNotBlank(sortOrder)) {
			List<Payment> pymts = new ArrayList();
			switch (sortBy + sortOrder) {
			case "debitAccountCountryasc":
				pymts.addAll(repository.findByOrderByDebitAccountCountryAsc());
				break;

			case "debitAccountCountrydesc":
				pymts.addAll(repository.findByOrderByDebitAccountCountryDesc());
				break;
			default:
				pymts = repository.findAll();
				break;
			}
			// List<Payment> pymts=repository.findAll();
			return pymts;
		} else {

			List<Payment> pymts = repository.findAll();
			return pymts;
		}

	}

}
