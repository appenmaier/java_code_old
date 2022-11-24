package cashiersystem;

/**
 * Warenkorbeintrag
 * 
 * @author Daniel Appenmaier
 *
 */
public class ShoppingCartItem {

  /* Attribute */
  Product product;
  int amount;

  /* Methode */
  double getSubTotalPrice() {
    return product.price * amount;
  }

  void printShoppingCartItem() {
    product.printProduct();
    System.out.print(amount + ", " + getSubTotalPrice() + " Euro");
  }

}
