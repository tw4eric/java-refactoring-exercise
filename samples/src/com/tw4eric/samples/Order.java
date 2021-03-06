package com.tw4eric.samples;

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

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(description);
		output.append('\t');
		output.append(price);
		output.append('\t');
		output.append(quantity);
		output.append('\t');
		output.append(price.multiply(BigDecimal.valueOf(quantity)));
		output.append('\n');
		return output.toString();
	}
}
