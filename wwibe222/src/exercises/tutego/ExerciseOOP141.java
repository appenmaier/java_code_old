package exercises.tutego;

import exercises.tutego.radio.Radio06;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.4.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP141 {

  public static void main(String[] args) {

    Radio06 radio1 = new Radio06(107.2);
    Radio06 radio2 = new Radio06();
    Radio06 radio3 = new Radio06("DASDING");

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());
    System.out.println(radio3.toString());

  }

}
