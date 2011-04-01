package com.tw4eric.samples;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderReceipt prints the details of order including description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual orders +
 * total sales tax) and prints it.
 * 
 * @author amiruddinnagri
 * 
 */
public class OrderReceipt2 {
	public List<Order> orders;

	public OrderReceipt2(List<Order> orders) {
		this.orders = new ArrayList<Order>(orders);
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();
		output.append("======Printing Orders======\n");

		for (Order order : orders) {
			output.append(order.toString());
		}

		BigDecimal salesTax = new BigDecimal("0");
		for (Order order : orders) {
			salesTax = salesTax.add(order.getPrice()
					.multiply(BigDecimal.valueOf(order.getQuantity()))
					.multiply(BigDecimal.valueOf(.10)));
		}
		output.append("Sales Tax").append('\t').append(salesTax);

		BigDecimal totalAmount = new BigDecimal(0.0);
		for (Order order : orders) {
			totalAmount = totalAmount.add(order
					.getPrice()
					.multiply(BigDecimal.valueOf(order.getQuantity()))
					.add(order.getPrice()
							.multiply(BigDecimal.valueOf(order.getQuantity()))
							.multiply(BigDecimal.valueOf(.10))));
		}
		output.append("Total Amount").append('\t').append(totalAmount);

		return output.toString();
	}

}
