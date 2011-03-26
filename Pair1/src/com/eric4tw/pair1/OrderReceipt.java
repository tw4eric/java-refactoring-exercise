package com.eric4tw.pair1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderReceipt {
	public List<Order> orders;

	public OrderReceipt(List<Order> orders) {
		this.orders = new ArrayList<Order>(orders);
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();

		// print headers
		output.append("======Printing Orders======\n");

		// prints orders
		BigDecimal salesTax = BigDecimal.ZERO;
		BigDecimal totalAmount = BigDecimal.ZERO;
		for (Order order : orders) {
			output.append(order.toString()).append('\n');
			salesTax = salesTax.add(order.salesTax());
			totalAmount = totalAmount.add(order.totalAmount());
		}

		// print total sales tax
		output.append("Sales Tax").append('\t').append(salesTax);

		// print total amount
		output.append("Total Amount").append('\t').append(totalAmount);
		return output.toString();
	}
}
