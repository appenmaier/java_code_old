package tutego.main;

import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.4.5
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ145 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Bejahung ein: ");
    String input = sc.nextLine();

    switch (input) {
      case "ay":
      case "aye":
      case "ay, ay":
      case "ja":
      case "jo":
        System.out.println("Keep it up!");
        break;
      default:
        System.out.println("Don't you dare!");
        break;
    }

  }

}
