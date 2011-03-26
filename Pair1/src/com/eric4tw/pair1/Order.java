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
				.append(orderAmount()).append('\n').toString();
	}

	private BigDecimal orderAmount() {
		return price.multiply(BigDecimal.valueOf(quantity));
	}

	public BigDecimal salesTax() {
		return orderAmount().multiply(BigDecimal.valueOf(.10));
	}

	public BigDecimal total() {
		return orderAmount().add(salesTax());
	}
}
