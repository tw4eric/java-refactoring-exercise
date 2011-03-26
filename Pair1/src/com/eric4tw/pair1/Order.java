package com.eric4tw.pair1;

import java.math.BigDecimal;

public class Order {
	private String description;
	private BigDecimal price;
	private int quantity;

	public Order(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = BigDecimal.valueOf(price);
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(description).append('\t')
				.append(price).append('\t').append(quantity).append('\t')
				.append(price.multiply(BigDecimal.valueOf(quantity)))
				.toString();
	}

	public BigDecimal salesTax() {
		return price.multiply(BigDecimal.valueOf(quantity)).multiply(
				BigDecimal.valueOf(.10));
	}

	public BigDecimal totalAmount() {
		return price.multiply(BigDecimal.valueOf(quantity)).add(
				price.multiply(BigDecimal.valueOf(quantity)).multiply(
						BigDecimal.valueOf(.10)));
	}
}
