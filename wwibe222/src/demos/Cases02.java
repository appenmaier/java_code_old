package demos;

import java.util.Scanner;

/**
 * Bedingte Verzweigungen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Cases02 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    String ageText;

    System.out.print("Gib bitte Dein Alter ein: ");
    int age = sc.nextInt();

    if (age >= 18) {
      ageText = "volljährig";
    } else {
      ageText = "minderjährig";
    }

    ageText = age >= 18 ? "volljährig" : "minderjährig";

    System.out.println("Du bist " + ageText);

  }

}
