package exercises.tutego;

import exercises.tutego.radio.Firebox;
import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Radio10;
import exercises.tutego.radio.Ship02;
import exercises.tutego.radio.TV02;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.7.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP171 {

  public static void main(String[] args) {

    Ship02 ship = new Ship02();
    Radio10 radio1 = new Radio10();
    Radio10 radio2 = new Radio10();
    IceMachine iceMachine = new IceMachine();
    TV02 tv = new TV02();
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
