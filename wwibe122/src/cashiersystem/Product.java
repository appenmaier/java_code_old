package cashiersystem;

/**
 * Produkt
 * 
 * @author Daniel Appenmaier
 *
 */
public class Product {

  /* Attribute */
  int productId;
  String description;
  double price;

  /* Methoden */
  void printProduct() {
    System.out.print(productId + ", " + description + ", " + price + " Euro");
  }

}
