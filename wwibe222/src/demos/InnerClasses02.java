package demos;

import demos.order.Order;
import demos.order.Order.OrderItem;

/**
 * Mitgliedsklassen
 * 
 * @author Daniel Appenmaier
 *
 */
public class InnerClasses02 {

  public static void main(String[] args) {

    Order order = new Order();
    OrderItem orderItem = order.new OrderItem();
    orderItem.description = "Bestellposition 1";
    order.orderItems.add(orderItem);

  }

}
