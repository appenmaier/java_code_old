package exercises.tutego;

import exercises.tutego.radio.Radio_v4;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.1.4
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP114 {

  public static void main(String[] args) {

    Radio_v4 radio = new Radio_v4();

    System.out.println(radio.toString());

    radio.on();
    radio.volumeUp();
    radio.volumeUp();
    radio.volumeUp();
    radio.setFrequency(107.2);

    System.out.println(radio.toString());

    radio.volumeDown();
    radio.off();

    System.out.println(radio.toString());

  }

}
