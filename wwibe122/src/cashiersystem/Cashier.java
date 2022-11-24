package cashiersystem;

/**
 * Kassierer:in
 * 
 * @author Daniel Appenmaier
 *
 */
public class Cashier {

  /* Attribute */
  int cashierId;
  String fullName;

  /* Methoden */
  void printCashier() {
    System.out.print(cashierId + ": " + fullName);
  }

}
