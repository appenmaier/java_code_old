package exams.shoppingcart;

import java.util.ArrayList;

/**
 * Einkaufsportal
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record ShoppingPortal(String user, ArrayList<Product> products,
    ShoppingCart<Product> shoppingCart) {

  public void addProductToShoppingCart(Product product, int amount) {
    shoppingCart.addItem(product, amount);
  }

  public void clearShoppingCart() {
    for (int i = 0; i < shoppingCart.items().size(); i++) {
      shoppingCart.items().remove(i);
    }
  }

  public void removeProductFromShoppingCart(Product product) {
    shoppingCart.removeItem(product);
  }

}
