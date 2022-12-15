package exercises.tutego;

import exercises.tutego.radio.TV_v2;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.8
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP168 {

  public static void main(String[] args) {

    TV_v2 tv = new TV_v2();

    tv.on();

    System.out.println(tv.toString());

  }

}
