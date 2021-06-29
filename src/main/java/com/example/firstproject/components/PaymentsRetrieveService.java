package com.example.firstproject.components;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.firstproject.repository.PaymentsRepo;
import com.example.firstproject.domain.Payment;
import com.example.firstproject.domain.RequestParams;

@Service
public class PaymentsRetrieveService {

	@Autowired
	private PaymentsRepo repository;

	public List<Payment> getSortedResult(String sortBy, String sortOrder,Integer offset,Integer rowcount) {
		List<Payment> pymts = new ArrayList();
		Pageable pageable = PageRequest.of(offset, rowcount);
		switch (sortBy + sortOrder) {
		case "debitAccountCountryasc":
			pymts.addAll(repository.findByOrderByDebitAccountCountryAsc(pageable));
			break;

		case "debitAccountCountrydesc":
			pymts.addAll(repository.findByOrderByDebitAccountCountryDesc(pageable));
			break;
		default:
			pymts = repository.findAll();
			break;
		}
		// List<Payment> pymts=repository.findAll();
		return pymts;
	}

	public List<Payment> getFilterResult(RequestParams requestParams) {
		List<Payment> pymts = new ArrayList();
		return pymts;
	}

}
