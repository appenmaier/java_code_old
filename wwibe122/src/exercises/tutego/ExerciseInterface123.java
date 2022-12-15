package exercises.tutego;

import exercises.tutego.candy.CandyType_v3;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html Aufgabe
 * Interface-1.2.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface123 {

  public static void main(String[] args) {

    System.out.println("COTTON_CANDY.next(): " + CandyType_v3.COTTON_CANDY.next());
    System.out.println("LOOLIPOS.next(): " + CandyType_v3.LOLLIPOPS.next());
    System.out.println("CHEWING_GUMS.next(): " + CandyType_v3.CHEWING_GUMS.next());
    System.out.println("LICORICE.next(): " + CandyType_v3.LICORICE.next());
    System.out.println("GUMMIES.next(): " + CandyType_v3.GUMMIES.next());
    System.out.println("CHOCOLATE.next(): " + CandyType_v3.CHOCOLATE.next());
    System.out.println("CARAMELS.next(): " + CandyType_v3.CARAMELS.next());

  }

}
