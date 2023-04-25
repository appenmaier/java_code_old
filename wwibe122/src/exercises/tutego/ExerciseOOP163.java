package exercises.tutego;

import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Radio;
import exercises.tutego.radio.Ship;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP163 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    Radio radio1 = new Radio();
    Radio radio2 = new Radio();
    IceMachine iceMachine = new IceMachine();

    radio1.on();
    iceMachine.on();

    ship.addAllElectronicDevices(radio1, radio2, iceMachine);

    System.out.println(ship.toString());

  }

}
