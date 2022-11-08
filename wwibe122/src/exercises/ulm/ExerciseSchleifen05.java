package exercises.ulm;

import java.util.Scanner;
import helpers.Printer;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf Aufgabe Schleifen-5
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseSchleifen05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Anzahl Zeichen ein: ");
    int numberOfCharacters = sc.nextInt();

    Printer.printPattern(numberOfCharacters);

    System.out.print("Gib bitte eine Zeichenkette ein: ");
    String text = sc.next();

    Printer.printPatternWithText(text);

  }

}
