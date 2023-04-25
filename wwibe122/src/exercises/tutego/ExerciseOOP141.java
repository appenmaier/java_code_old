package exercises.tutego;

import exercises.tutego.radio.Radio;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.4.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP141 {

  public static void main(String[] args) {

    Radio radio1 = new Radio(107.2);
    Radio radio2 = new Radio();
    Radio radio3 = new Radio("DASDING");

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());
    System.out.println(radio3.toString());

  }

}
