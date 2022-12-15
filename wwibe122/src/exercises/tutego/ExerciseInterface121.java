package exercises.tutego;

import java.util.Scanner;
import exercises.tutego.candy.CandyType;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html Aufgabe
 * Interface-1.2.1
 * 
 * Hinweis: ohne Optional
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface121 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte eine Suessigkeitenart ein: ");
    String name = sc.nextLine();

    CandyType candyType = fromName(name);
    System.out.println("candyType: " + candyType);

  }

  public static CandyType fromName(String name) {
    String value;
    value = name.toUpperCase();
    value = value.replace(" ", "_");
    for (CandyType c : CandyType.values()) {
      if (c.name().equals(value)) {
        return c;
      }
    }
    return null;
  }

}
