package exercises.tutego;

import exercises.tutego.radio.Firebox;
import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Radio_v10;
import exercises.tutego.radio.Ship_v2;
import exercises.tutego.radio.TV_v2;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.7.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP171 {

  public static void main(String[] args) {

    Ship_v2 ship = new Ship_v2();
    Radio_v10 radio1 = new Radio_v10();
    Radio_v10 radio2 = new Radio_v10();
    IceMachine iceMachine = new IceMachine();
    TV_v2 tv = new TV_v2();
    Firebox firebox1 = new Firebox();
    Firebox firebox2 = new Firebox();

    radio1.on();
    iceMachine.on();
    tv.on();

    ship.addAllElectronicDevices(radio1, radio2, iceMachine, tv, firebox1, firebox2);
    System.out.println(ship.toString());

    ship.holiday();
    System.out.println(ship.toString());

  }

}
