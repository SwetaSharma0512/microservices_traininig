package com.currency.CurrencyCalculator;

import java.math.BigDecimal;



public class CurrencyCalculatorBean 

{

	private Long id;  
	 
	private String from;  
	
	private String to;  
	
	private BigDecimal ConversionMultiple;
	
	private BigDecimal quantity;  
	
	private BigDecimal totalCalculatedAmount;

	public CurrencyCalculatorBean() {
		// TODO Auto-generated constructor stub
	}

	public CurrencyCalculatorBean(Long id, String from, String to, BigDecimal ConversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.ConversionMultiple = ConversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return ConversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.ConversionMultiple = ConversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	} 
	
	
	
	
}
