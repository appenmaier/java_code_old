package exercises.tutego;

import exercises.tutego.radio.Radio_v5;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.2.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP121 {

  public static void main(String[] args) {

    Radio_v5 radio = new Radio_v5();

    System.out.println(radio.toString());

    radio.on();
    radio.volumeUp();
    radio.volumeUp();
    radio.volumeUp();
    double frequency = Radio_v5.senderToFrequency("DASDING");
    radio.setFrequency(frequency);

    System.out.println(radio.toString());

    radio.volumeDown();
    radio.off();

    System.out.println(radio.toString());

  }

}
