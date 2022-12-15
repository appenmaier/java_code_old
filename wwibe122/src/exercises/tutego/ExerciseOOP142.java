package exercises.tutego;

import exercises.tutego.radio.Radio_v7;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.4.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP142 {

  public static void main(String[] args) {

    Radio_v7 radio1 = new Radio_v7("DASDING");
    radio1.on();
    radio1.volumeUp();
    radio1.volumeUp();

    Radio_v7 radio2 = new Radio_v7(radio1);

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());

  }

}
