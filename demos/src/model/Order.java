package model;

import java.util.ArrayList;

/**
 * Bestellung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Order {

  public class OrderItem {

    public String description;

  }

  public ArrayList<OrderItem> orderItems;

}
