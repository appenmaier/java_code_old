package cashiersystem;

import java.util.ArrayList;

/**
 * Kassensystem
 * 
 * @author Daniel Appenmaier
 *
 */
public class CashierSystem {

  /* Attribute */
  String nameOfSuperMarket;
  ArrayList<Cashier> cashiers = new ArrayList<>();
  ArrayList<Product> products = new ArrayList<>();
  ShoppingCart shoppingCart;
  String purchaseDate;
  Cashier loggedCashier;

  /* Methoden */
  void login(int cashierId) {
    for (int i = 0; i < cashiers.size(); i++) {
      Cashier cashier = cashiers.get(i);
      if (cashierId == cashier.cashierId) {
        loggedCashier = cashier;
      }
    }
  }

  void createShoppingCart() {
    shoppingCart = new ShoppingCart();
    shoppingCart.cashier = loggedCashier;
  }

  void addShoppingCartItem(int productId, int amount) {
    for (int i = 0; i < products.size(); i++) {
      Product product = products.get(i);
      if (productId == product.productId) {
        shoppingCart.createShoppingCartItem(product, amount);
      }
    }
  }

  void printBon() {
    System.out.println(nameOfSuperMarket);
    System.out.println(purchaseDate);
    loggedCashier.printCashier();
    System.out.println();
    shoppingCart.printShoppingCart();
  }

}
