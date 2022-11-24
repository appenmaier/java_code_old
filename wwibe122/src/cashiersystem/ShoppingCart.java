package cashiersystem;

import java.util.ArrayList;

/**
 * Warenkorb
 * 
 * @author Daniel Appenmaier
 *
 */
public class ShoppingCart {

  /* Attribute */
  Cashier cashier;
  ArrayList<ShoppingCartItem> shoppingCartItems = new ArrayList<>();

  /* Methoden */
  void createShoppingCartItem(Product product, int amount) {
    ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
    shoppingCartItem.product = product;
    shoppingCartItem.amount = amount;
    shoppingCartItems.add(shoppingCartItem);
  }

  double getTotalPrice() {
    double total = 0;
    for (int i = 0; i < shoppingCartItems.size(); i++) {
      ShoppingCartItem shoppingCartItem = shoppingCartItems.get(i);
      total += shoppingCartItem.getSubTotalPrice();
    }
    return total;
  }

  void printShoppingCart() {
    for (int i = 0; i < shoppingCartItems.size(); i++) {
      ShoppingCartItem shoppingCartItem = shoppingCartItems.get(i);
      shoppingCartItem.printShoppingCartItem();
      System.out.println();
    }
    System.out.println("Gesamtbetrag: " + getTotalPrice());
  }

}
