package exercises.tutego;

import exercises.tutego.radio.Radio_v10;
import exercises.tutego.radio.Ship_v2;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.4
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP164 {

  public static void main(String[] args) {

    Ship_v2 ship = new Ship_v2();
    Radio_v10 radio1 = new Radio_v10(107.2);
    Radio_v10 radio2 = new Radio_v10();
    Radio_v10 radio3 = new Radio_v10();

    radio1.on();
    radio1.volumeUp();
    radio3.volumeUp();

    ship.addAndCheckAllElectronicDevices(radio1, radio2, radio3);
    System.out.println(ship.toString());

  }

}
