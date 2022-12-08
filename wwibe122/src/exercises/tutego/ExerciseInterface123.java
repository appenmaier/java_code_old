package exercises.tutego;

import exercises.tutego.candy.v3.CandyType;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html Aufgabe
 * Interface-1.2.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface123 {

  public static void main(String[] args) {

    System.out.println("COTTON_CANDY.next(): " + CandyType.COTTON_CANDY.next());
    System.out.println("LOOLIPOS.next(): " + CandyType.LOLLIPOPS.next());
    System.out.println("CHEWING_GUMS.next(): " + CandyType.CHEWING_GUMS.next());
    System.out.println("LICORICE.next(): " + CandyType.LICORICE.next());
    System.out.println("GUMMIES.next(): " + CandyType.GUMMIES.next());
    System.out.println("CHOCOLATE.next(): " + CandyType.CHOCOLATE.next());
    System.out.println("CARAMELS.next(): " + CandyType.CARAMELS.next());

  }

}
