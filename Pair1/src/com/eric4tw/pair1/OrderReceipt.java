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

		// print headers
		output.append("======Printing Orders======\n");

		// print date, bill no, customer name

		// prints orders
		BigDecimal salesTax = new BigDecimal("0");
		BigDecimal totalAmount = new BigDecimal(0.0);
		for (Order order : orders) {
			output.append(order.getDescription());
			output.append('\t');
			output.append(order.getPrice());
			output.append('\t');
			output.append(order.getQuantity());
			output.append('\t');
			output.append(order.getPrice().multiply(
					BigDecimal.valueOf(order.getQuantity())));
			output.append('\n');

			// calculate sales tax @ rate of 10%
			salesTax = salesTax.add(order.getPrice()
					.multiply(BigDecimal.valueOf(order.getQuantity()))
					.multiply(BigDecimal.valueOf(.10)));

			// calculate total amount of order = price * quantity + 10 % sales
			// tax
			totalAmount = totalAmount.add(order
					.getPrice()
					.multiply(BigDecimal.valueOf(order.getQuantity()))
					.add(order.getPrice()
							.multiply(BigDecimal.valueOf(order.getQuantity()))
							.multiply(BigDecimal.valueOf(.10))));
		}

		// prints the state tax
		output.append("Sales Tax").append('\t').append(salesTax);

		// print total amount
		output.append("Total Amount").append('\t').append(totalAmount);
		return output.toString();
	}
}
