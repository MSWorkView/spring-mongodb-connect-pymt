package com.example.firstproject.requestdomain;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RequestParams {

	@NotBlank(message = "sortBy field is missing")
	private String sortBy;
	@NotBlank(message = "sortOrder field is missing")
	private String sortOrder;
	@Size(min=1, max=36, message = "check length of searchCriteria")
	private String searchCriteria;
	@Size(min=1, max=36, message = "check length of searchByTransactionId")
	private String searchByTransactionId;
	@DecimalMin(value = "0.0", inclusive = true)
    @Digits(integer=15, fraction=3)
	private BigDecimal  amountMin;
	@DecimalMin(value = "0.0", inclusive = true)
    @Digits(integer=15, fraction=3)
	private BigDecimal  amountMax;
	private String paymentDateMin;
	private String paymentDateMax;
	@NotNull
	private Integer offset;
	@NotNull
	@Min(1)
	@Max(100)
	private Integer rowcount;
	public String getSortBy() {
		return sortBy;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getSearchCriteria() {
		return searchCriteria;
	}
	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	public String getSearchByTransactionId() {
		return searchByTransactionId;
	}
	public void setSearchByTransactionId(String searchByTransactionId) {
		this.searchByTransactionId = searchByTransactionId;
	}
	
	public BigDecimal getAmountMin() {
		return amountMin;
	}
	public void setAmountMin(BigDecimal amountMin) {
		this.amountMin = amountMin;
	}
	public BigDecimal getAmountMax() {
		return amountMax;
	}
	public void setAmountMax(BigDecimal amountMax) {
		this.amountMax = amountMax;
	}
	public String getPaymentDateMin() {
		return paymentDateMin;
	}
	public void setPaymentDateMin(String paymentDateMin) {
		this.paymentDateMin = paymentDateMin;
	}
	public String getPaymentDateMax() {
		return paymentDateMax;
	}
	public void setPaymentDateMax(String paymentDateMax) {
		this.paymentDateMax = paymentDateMax;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getRowcount() {
		return rowcount;
	}
	public void setRowcount(Integer rowcount) {
		this.rowcount = rowcount;
	}
	
	
	
	
}
