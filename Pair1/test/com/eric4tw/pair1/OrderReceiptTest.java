package com.eric4tw.pair1;

import static junit.framework.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OrderReceiptTest {
	private List<Order> orders;

	@Before
	public void setUp() {
		orders = new ArrayList<Order>();
		orders.add(new Order("Milk", 10.0, 2));
		orders.add(new Order("Chocolate", 20.0, 1));
	}

	@Test
	public void printReceiptPrintsHeader() throws Exception {
		OrderReceipt orderReceipt = new OrderReceipt(orders);
		String output = orderReceipt.printReceipt();
		assertTrue(output.startsWith("======Printing Orders======="));
	}

	@Test
	public void printReceiptPrintsOrderDetails() {
		assertReceiptContains("Milk\t10.0\t2\t20.0");
	}

	@Test
	public void printReceiptPrintsTotalSalesTax() {
		assertReceiptContains("Sales Tax\t4.0");
	}

	@Test
	public void printReceiptPrintsTotalAmount() {
		assertReceiptContains("Total Amount\t44.0");
	}

	private void assertReceiptContains(String expectedText) {
		OrderReceipt orderReceipt = new OrderReceipt(orders);
		String output = orderReceipt.printReceipt();
		assertTrue(output.contains(expectedText));
	}
}
