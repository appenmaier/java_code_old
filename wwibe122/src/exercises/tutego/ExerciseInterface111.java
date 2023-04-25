package exercises.tutego;

import exercises.tutego.radio.ElectronicDeviceWattComparator;
import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Radio;
import exercises.tutego.radio.TV;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html Aufgabe
 * Interface-1.1.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface111 {

  public static void main(String[] args) {

    Radio radio1 = new Radio();
    radio1.setWatt(15);

    IceMachine iceMachine = new IceMachine();
    iceMachine.setWatt(150);

    TV tv = new TV();
    tv.setWatt(80);

    ElectronicDeviceWattComparator comparator = new ElectronicDeviceWattComparator();

    int result;

    result = comparator.compare(radio1, iceMachine);
    System.out.println("result: " + result);
    System.out.println();

    result = comparator.compare(iceMachine, tv);
    System.out.println("result: " + result);
    System.out.println();

    result = comparator.compare(tv, radio1);
    System.out.println("result: " + result);
    System.out.println();

  }

}
