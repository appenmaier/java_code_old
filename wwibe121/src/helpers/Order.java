package helpers;

import java.util.ArrayList;

/**
 * Bestellung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Order {

	/*
	 * Attribute
	 */
	private ArrayList<OrderItem> orderItems;

	/*
	 * Konstruktoren
	 */
	public Order() {
		orderItems = new ArrayList<>();
	}

	/*
	 * Methoden
	 */
	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}

	public OrderItem getOrderItem(int index) {
		return orderItems.get(index);
	}

	/*
	 * Innere Klassen
	 */
	/**
	 * Bestellposition
	 * 
	 * @author Daniel Appenmaier
	 * @version 1.0
	 *
	 */
	public class OrderItem {

	}

}
