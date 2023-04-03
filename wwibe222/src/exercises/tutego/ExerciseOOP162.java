package exercises.tutego;

import exercises.tutego.radio.ElectronicDevice;
import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Radio10;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP162 {

  public static void main(String[] args) {

    Radio10 radio1 = new Radio10();
    Radio10 radio2 = new Radio10();
    IceMachine iceMachine = new IceMachine();

    radio1.on();
    iceMachine.on();

    int x = ElectronicDevice.numberOfElectronicDevicesSwitchedOn(radio1, iceMachine, radio2);
    System.out.println("x: " + x);

  }

}