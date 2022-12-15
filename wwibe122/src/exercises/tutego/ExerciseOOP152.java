package exercises.tutego;

import exercises.tutego.radio.Radio_v9;
import exercises.tutego.radio.Ship;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.5.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP152 {

  public static void main(String[] args) {

    Ship ship = new Ship();

    Radio_v9 radio1 = new Radio_v9();
    Radio_v9 radio2 = new Radio_v9(107.2);
    Radio_v9 radio3 = new Radio_v9("DASDING");

    radio1.on();
    radio3.on();

    ship.addAllRadios(radio1, radio2, radio3);

    System.out.println(ship.toString());

  }

}
