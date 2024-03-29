package exercises.tutego;

import exercises.tutego.radio.v7.Radio;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.4.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP142 {

  public static void main(String[] args) {

    Radio radio1 = new Radio("DASDING");
    radio1.on();
    radio1.volumeUp();
    radio1.volumeUp();

    Radio radio2 = new Radio(radio1);

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());

  }

}
