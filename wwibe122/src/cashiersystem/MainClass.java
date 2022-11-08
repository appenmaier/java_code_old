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

    String nameOfArticle1, nameOfArticle2, nameOfArticle3;
    int amountOfArticle1, amountOfArticle2, amountOfArticle3;
    double priceOfArticle1, priceOfArticle2, priceOfArticle3;

    System.out.print("Artikelbezeichner (Artikel 1): ");
    nameOfArticle1 = sc.nextLine();
    System.out.print("Artikelbezeichner (Artikel 2): ");
    nameOfArticle2 = sc.nextLine();
    System.out.print("Artikelbezeichner (Artikel 3): ");
    nameOfArticle3 = sc.nextLine();

    System.out.print("Menge (Artikel 1): ");
    amountOfArticle1 = sc.nextInt();
    System.out.print("Menge (Artikel 2): ");
    amountOfArticle2 = sc.nextInt();
    System.out.print("Menge (Artikel 3): ");
    amountOfArticle3 = sc.nextInt();

    System.out.print("Peis (Artikel 1): ");
    priceOfArticle1 = sc.nextDouble();
    System.out.print("Peis (Artikel 2): ");
    priceOfArticle2 = sc.nextDouble();
    System.out.print("Peis (Artikel 3): ");
    priceOfArticle3 = sc.nextDouble();

    double totalPriceOfArticle1, totalPriceOfArticle2, totalPriceOfArticle3;

    totalPriceOfArticle1 = priceOfArticle1 * amountOfArticle1;
    totalPriceOfArticle2 = priceOfArticle2 * amountOfArticle2;
    totalPriceOfArticle3 = priceOfArticle3 * amountOfArticle3;

    double totalPrice = totalPriceOfArticle1 + totalPriceOfArticle2 + totalPriceOfArticle3;

    /* Bon */
    System.out.println("Tante-Emma-Laden");
    System.out.println("03.11.2022");
    System.out.println();
    System.out.println("Artikel:");
    System.out.println(nameOfArticle1 + ", " + amountOfArticle1 + ", " + priceOfArticle1 + ", "
        + totalPriceOfArticle1);
    System.out.println(nameOfArticle2 + ", " + amountOfArticle2 + ", " + priceOfArticle2 + ", "
        + totalPriceOfArticle2);
    System.out.println(nameOfArticle3 + ", " + amountOfArticle3 + ", " + priceOfArticle3 + ", "
        + totalPriceOfArticle3);
    System.out.println("-----------------------------------------");
    System.out.println("Gesamtbetrag: " + totalPrice);

  }

}
