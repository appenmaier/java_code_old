package cashiersystem;

import java.util.Scanner;

/**
 * Kassensystem
 * 
 * @author Daniel Appenmaier
 */
public class MainClass {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    /* Daten: Kasse */
    CashierSystem cashierSystem = new CashierSystem();
    cashierSystem.nameOfSuperMarket = "Tante Emma Laden Ravensburg";
    cashierSystem.purchaseDate = "24.11.2022";

    /* Daten: Kassierer:innen */
    Cashier cashier = new Cashier();
    cashier.cashierId = 1;
    cashier.fullName = "Herr Hans Maier";
    cashierSystem.cashiers.add(cashier);

    Cashier cashier2 = new Cashier();
    cashier2.cashierId = 2;
    cashier2.fullName = "Herr Peter Mueller";
    cashierSystem.cashiers.add(cashier2);

    Cashier cashier3 = new Cashier();
    cashier3.cashierId = 3;
    cashier3.fullName = "Frau Lisa Schmidt";
    cashierSystem.cashiers.add(cashier3);

    /* Daten: Produkte */
    Product product = new Product();
    product.productId = 101;
    product.description = "Brot";
    product.price = 2.49;
    cashierSystem.products.add(product);

    Product product2 = new Product();
    product2.productId = 389;
    product2.description = "Butter";
    product2.price = 1.79;
    cashierSystem.products.add(product2);

    Product product3 = new Product();
    product3.productId = 740;
    product3.description = "Milch";
    product3.price = 1.19;
    cashierSystem.products.add(product3);

    /* Anmeldung */
    System.out.print("Gib bitte Deine Nummer ein: ");
    int cashierId = sc.nextInt();

    cashierSystem.login(cashierId);

    /* Einkaufe registrieren */
    cashierSystem.createShoppingCart();

    boolean loop = true;
    while (loop) {
      System.out.print("Produktnummer: ");
      int productId = sc.nextInt();
      System.out.print("Menge: ");
      int amount = sc.nextInt();
      cashierSystem.addShoppingCartItem(productId, amount);

      System.out.print("Weitermachen (true, false)?: ");
      loop = sc.nextBoolean();
    }

    /* Bon ausdrucken */
    cashierSystem.printBon();

  }

}
