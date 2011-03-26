package com.eric4tw.pair1;

import static junit.framework.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrderReceiptTest {
	@Test
	public void printReceiptPrintsHeader() throws Exception {
		List<Order> orders = new ArrayList<Order>();
		OrderReceipt orderReceipt = new OrderReceipt(orders);
		String output = orderReceipt.printReceipt();
		assertTrue(output.startsWith("======Printing Orders======"));
	}

	@Test
	public void printReceiptPrintsOrderDetails() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("Milk", 10.0, 2));
		OrderReceipt orderReceipt = new OrderReceipt(orders);
		String output = orderReceipt.printReceipt();
		System.out.println(output);
		assertTrue(output.contains("Milk\t10.0\t2\t20.0"));
	}

	@Test
	public void printReceiptPrintsTotalSalesTax() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("Milk", 10.0, 2));
		orders.add(new Order("Chocolate", 20.0, 1));
		OrderReceipt orderReceipt = new OrderReceipt(orders);
		String output = orderReceipt.printReceipt();
		System.out.println(output);
		assertTrue(output.contains("Sales Tax\t4.0"));
	}

	@Test
	public void printReceiptPrintsTotalAmount() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("Milk", 10.0, 2));
		orders.add(new Order("Chocolate", 20.0, 1));
		OrderReceipt orderReceipt = new OrderReceipt(orders);
		String output = orderReceipt.printReceipt();
		System.out.println(output);
		assertTrue(output.contains("Total Amount\t44.0"));
	}
}
