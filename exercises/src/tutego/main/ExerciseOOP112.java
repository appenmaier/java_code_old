package tutego.main;

import tutego.model.Radio;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.1.2
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class ExerciseOOP112 {

  public static void main(String[] args) {

    Radio radio = new Radio();

    System.out.println(radio.toString());

    radio.on();
    radio.volumeUp();
    radio.volumeUp();
    radio.volumeUp();

    System.out.println(radio.toString());

    radio.volumeDown();
    radio.off();

    System.out.println(radio.toString());

    /* version 1.0: radio.volume = 11; radio.isOn = true; */

    System.out.println(radio.toString());

  }

}
