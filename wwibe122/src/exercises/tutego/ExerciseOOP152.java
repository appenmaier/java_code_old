package exercises.tutego;

import exercises.tutego.radio.Radio;
import exercises.tutego.radio.Ship;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.5.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP152 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    Ship ship = new Ship();

    Radio radio1 = new Radio();
    Radio radio2 = new Radio(107.2);
    Radio radio3 = new Radio("DASDING");

    radio1.on();
    radio3.on();

    /* Outdated */
    // ship.addAllRadios(radio1, radio2, radio3);

    System.out.println(ship.toString());

  }

}
