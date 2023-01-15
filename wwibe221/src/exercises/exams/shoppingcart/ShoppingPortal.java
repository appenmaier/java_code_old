package exercises.exams.shoppingcart;

import java.util.ArrayList;

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
