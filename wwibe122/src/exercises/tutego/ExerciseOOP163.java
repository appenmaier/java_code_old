package exercises.tutego;

import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Radio10;
import exercises.tutego.radio.Ship02;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP163 {

  public static void main(String[] args) {

    Ship02 ship = new Ship02();
    Radio10 radio1 = new Radio10();
    Radio10 radio2 = new Radio10();
    IceMachine iceMachine = new IceMachine();

    radio1.on();
    iceMachine.on();

    ship.addAllElectronicDevices(radio1, radio2, iceMachine);

    System.out.println(ship.toString());

  }

}
