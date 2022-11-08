package exercises.tutego;

import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.4.2
 * 
 * Hinweis: Aufgabestellung etwas unklar
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ142 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte den Wert fuer den Dealer ein: ");
    int dealerPoints = sc.nextInt();

    System.out.print("Gib bitte den Wert fuer den Spieler ein: ");
    int playerPoints = sc.nextInt();

    if (dealerPoints < 2 || playerPoints < 2) {
      System.err.print("Ungueltige Eingabe");
      return;
    }

    if (dealerPoints > 21 && playerPoints > 21 || dealerPoints == playerPoints) {
      System.out.println("Keiner gewinnt");
    } else if (dealerPoints > 21 || Math.abs(21 - dealerPoints) > Math.abs(21 - playerPoints)) {
      System.out.println("Spieler gewinnt");
    } else if (playerPoints > 21 || Math.abs(21 - dealerPoints) < Math.abs(21 - playerPoints)) {
      System.out.println("Dealer gewinnt");
    }

  }

}
