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

    String nameOfArticle1, nameOfArticle2 = "", nameOfArticle3 = "";
    int amountOfArticle1, amountOfArticle2 = 0, amountOfArticle3 = 0;
    double priceOfArticle1, priceOfArticle2 = 0, priceOfArticle3 = 0;
    double totalPriceOfArticle1, totalPriceOfArticle2 = 0, totalPriceOfArticle3 = 0;
    double totalPrice;

    System.out.print("Wie viele Artikel moechtest Du eingeben?: ");
    int numberOfArticles = sc.nextInt();

    System.out.print("Artikelbezeichner (Artikel 1): ");
    sc.nextLine();
    nameOfArticle1 = sc.nextLine();
    System.out.print("Menge (Artikel 1): ");
    amountOfArticle1 = sc.nextInt();
    System.out.print("Peis (Artikel 1): ");
    priceOfArticle1 = sc.nextDouble();
    totalPriceOfArticle1 = priceOfArticle1 * amountOfArticle1;
    totalPrice = totalPriceOfArticle1;

    if (numberOfArticles > 1) {
      System.out.print("Artikelbezeichner (Artikel 2): ");
      sc.nextLine();
      nameOfArticle2 = sc.nextLine();
      System.out.print("Menge (Artikel 2): ");
      amountOfArticle2 = sc.nextInt();
      System.out.print("Peis (Artikel 2): ");
      priceOfArticle2 = sc.nextDouble();
      totalPriceOfArticle2 = priceOfArticle2 * amountOfArticle2;
      totalPrice += totalPriceOfArticle2;
    }

    if (numberOfArticles > 2) {
      System.out.print("Artikelbezeichner (Artikel 3): ");
      sc.nextLine();
      nameOfArticle3 = sc.nextLine();
      System.out.print("Menge (Artikel 3): ");
      amountOfArticle3 = sc.nextInt();
      System.out.print("Peis (Artikel 3): ");
      priceOfArticle3 = sc.nextDouble();
      totalPriceOfArticle3 = priceOfArticle3 * amountOfArticle3;
      totalPrice += totalPriceOfArticle3;
    }

    /* Bon */
    System.out.println("Tante-Emma-Laden");
    System.out.println("03.11.2022");
    System.out.println();
    System.out.println("Artikel:");
    System.out.println(nameOfArticle1 + ", " + amountOfArticle1 + ", " + priceOfArticle1 + ", "
        + totalPriceOfArticle1);
    if (numberOfArticles > 1) {
      System.out.println(nameOfArticle2 + ", " + amountOfArticle2 + ", " + priceOfArticle2 + ", "
          + totalPriceOfArticle2);
    }
    if (numberOfArticles > 2) {
      System.out.println(nameOfArticle3 + ", " + amountOfArticle3 + ", " + priceOfArticle3 + ", "
          + totalPriceOfArticle3);
    }
    System.out.println("-----------------------------------------");
    System.out.println("Gesamtbetrag: " + totalPrice);

  }

}
