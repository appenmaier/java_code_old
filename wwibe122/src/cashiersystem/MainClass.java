package cashiersystem;

/**
 * Kassensystem
 * 
 * @author Daniel Appenmaier
 */
public class MainClass {

  public static void main(String[] args) {

    String nameOfArticle1, nameOfArticle2, nameOfArticle3;
    int amountOfArticle1, amountOfArticle2, amountOfArticle3;
    double priceOfArticle1, priceOfArticle2, priceOfArticle3;

    nameOfArticle1 = "Brot";
    nameOfArticle2 = "Milch";
    nameOfArticle3 = "Butter";

    amountOfArticle1 = 2;
    amountOfArticle2 = 6;
    amountOfArticle3 = 3;

    priceOfArticle1 = 2.49;
    priceOfArticle2 = 1.19;
    priceOfArticle3 = 2.29;

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
