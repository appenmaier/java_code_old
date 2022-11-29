package exercises.tutego;

import exercises.tutego.radio.v9.Modulation;
import exercises.tutego.radio.v9.Radio;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.3.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP132 {

  public static void main(String[] args) {

    Radio radio1 = new Radio("DASDING");
    radio1.setModulation(Modulation.FM);
    radio1.on();
    radio1.volumeUp();
    radio1.volumeUp();

    Radio radio2 = new Radio(radio1);

    System.out.println(radio1.toString());
    System.out.println(radio2.toString());

  }

}
