package com.example.firstproject.repository;

import com.example.firstproject.domain.Payment;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentsRepo extends MongoRepository<Payment, String> {

public List<Payment> findByOrderByDebitAccountCountryAsc();
public List<Payment> findByOrderByDebitAccountCountryDesc();
}
