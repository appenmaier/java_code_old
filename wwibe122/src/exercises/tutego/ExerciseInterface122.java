package exercises.tutego;

import exercises.tutego.candy.CandyType_v2;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html Aufgabe
 * Interface-1.2.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface122 {

  public static void main(String[] args) {

    CandyType_v2 candyType = CandyType_v2.random();
    System.out.println("candyType: " + candyType);

  }

}
