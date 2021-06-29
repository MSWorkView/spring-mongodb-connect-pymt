package com.example.firstproject.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class Payment {

	private String debitAccountCountry;
	private String debitAccountNumber;
	private String bankCode;
	private Double amount;
	private List<Payee> payees;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfPayment;

	
	
	
	public Payment() {
		
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
			Date dateOfPayment,List<Payee> payees) {
		this.debitAccountCountry = debitAccountCountry;
		this.debitAccountNumber = debitAccountNumber;
		this.bankCode = bankCode;
		this.amount = amount;
		this.dateOfPayment = dateOfPayment;
		this.payees=payees;
	}
	@Override
	public String toString() {
		StringBuilder toStringValue = new StringBuilder("Debit account ")
				.append(this.debitAccountCountry)
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

}
