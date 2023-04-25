package exercises.tutego;

import exercises.tutego.radio.IceMachine;
import exercises.tutego.radio.Ship;
import exercises.tutego.radio.TV;

/**
 * https://tutego.de/javabuch/aufgaben/interface_enum_sealed_classes_record.html Aufgabe
 * Interface-1.1.5
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseInterface115 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    TV tv1 = new TV();
    TV tv2 = new TV();
    IceMachine iceMachine = new IceMachine();

    tv1.setWatt(80);
    tv2.setWatt(120);
    iceMachine.setWatt(150);

    ship.addAllElectronicDevices(tv1, tv2, iceMachine);
    ship.removePowerConsumingElectronicDevices();

    System.out.println(ship.toString());

  }

}
