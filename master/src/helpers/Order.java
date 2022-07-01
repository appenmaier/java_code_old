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
	/**
	 * Elemente
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

		/*
		 * Attribute
		 */
		private String article;
		private int amount;
		private double price;

		/*
		 * Konstruktoren
		 */
		public OrderItem(String article, int amount, double price) {
			this.article = article;
			this.amount = amount;
			this.price = price;
		}

		/*
		 * Setter und Getter
		 */
		public String getArticle() {
			return article;
		}

		public int getAmount() {
			return amount;
		}

		public double getPrice() {
			return price;
		}

	}

}
