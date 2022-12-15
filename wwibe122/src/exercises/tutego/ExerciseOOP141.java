package exercises.tutego;

import exercises.tutego.radio.Radio_v6;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.4.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP141 {

  public static void main(String[] args) {

    Radio_v6 radio1 = new Radio_v6(107.2);
    Radio_v6 radio2 = new Radio_v6();
    Radio_v6 radio3 = new Radio_v6("DASDING");

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());
    System.out.println(radio3.toString());

  }

}
