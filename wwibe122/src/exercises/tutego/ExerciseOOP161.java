package exercises.tutego;

import java.util.ArrayList;
import exercises.tutego.radio.v10.ElectronicDevice;
import exercises.tutego.radio.v10.IceMachine;
import exercises.tutego.radio.v10.Radio;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.6.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP161 {

  public static void main(String[] args) {

    ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();

    Radio radio = new Radio();
    IceMachine iceMachine = new IceMachine();

    electronicDevices.add(radio);
    electronicDevices.add(iceMachine);

    for (ElectronicDevice e : electronicDevices) {
      e.on();
      System.out.println(e.toString());
    }

  }

}
