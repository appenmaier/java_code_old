package demos;

import helpers.Order;
import helpers.Order.OrderItem;

/**
 * Elementklassen (Member Classes)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InnerClasses02 {

	public static void main(String[] args) {

		Order order = new Order();

		OrderItem orderItem = order.new OrderItem();
		order.addOrderItem(orderItem);

	}

}
