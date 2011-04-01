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
	
	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String toString() {
	
		StringBuilder output = new StringBuilder();
		output.append(getDescription());
		output.append('\t');
		output.append(getPrice());
		output.append('\t');
		output.append(getQuantity());
		output.append('\t');
		output.append(getPrice().multiply(
				BigDecimal.valueOf(getQuantity())));
		output.append('\n');
		return output.toString();
	}
}
