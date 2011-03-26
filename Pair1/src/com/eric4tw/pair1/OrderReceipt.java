package com.eric4tw.pair1;

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
public class OrderReceipt {
	public List<Order> orders;

	public OrderReceipt(List<Order> orders) {
		this.orders = new ArrayList<Order>(orders);
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();
		output.append(headers());
		output.append(orders());
		output.append(salesTax());
		output.append(totalAmount());
		return output.toString();
	}

	private String totalAmount() {
		BigDecimal totalAmount = BigDecimal.ZERO;
		for (Order order : orders) {
			totalAmount = totalAmount.add(order.total());
		}
		return new StringBuilder().append("Total Amount").append('\t')
				.append(totalAmount).toString();
	}

	private String salesTax() {
		BigDecimal salesTax = BigDecimal.ZERO;
		for (Order order : orders) {
			salesTax = salesTax.add(order.salesTax());
		}
		return new StringBuilder().append("Sales Tax").append('\t')
				.append(salesTax).toString();
	}

	private String orders() {
		StringBuilder orderOutput = new StringBuilder();
		for (Order order : orders) {
			orderOutput.append(order.toString());
		}
		return orderOutput.toString();
	}

	private String headers() {
		return new StringBuilder().append("======Printing Orders======\n")
				.toString();
	}
}
