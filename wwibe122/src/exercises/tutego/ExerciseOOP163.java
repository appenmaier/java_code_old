package exercises.tutego;

import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Radio_v10;
import exercises.tutego.radio.Ship_v2;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP163 {

  public static void main(String[] args) {

    Ship_v2 ship = new Ship_v2();
    Radio_v10 radio1 = new Radio_v10();
    Radio_v10 radio2 = new Radio_v10();
    IceMachine iceMachine = new IceMachine();

    radio1.on();
    iceMachine.on();

    ship.addAllElectronicDevices(radio1, radio2, iceMachine);

    System.out.println(ship.toString());

  }

}
