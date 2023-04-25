package exercises.tutego;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://tutego.de/javabuch/aufgaben/exception.html Aufgabe Exception-1.1.1
 * 
 * Hinweis: ohne java.nio.file.Files
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseException111 {

  public static void main(String[] args) {

    File file = new File("src/resources/family-names.txt");

    try {
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(file);

      int maxLength = 0;
      String longestName = "";

      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        // System.out.println(line + " (" + line.length() + ")" );
        if (line.length() > maxLength) {
          maxLength = line.length();
          longestName = line;
        }
      }

      System.out.println("longestName: " + longestName);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

}
