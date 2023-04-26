package exercises.koblenz;


import java.util.Scanner;

/**
 * https://www.uni-koblenz-landau.de/de/koblenz/fb4/ist/rgebert/teaching/SS08/java-programming/programmieraufgaben.pdf/view
 * Aufgabe A4
 */
public class ExerciseA4 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib bitte Deinen Vornamen ein: ");
    String firstName = scanner.next();

    System.out.print("Gib bitte Deinen Nachnamen ein: ");
    String familyName = scanner.next();

    System.out.println(familyName + ", " + firstName);

  }

}
