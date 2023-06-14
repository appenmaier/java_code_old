package tutego.main;

import java.util.Scanner;
import tutego.model.CoinMachine;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.3.4
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ134 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte den Betrag in Liretta ein: ");
    double amount = sc.nextDouble();

    CoinMachine.printCoins(amount);

  }

}
