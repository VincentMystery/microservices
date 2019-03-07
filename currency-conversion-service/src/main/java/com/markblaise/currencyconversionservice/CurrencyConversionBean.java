package com.markblaise.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;
	
	public CurrencyConversionBean() { super(); }
	
	public CurrencyConversionBean(
			Long id, String from, String to, BigDecimal conversionMultiple
			, BigDecimal quantity, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = calculateTotal(quantity, conversionMultiple);
		this.port = port;
	}
	
	public Long getId() { return id; }
	
	public String getFrom() { return from; }
	
	public String getTo() { return to; }
	
	public BigDecimal getConversionMultiple() {	return conversionMultiple; }
	
	public BigDecimal getQuantity() { return quantity; }
	
	public BigDecimal getTotalCalculatedAmount() { return totalCalculatedAmount; }
	
	public int getPort() { return port; }

	public void setPort(int port) { this.port = port; }
	
	private BigDecimal calculateTotal(BigDecimal quantity, BigDecimal conversionMultiple) {
		return quantity.multiply(conversionMultiple);
	}
	
	
}
