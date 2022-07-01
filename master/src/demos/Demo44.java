package demos;

import helpers.Order;
import helpers.Order.OrderItem;

/**
 * Elementklassen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo44 {

	public static void main(String[] args) {

		Order order = new Order();

//		OrderItem orderItem = new OrderItem("Brot", 1, 2.49);
		OrderItem orderItem = order.new OrderItem("Brot", 1, 2.49);
		order.addOrderItem(orderItem);

	}

}
