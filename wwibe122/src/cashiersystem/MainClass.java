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

    String[] namesOfArticles;
    int[] amountsOfArticles;
    double[] pricesOfArticles;
    double[] totalPricesOfArticles;
    double totalPrice = 0.0;

    System.out.print("Wie viele Artikel moechtest Du eingeben?: ");
    int numberOfArticles = sc.nextInt();

    namesOfArticles = new String[numberOfArticles];
    amountsOfArticles = new int[numberOfArticles];
    pricesOfArticles = new double[numberOfArticles];
    totalPricesOfArticles = new double[numberOfArticles];

    for (int i = 0; i < numberOfArticles; i++) {
      System.out.print("Artikel: ");
      sc.nextLine();
      namesOfArticles[i] = sc.nextLine();
      System.out.print("Menge: ");
      amountsOfArticles[i] = sc.nextInt();
      System.out.print("Peis: ");
      pricesOfArticles[i] = sc.nextDouble();
      totalPricesOfArticles[i] = pricesOfArticles[i] * amountsOfArticles[i];
      totalPrice += totalPricesOfArticles[i];
    }

    /* Bon */
    System.out.println("Tante-Emma-Laden");
    System.out.println("03.11.2022");
    System.out.println();
    System.out.println("Artikel:");
    for (int i = 0; i < numberOfArticles; i++) {
      System.out.println(i + ": " + namesOfArticles[i] + ", " + amountsOfArticles[i] + ", "
          + pricesOfArticles[i] + ", " + totalPricesOfArticles[i]);
    }
    System.out.println("-----------------------------------------");
    System.out.println("Gesamtbetrag: " + totalPrice);

  }

}
