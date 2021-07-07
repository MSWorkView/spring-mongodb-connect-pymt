package com.example.firstproject.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="payment")
public class Payment {

	private String debitAccountCountry;
	private String debitAccountNumber;
	private String bankCode;
	private Double amount;
	private String currency;
	private List<Payee> payees;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfPayment;
	@JsonProperty("transactionId")
	private String uniqE2ETxnRef;
	
	public Payment() {
		this.uniqE2ETxnRef = UUID.randomUUID().toString();
	}

	public String getDebitAccountCountry() {
		return debitAccountCountry;
	}

	public void setDebitAccountCountry(String debitAccountCountry) {
		this.debitAccountCountry = debitAccountCountry;
	}

	public String getDebitAccountNumber() {
		return debitAccountNumber;
	}

	public void setDebitAccountNumber(String debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public Payment(String debitAccountCountry, String debitAccountNumber, String bankCode, Double amount,
			Date dateOfPayment,List<Payee> payees,String transactionId) {
		this.debitAccountCountry = debitAccountCountry;
		this.debitAccountNumber = debitAccountNumber;
		this.bankCode = bankCode;
		this.amount = amount;
		this.dateOfPayment = dateOfPayment;
		this.payees=payees;
		this.uniqE2ETxnRef=transactionId;
	}
	@Override
	public String toString() {
		StringBuilder toStringValue = new StringBuilder("Debit account ")
				.append(this.debitAccountCountry)
				.append(" transaction reference number ")
				.append(this.uniqE2ETxnRef)
				.append(" debit account number ")
				.append(this.debitAccountNumber)
				.append(" date of payment ")
				.append(this.dateOfPayment);
		return toStringValue.toString();
	}

	public List<Payee> getPayees() {
		return payees;
	}

	public void setPayees(List<Payee> payees) {
		this.payees = payees;
	}

	public String getUniqE2ETxnRef() {
		return uniqE2ETxnRef;
	}

	public void setUniqE2ETxnRef(String uniqE2ETxnRef) {
		this.uniqE2ETxnRef = uniqE2ETxnRef;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	

}
