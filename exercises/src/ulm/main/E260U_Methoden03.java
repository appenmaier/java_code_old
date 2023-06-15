package ulm.main;

import java.util.Scanner;
import ulm.model.Printer;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf Aufgabe Methoden-3
 */
public class E260U_Methoden03 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte die Hoehe der Weihnachtsbaumkrone ein: ");
    int height = sc.nextInt();

    Printer.printChristmasTreeCrown(height);

    int stemHeight = height / 3;
    int stemWidth;
    if (height % 2 == 0) {
      stemWidth = (height * 2 - 1) / 3;
    } else {
      stemWidth = (height * 2 - 1) / 3 + 1;
    }
    int stemGap = (height * 2 - 1) / 3;
    Printer.printChristmasTreeStem(stemHeight, stemWidth, stemGap);

  }

}
