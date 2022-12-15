package exercises.tutego;

import exercises.tutego.candy.CandyType03;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html Aufgabe
 * Interface-1.2.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface123 {

  public static void main(String[] args) {

    System.out.println("COTTON_CANDY.next(): " + CandyType03.COTTON_CANDY.next());
    System.out.println("LOOLIPOS.next(): " + CandyType03.LOLLIPOPS.next());
    System.out.println("CHEWING_GUMS.next(): " + CandyType03.CHEWING_GUMS.next());
    System.out.println("LICORICE.next(): " + CandyType03.LICORICE.next());
    System.out.println("GUMMIES.next(): " + CandyType03.GUMMIES.next());
    System.out.println("CHOCOLATE.next(): " + CandyType03.CHOCOLATE.next());
    System.out.println("CARAMELS.next(): " + CandyType03.CARAMELS.next());

  }

}
